package ec.com.todocompu.shrimpweb.service;

import static ec.com.todocompu.utilidades.UtilAplicacion.desencriptar;
import static ec.com.todocompu.utilidades.UtilAplicacion.presentaMensaje;
import static ec.com.todocompu.utilidades.UtilFile.crearXmlFromByte;
import static ec.com.todocompu.utilidades.UtilFile.crearZip;
import static ec.com.todocompu.utilidades.UtilFile.generarComprobantePdfFromXml;
import static ec.com.todocompu.utilidades.UtilMail.envioCorreo;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.todocompu.shrimpweb.dao.ComprobanteElectronicoDao;
import ec.com.todocompu.shrimpweb.dao.InvClienteDao;
import ec.com.todocompu.shrimpweb.dao.InvProveedorDao;
import ec.com.todocompu.shrimpweb.dao.SisEmpresaDao;
import ec.com.todocompu.shrimpweb.entity.ComprobanteElectronico;
import ec.com.todocompu.shrimpweb.entity.InvCliente;
import ec.com.todocompu.shrimpweb.entity.InvProveedor;
import ec.com.todocompu.shrimpweb.entity.SisEmpresa;

@Service
public class DocumentoElectronicoServiceImpl implements
		DocumentoElectronicoService, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ComprobanteElectronicoDao comprobanteElectronicoDao;

	@Autowired
	private SisEmpresaDao sisEmpresaDao;

	@Autowired
	private InvClienteDao invClienteDao;

	@Autowired
	private InvProveedorDao invProveedorDao;

	@Override
	public List<ComprobanteElectronico> obtenerDocumentosPorCedulaRucMesAnio(
			String cedulaRuc, String mes, String anio) {
		List<ComprobanteElectronico> listaComprobanteElectronico = null;

		if (cedulaRuc.isEmpty()) {
			presentaMensaje(FacesMessage.SEVERITY_INFO,
					"INGRESE UN NÚMERO DE CÉDULA");
		} else if (mes.compareTo("00") == 0) {
			presentaMensaje(FacesMessage.SEVERITY_INFO, "ESCOJA UN MES");
		} else if (anio.compareTo("0000") == 0) {
			presentaMensaje(FacesMessage.SEVERITY_INFO, "ESCOJA UN AÑO");
		} else {
			listaComprobanteElectronico = comprobanteElectronicoDao
					.obtenerLista(
							"select new ComprobanteElectronico("
									+ "a.eClaveAcceso, c.empCodigo, (select e.empNombre from SisEmpresa e where e.empCodigo=c.empCodigo), "
									+ "case when substring(a.eClaveAcceso,9,2)='01' then 'FACTURA' "
									+ "when substring(a.eClaveAcceso,9,2)='04' then 'NOTA DÉBITO' "
									+ "when substring(a.eClaveAcceso,9,2)='05' then 'NOTA CRÉDITO'"
									+ "when substring(a.eClaveAcceso,9,2)='07' then 'RETENCIÓN' end, "
									+ "substring(a.eClaveAcceso,25,3)||'-'||substring(a.eClaveAcceso,28,3)||'-'||substring(a.eClaveAcceso,31,8), "
									+ "substring(a.eClaveAcceso,1,2)||'/'||substring(a.eClaveAcceso,3,2)||'/'||substring(a.eClaveAcceso,5,4), "
									+ "a.eAutorizacionFecha, a.eAutorizacionNumero, a.eXml) "
									+ "from AnxCompraElectronica a "
									+ "inner join a.invCompra c "
									+ "inner join c.invProveedor p "
									+ "where p.provIdNumero=?1 "
									+ "and substring(a.id.ePeriodo,6,2)=?2 "
									+ "and substring(a.id.ePeriodo,1,4)=?3 "
									+ "and a.eEstado='AUTORIZADO'",
							new Object[] { cedulaRuc, mes, anio }, false,
							new Object[] {});

			listaComprobanteElectronico
					.addAll(comprobanteElectronicoDao
							.obtenerLista(
									"select new ComprobanteElectronico("
											+ "a.eClaveAcceso, v.empCodigo, (select e.empNombre from SisEmpresa e where e.empCodigo=v.empCodigo), "
											+ "case when substring(a.eClaveAcceso,9,2)='01' then 'FACTURA' "
											+ "when substring(a.eClaveAcceso,9,2)='04' then 'NOTA DÉBITO' "
											+ "when substring(a.eClaveAcceso,9,2)='05' then 'NOTA CRÉDITO'"
											+ "when substring(a.eClaveAcceso,9,2)='07' then 'RETENCIÓN' end, "
											+ "substring(a.eClaveAcceso,25,3)||'-'||substring(a.eClaveAcceso,28,3)||'-'||substring(a.eClaveAcceso,31,8), "
											+ "substring(a.eClaveAcceso,1,2)||'/'||substring(a.eClaveAcceso,3,2)||'/'||substring(a.eClaveAcceso,5,4), "
											+ "a.eAutorizacionFecha, a.eAutorizacionNumero, a.eXml) "
											+ "from AnxVentaElectronica a "
											+ "inner join a.invVenta v "
											+ "inner join v.invCliente c "
											+ "where c.cliIdNumero=?1 "
											+ "and substring(a.id.ePeriodo,6,2)=?2 "
											+ "and substring(a.id.ePeriodo,1,4)=?3 "
											+ "and a.eEstado='AUTORIZADO'",
									new Object[] { cedulaRuc, mes, anio },
									false, new Object[] {}));

			if (listaComprobanteElectronico.isEmpty())
				presentaMensaje(FacesMessage.SEVERITY_INFO,
						"NO HAY COMPROBANTES EN ESTE PERIODO");

		}

		return listaComprobanteElectronico;
	}

	public void enviarComprobantes(String cedulaRuc,
			List<ComprobanteElectronico> comprobantes, String mes, String anio) {
		if (comprobantes == null || comprobantes.isEmpty()) {
			presentaMensaje(FacesMessage.SEVERITY_INFO,
					"Escoja al menos un comprobante");
		} else {
			quickSortComprobantesElectronicosPorEmpresas(comprobantes, 0,
					comprobantes.size() - 1);
			List<String> archivos = new ArrayList<String>();
			String emails = null;
			String nombreUsuario = null;

			for (int i = 0; i < comprobantes.size(); i++) {
				// VER SI EL CLIENTE O PROVEEDOR TIENE EMAILS
				if (emails == null) {
					InvCliente invCliente = invClienteDao
							.obtenerObjeto(
									"select c from InvCliente c where c.cliIdNumero=?1 and c.id.cliEmpresa=?2",
									new Object[] {
											cedulaRuc,
											comprobantes.get(i)
													.getCodigoEmpresa().trim() },
									false, new Object[] {});

					if (invCliente != null) {
						nombreUsuario = invCliente.getCliNombre().trim();
						if (invCliente.getCliEmail() != null)
							emails = invCliente.getCliEmail().trim();
					} else {
						InvProveedor invProveedor = invProveedorDao
								.obtenerObjeto(
										"select p from InvProveedor p where p.provIdNumero=?1 and p.id.provEmpresa=?2",
										new Object[] {
												cedulaRuc,
												comprobantes.get(i)
														.getCodigoEmpresa()
														.trim() }, false,
										new Object[] {});
						nombreUsuario = invProveedor.getProvRazonSocial()
								.trim();
						if (invProveedor.getProvEmail() != null)
							emails = invProveedor.getProvEmail().trim();
					}
				}
				// SI TIENE EMAILS GENERAR EL XML Y EL PDF
				if (emails == null) {
					presentaMensaje(FacesMessage.SEVERITY_INFO,
							"NO TIENE CORREOS REGISTRADOS EN LA EMPRESA "
									+ comprobantes.get(i).getEmpresa().trim());
				} else {
					if (i < comprobantes.size() - 1
							&& comprobantes
									.get(i)
									.getCodigoEmpresa()
									.compareTo(
											comprobantes.get(i + 1)
													.getCodigoEmpresa()) == 0) {
						crearXmlFromByte(comprobantes.get(i).getClaveAcceso(),
								comprobantes.get(i).geteXml());
						generarComprobantePdfFromXml(comprobantes.get(i)
								.getClaveAcceso(), comprobantes.get(i)
								.getNumeroAutorizacion(), comprobantes.get(i)
								.getFechaAutorizacionFormateado());
						archivos.add(comprobantes.get(i).getClaveAcceso()
								.trim());
					} else {
						crearXmlFromByte(comprobantes.get(i).getClaveAcceso(),
								comprobantes.get(i).geteXml());
						generarComprobantePdfFromXml(comprobantes.get(i)
								.getClaveAcceso(), comprobantes.get(i)
								.getNumeroAutorizacion(), comprobantes.get(i)
								.getFechaAutorizacionFormateado());
						archivos.add(comprobantes.get(i).getClaveAcceso()
								.trim());

						SisEmpresa empresa = sisEmpresaDao
								.obtenerObjeto(
										"select e from SisEmpresa e where e.empCodigo=?1",
										new Object[] { comprobantes.get(i)
												.getCodigoEmpresa() }, false,
										new Object[] {});

						String nombreZip = "comprobantesElectronicos-"
								+ empresa.getEmpNombre().trim() + "-" + mes
								+ "-" + anio;

						crearZip(nombreZip, archivos);

						if (emails.length() != 0) {
							construirCorreoComprobantesElectronicos(emails,
									nombreZip, empresa.getEmpEmail(),
									desencriptar(empresa.getEmpClave().trim()),
									empresa.getEmpRazonSocial().trim(),
									nombreUsuario, mes + "-" + anio);
						}

						archivos = new ArrayList<String>();
						emails = null;
						nombreUsuario = null;
					}
				}

			}
		}
	}

	public void construirCorreoComprobantesElectronicos(String emails,
			String nombreZip, String emailEmisor, String passEmail,
			String nombreEstablecimiento, String razonSocial, String periodo) {

		String asunto = "DOCUMENTOS EMITIDOS POR " + nombreEstablecimiento;

		String detalle = "Estimado(a)"
				+ "\n\n"
				+ razonSocial
				+ ","
				+ "\n\nReciba un atento saludo de parte de "
				+ nombreEstablecimiento
				+ "."
				+ "\n\nEl presente correo es para notificarle la generacion de su documentos electronicos los mismos que se encuentran disponibles en "
				+ "nuestro Portal de Documentos Electrónicos y en el Portal del SRI para su consulta y descarga."
				+ "\n\nDocumentos del periodo: " + periodo
				+ "\n\n\nCON EL APOYO TECNOLÓGICO DE TODOCOMPU";

		List<File> listAdjunto = new ArrayList<File>();
		listAdjunto.add(new File(System.getProperty("java.io.tmpdir") + "/"
				+ nombreZip + ".zip"));

		try {
			envioCorreo(emails, asunto, detalle, listAdjunto, emailEmisor,
					passEmail);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void quickSortComprobantesElectronicosPorEmpresas(
			List<ComprobanteElectronico> A, int izq, int der) {

		String pivote = A.get(izq).getCodigoEmpresa().trim();
		int i = izq;
		int j = der;
		while (i < j) {
			while (A.get(i).getCodigoEmpresa().trim().compareTo(pivote) < 0
					&& i < j)
				i++;
			while (A.get(j).getCodigoEmpresa().trim().compareTo(pivote) > 0)
				j--;
			if (i < j) {
				String auxClaveAcceso = A.get(i).getClaveAcceso();
				String auxCodigoEmpresa = A.get(i).getCodigoEmpresa();
				String auxEmpresa = A.get(i).getEmpresa();
				String auxTipoDocumento = A.get(i).getTipoDocumento();
				String auxNumeroDocumento = A.get(i).getNumeroDocumento();
				String auxFechaEmision = A.get(i).getFechaEmision();
				Date auxFechaAutorizacion = A.get(i).getFechaAutorizacion();

				A.get(i).setClaveAcceso(A.get(j).getClaveAcceso());
				A.get(i).setCodigoEmpresa(A.get(j).getCodigoEmpresa());
				A.get(i).setEmpresa(A.get(j).getEmpresa());
				A.get(i).setTipoDocumento(A.get(j).getTipoDocumento());
				A.get(i).setNumeroDocumento(A.get(j).getNumeroDocumento());
				A.get(i).setFechaEmision(A.get(j).getFechaEmision());
				A.get(i).setFechaAutorizacion(A.get(j).getFechaAutorizacion());

				A.get(j).setClaveAcceso(auxClaveAcceso);
				A.get(j).setCodigoEmpresa(auxCodigoEmpresa);
				A.get(j).setEmpresa(auxEmpresa);
				A.get(j).setTipoDocumento(auxTipoDocumento);
				A.get(j).setNumeroDocumento(auxNumeroDocumento);
				A.get(j).setFechaEmision(auxFechaEmision);
				A.get(j).setFechaAutorizacion(auxFechaAutorizacion);
			}
		}
		if (izq < j - 1)
			quickSortComprobantesElectronicosPorEmpresas(A, izq, j - 1);
		if (j + 1 < der)
			quickSortComprobantesElectronicosPorEmpresas(A, j + 1, der);
	}
}

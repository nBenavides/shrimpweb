package ec.com.todocompu.shrimpweb.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.todocompu.shrimpweb.dao.ComprobanteElectronicoDao;
import ec.com.todocompu.shrimpweb.entity.ComprobanteElectronico;

@Service
public class DocumentoElectronicoServiceImpl implements
		DocumentoElectronicoService, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ComprobanteElectronicoDao comprobanteElectronicoDao;

	@Override
	public List<ComprobanteElectronico> obtenerDocumentosPorCedulaRucMesAnio(
			String cedulaRuc, String mes, String anio) {
		List<ComprobanteElectronico> listaComprobanteElectronico;
		listaComprobanteElectronico = comprobanteElectronicoDao.obtenerLista(
				"select new ComprobanteElectronico("
						+ "a.eClaveAcceso, a.id.eEmpresa, "
						+ "a.eAutorizacionFecha, a.eXml) "
						+ "from AnxCompraElectronica a "
						+ "inner join a.invCompra c "
						+ "inner join c.invProveedor p "
						+ "where p.provIdNumero=?1 "
						+ "and substring(a.id.ePeriodo,6,2)=?2 "
						+ "and substring(a.id.ePeriodo,1,4)=?3 "
						+ "and a.eEstado='AUTORIZADO'", new Object[] {
						cedulaRuc, mes, anio }, false, new Object[] {});

		listaComprobanteElectronico.addAll(comprobanteElectronicoDao
				.obtenerLista("select new ComprobanteElectronico("
						+ "a.eClaveAcceso, a.id.eEmpresa, "
						+ "a.eAutorizacionFecha, a.eXml) "
						+ "from AnxVentaElectronica a "
						+ "inner join a.invVenta v "
						+ "inner join v.invCliente c "
						+ "where c.cliIdNumero=?1 "
						+ "and substring(a.id.ePeriodo,6,2)=?2 "
						+ "and substring(a.id.ePeriodo,1,4)=?3 "
						+ "and a.eEstado='AUTORIZADO'", new Object[] {
						cedulaRuc, mes, anio }, false, new Object[] {}));

		return listaComprobanteElectronico;
	}

}

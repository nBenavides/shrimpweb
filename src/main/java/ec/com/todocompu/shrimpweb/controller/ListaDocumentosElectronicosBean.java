package ec.com.todocompu.shrimpweb.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ec.com.todocompu.shrimpweb.entity.ComprobanteElectronico;
import ec.com.todocompu.shrimpweb.service.DocumentoElectronicoService;
import ec.com.todocompu.shrimpweb.service.InvClienteService;
import ec.com.todocompu.shrimpweb.service.InvProveedorService;
import ec.com.todocompu.utilidades.enumerador.Anio;
import ec.com.todocompu.utilidades.enumerador.Mes;

@Controller
@Scope("session")
public class ListaDocumentosElectronicosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private DocumentoElectronicoService documentoElectronicoService;

	@Autowired
	private InvClienteService invClienteService;

	@Autowired
	private InvProveedorService invProveedorService;

	private String cedulaRuc;
	private String mes;
	private String anio;
	private String clienteProveedor;

	private List<ComprobanteElectronico> listaComprobantesElectronicos;
	private List<ComprobanteElectronico> listaComprobantesElectronicosSeleccionados;

	public ListaDocumentosElectronicosBean() {
	}

	public String getClienteProveedor() {
		return clienteProveedor;
	}

	public void setClienteProveedor(String clienteProveedor) {
		this.clienteProveedor = clienteProveedor;
	}

	public Mes[] getMeses() {
		return Mes.values();
	}

	public Anio[] getAnios() {
		return Anio.values();
	}

	public String getCedulaRuc() {
		return cedulaRuc;
	}

	public void setCedulaRuc(String cedulaRuc) {
		this.cedulaRuc = cedulaRuc;
	}

	public String getMes() {
		return mes;
	}

	public List<ComprobanteElectronico> getListaComprobantesElectronicosSeleccionados() {
		return listaComprobantesElectronicosSeleccionados;
	}

	public void setListaComprobantesElectronicosSeleccionados(
			List<ComprobanteElectronico> listaComprobantesElectronicosSeleccionados) {
		this.listaComprobantesElectronicosSeleccionados = listaComprobantesElectronicosSeleccionados;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public List<ComprobanteElectronico> getListaComprobantesElectronicos() {
		return listaComprobantesElectronicos;
	}

	public void setListaComprobantesElectronicos(
			List<ComprobanteElectronico> listaComprobantesElectronicos) {
		this.listaComprobantesElectronicos = listaComprobantesElectronicos;
	}

	public void obtener() {
		listaComprobantesElectronicos = documentoElectronicoService
				.obtenerDocumentosPorCedulaRucMesAnio(cedulaRuc, mes, anio);

		if (listaComprobantesElectronicos != null) {
			clienteProveedor = invClienteService.obtenerPorCedulaRuc(cedulaRuc);
			if (clienteProveedor == null)
				clienteProveedor = invProveedorService.obtenerPorRuc(cedulaRuc);
		}
	}

	public void enviarComprobantes() {
		documentoElectronicoService.enviarComprobantes(cedulaRuc,
				listaComprobantesElectronicosSeleccionados, mes, anio);
	}

}

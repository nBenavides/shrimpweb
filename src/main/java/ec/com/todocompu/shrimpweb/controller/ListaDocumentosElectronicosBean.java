package ec.com.todocompu.shrimpweb.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ec.com.todocompu.shrimpweb.entity.ComprobanteElectronico;
import ec.com.todocompu.shrimpweb.service.DocumentoElectronicoService;

@Controller
@Scope("session")
public class ListaDocumentosElectronicosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private DocumentoElectronicoService documentoElectronicoService;

	private String cedulaRuc;
	private String mes;
	private String anio;
	private String clienteProveedor;

	private List<ComprobanteElectronico> listaComprobantesElectronicos;
	private List<ComprobanteElectronico> listaComprobantesElectronicosSeleccionados;

	public ListaDocumentosElectronicosBean() {
		cedulaRuc = "1791952359001";
		clienteProveedor = "Camaronera La Santa Concordia de la isla perdida";
	}

	public String getClienteProveedor() {
		return clienteProveedor;
	}

	public void setClienteProveedor(String clienteProveedor) {
		this.clienteProveedor = clienteProveedor;
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

	}
}

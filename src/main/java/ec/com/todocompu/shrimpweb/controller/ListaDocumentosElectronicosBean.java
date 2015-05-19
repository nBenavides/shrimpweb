package ec.com.todocompu.shrimpweb.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

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

	public ListaDocumentosElectronicosBean() {
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

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public void buscarDocumentosElectronicos() {
		documentoElectronicoService.obtenerDocumentosPorCedulaRucMesAnio(
				cedulaRuc, mes, anio);

	}
}

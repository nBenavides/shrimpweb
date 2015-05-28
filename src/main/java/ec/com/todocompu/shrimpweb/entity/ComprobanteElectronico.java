package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ComprobanteElectronico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String claveAcceso;
	private String codigoEmpresa;
	private String empresa;
	private String tipoDocumento;
	private String numeroDocumento;
	private String fechaEmision;
	private Date fechaAutorizacion;
	private String numeroAutorizacion;
	private byte[] eXml;

	public ComprobanteElectronico() {
	}

	public ComprobanteElectronico(String claveAcceso, String codigoEmpresa,
			String empresa, String tipoDocumento, String numeroDocumento,
			String fechaEmision, Date fechaAutorizacion,
			String numeroAutorizacion, byte[] eXml) {
		super();
		this.claveAcceso = claveAcceso;
		this.codigoEmpresa = codigoEmpresa;
		this.empresa = empresa;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.fechaEmision = fechaEmision;
		this.fechaAutorizacion = fechaAutorizacion;
		this.numeroAutorizacion = numeroAutorizacion;
		this.eXml = eXml;
	}

	public String getNumeroAutorizacion() {
		return numeroAutorizacion;
	}

	public void setNumeroAutorizacion(String numeroAutorizacion) {
		this.numeroAutorizacion = numeroAutorizacion;
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getClaveAcceso() {
		return claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaAutorizacion() {
		return fechaAutorizacion;
	}

	public String getFechaAutorizacionFormateado() {
		return new SimpleDateFormat("dd/MM/yyyy").format(fechaAutorizacion);
	}

	public void setFechaAutorizacion(Date fechaAutorizacion) {
		this.fechaAutorizacion = fechaAutorizacion;
	}

	public byte[] geteXml() {
		return eXml;
	}

	public void seteXml(byte[] eXml) {
		this.eXml = eXml;
	}
}

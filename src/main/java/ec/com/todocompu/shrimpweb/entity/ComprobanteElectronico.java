package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ComprobanteElectronico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String eClaveAcceso;
	private String eEmpresa;
	private Date eAutorizacionFecha;
	private byte[] eXml;

	public ComprobanteElectronico() {
	}

	public ComprobanteElectronico(String eClaveAcceso, String eEmpresa,
			Date eAutorizacionFecha, byte[] eXml) {
		super();
		this.eClaveAcceso = eClaveAcceso;
		this.eEmpresa = eEmpresa;
		this.eAutorizacionFecha = eAutorizacionFecha;
		this.eXml = eXml;
	}

	public Date geteAutorizacionFecha() {
		return eAutorizacionFecha;
	}

	public void seteAutorizacionFecha(Date eAutorizacionFecha) {
		this.eAutorizacionFecha = eAutorizacionFecha;
	}

	public String geteClaveAcceso() {
		return eClaveAcceso;
	}

	public void seteClaveAcceso(String eClaveAcceso) {
		this.eClaveAcceso = eClaveAcceso;
	}

	public String geteEmpresa() {
		return eEmpresa;
	}

	public void seteEmpresa(String eEmpresa) {
		this.eEmpresa = eEmpresa;
	}

	public byte[] geteXml() {
		return eXml;
	}

	public void seteXml(byte[] eXml) {
		this.eXml = eXml;
	}

}

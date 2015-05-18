package ec.com.todocompu.shrimpsoftweb.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sis_pcs", schema = "sistemaweb")
public class SisPcs implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Date usrFechaInsertaPc;
	private String infMac;
	private String infIp;
	private String infNombre;
	private String infDescripcion;
	private String infReporteRutaDefault;
	private String infReporteFactura;
	private String infReporteNotaCredito;
	private String infReporteLiquidacion;
	private String infReporteRetencion;
	private String infReporteGuiaRemision;
	private String infKeystoreRuta;
	private String infKeystorePassword;
	private boolean infEstado;
	private String usrCodigo;

	public SisPcs() {
	}

	public SisPcs(String infMac, String infIp, String infNombre,
			String infReporteRutaDefault, String infReporteFactura,
			String infReporteNotaCredito, String infReporteLiquidacion,
			String infReporteRetencion, String infReporteGuiaRemision,
			String infKeystoreRuta, String infKeystorePassword,
			boolean infEstado, String usrCodigo, Date usrFechaInsertaPc) {
		this.infMac = infMac;
		this.infIp = infIp;
		this.infNombre = infNombre;
		this.infReporteRutaDefault = infReporteRutaDefault;
		this.infReporteFactura = infReporteFactura;
		this.infReporteNotaCredito = infReporteNotaCredito;
		this.infReporteLiquidacion = infReporteLiquidacion;
		this.infReporteRetencion = infReporteRetencion;
		this.infReporteGuiaRemision = infReporteGuiaRemision;
		this.infKeystoreRuta = infKeystoreRuta;
		this.infKeystorePassword = infKeystorePassword;
		this.infEstado = infEstado;
		this.usrCodigo = usrCodigo;
		this.usrFechaInsertaPc = usrFechaInsertaPc;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof SisPcs)) {
			return false;
		}
		SisPcs other = (SisPcs) object;
		if ((this.infMac == null && other.infMac != null)
				|| (this.infMac != null && !this.infMac.equals(other.infMac))) {
			return false;
		}
		return true;
	}

	@Column(name = "inf_descripcion")
	public String getInfDescripcion() {
		return infDescripcion;
	}

	@Basic(optional = false)
	@Column(name = "inf_estado")
	public boolean getInfEstado() {
		return infEstado;
	}

	@Basic(optional = false)
	@Column(name = "inf_ip")
	public String getInfIp() {
		return infIp;
	}

	@Basic(optional = false)
	@Column(name = "inf_keystore_password")
	public String getInfKeystorePassword() {
		return infKeystorePassword;
	}

	public String getInfKeystoreRuta() {
		return infKeystoreRuta;
	}

	@Id
	@Basic(optional = false)
	@Column(name = "inf_mac")
	public String getInfMac() {
		return infMac;
	}

	@Basic(optional = false)
	@Column(name = "inf_nombre")
	public String getInfNombre() {
		return infNombre;
	}

	@Basic(optional = false)
	@Column(name = "inf_reporte_factura")
	public String getInfReporteFactura() {
		return infReporteFactura;
	}

	@Basic(optional = false)
	@Column(name = "inf_reporte_guia_remision")
	public String getInfReporteGuiaRemision() {
		return infReporteGuiaRemision;
	}

	public String getInfReporteLiquidacion() {
		return infReporteLiquidacion;
	}

	@Basic(optional = false)
	@Column(name = "inf_reporte_nota_credito")
	public String getInfReporteNotaCredito() {
		return infReporteNotaCredito;
	}

	@Basic(optional = false)
	@Column(name = "inf_reporte_retencion")
	public String getInfReporteRetencion() {
		return infReporteRetencion;
	}

	@Basic(optional = false)
	@Column(name = "inf_reporte_ruta_default")
	public String getInfReporteRutaDefault() {
		return infReporteRutaDefault;
	}

	@Basic(optional = false)
	@Column(name = "usr_codigo")
	public String getUsrCodigo() {
		return usrCodigo;
	}

	@Basic(optional = false)
	@Column(name = "usr_fecha_inserta_pc")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getUsrFechaInsertaPc() {
		return usrFechaInsertaPc;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (infMac != null ? infMac.hashCode() : 0);
		return hash;
	}

	public void setInfDescripcion(String infDescripcion) {
		this.infDescripcion = infDescripcion;
	}

	public void setInfEstado(boolean infEstado) {
		this.infEstado = infEstado;
	}

	public void setInfIp(String infIp) {
		this.infIp = infIp;
	}

	public void setInfKeystorePassword(String infKeystorePassword) {
		this.infKeystorePassword = infKeystorePassword;
	}

	@Basic(optional = false)
	@Column(name = "inf_keystore_ruta")
	public void setInfKeystoreRuta(String infKeystoreRuta) {
		this.infKeystoreRuta = infKeystoreRuta;
	}

	public void setInfMac(String infMac) {
		this.infMac = infMac;
	}

	public void setInfNombre(String infNombre) {
		this.infNombre = infNombre;
	}

	public void setInfReporteFactura(String infReporteFactura) {
		this.infReporteFactura = infReporteFactura;
	}

	public void setInfReporteGuiaRemision(String infReporteGuiaRemision) {
		this.infReporteGuiaRemision = infReporteGuiaRemision;
	}

	@Basic(optional = false)
	@Column(name = "inf_reporte_liquidacion")
	public void setInfReporteLiquidacion(String infReporteLiquidacion) {
		this.infReporteLiquidacion = infReporteLiquidacion;
	}

	public void setInfReporteNotaCredito(String infReporteNotaCredito) {
		this.infReporteNotaCredito = infReporteNotaCredito;
	}

	public void setInfReporteRetencion(String infReporteRetencion) {
		this.infReporteRetencion = infReporteRetencion;
	}

	public void setInfReporteRutaDefault(String infReporteRutaDefault) {
		this.infReporteRutaDefault = infReporteRutaDefault;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public void setUsrFechaInsertaPc(Date usrFechaInsertaPc) {
		this.usrFechaInsertaPc = usrFechaInsertaPc;
	}

	@Override
	public String toString() {
		return "registro.entity.SisPcs[ infMac=" + infMac + " ]";
	}
}

package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sis_pcs database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="sis_pcs")
@NamedQuery(name="SisPc.findAll", query="SELECT s FROM SisPc s")
public class SisPc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="inf_mac", unique=true, nullable=false, length=17)
	private String infMac;

	@Column(name="inf_descripcion", length=80)
	private String infDescripcion;

	@Column(name="inf_estado", nullable=false)
	private Boolean infEstado;

	@Column(name="inf_ip", nullable=false, length=15)
	private String infIp;

	@Column(name="inf_keystore_password", nullable=false, length=500)
	private String infKeystorePassword;

	@Column(name="inf_keystore_ruta", nullable=false, length=500)
	private String infKeystoreRuta;

	@Column(name="inf_nombre", nullable=false, length=80)
	private String infNombre;

	@Column(name="inf_reporte_factura", nullable=false, length=100)
	private String infReporteFactura;

	@Column(name="inf_reporte_guia_remision", nullable=false, length=100)
	private String infReporteGuiaRemision;

	@Column(name="inf_reporte_liquidacion", nullable=false, length=100)
	private String infReporteLiquidacion;

	@Column(name="inf_reporte_nota_credito", nullable=false, length=100)
	private String infReporteNotaCredito;

	@Column(name="inf_reporte_retencion", nullable=false, length=100)
	private String infReporteRetencion;

	@Column(name="inf_reporte_ruta_default", nullable=false, length=100)
	private String infReporteRutaDefault;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_fecha_inserta_pc", nullable=false)
	private Timestamp usrFechaInsertaPc;

	public SisPc() {
	}

	public String getInfMac() {
		return this.infMac;
	}

	public void setInfMac(String infMac) {
		this.infMac = infMac;
	}

	public String getInfDescripcion() {
		return this.infDescripcion;
	}

	public void setInfDescripcion(String infDescripcion) {
		this.infDescripcion = infDescripcion;
	}

	public Boolean getInfEstado() {
		return this.infEstado;
	}

	public void setInfEstado(Boolean infEstado) {
		this.infEstado = infEstado;
	}

	public String getInfIp() {
		return this.infIp;
	}

	public void setInfIp(String infIp) {
		this.infIp = infIp;
	}

	public String getInfKeystorePassword() {
		return this.infKeystorePassword;
	}

	public void setInfKeystorePassword(String infKeystorePassword) {
		this.infKeystorePassword = infKeystorePassword;
	}

	public String getInfKeystoreRuta() {
		return this.infKeystoreRuta;
	}

	public void setInfKeystoreRuta(String infKeystoreRuta) {
		this.infKeystoreRuta = infKeystoreRuta;
	}

	public String getInfNombre() {
		return this.infNombre;
	}

	public void setInfNombre(String infNombre) {
		this.infNombre = infNombre;
	}

	public String getInfReporteFactura() {
		return this.infReporteFactura;
	}

	public void setInfReporteFactura(String infReporteFactura) {
		this.infReporteFactura = infReporteFactura;
	}

	public String getInfReporteGuiaRemision() {
		return this.infReporteGuiaRemision;
	}

	public void setInfReporteGuiaRemision(String infReporteGuiaRemision) {
		this.infReporteGuiaRemision = infReporteGuiaRemision;
	}

	public String getInfReporteLiquidacion() {
		return this.infReporteLiquidacion;
	}

	public void setInfReporteLiquidacion(String infReporteLiquidacion) {
		this.infReporteLiquidacion = infReporteLiquidacion;
	}

	public String getInfReporteNotaCredito() {
		return this.infReporteNotaCredito;
	}

	public void setInfReporteNotaCredito(String infReporteNotaCredito) {
		this.infReporteNotaCredito = infReporteNotaCredito;
	}

	public String getInfReporteRetencion() {
		return this.infReporteRetencion;
	}

	public void setInfReporteRetencion(String infReporteRetencion) {
		this.infReporteRetencion = infReporteRetencion;
	}

	public String getInfReporteRutaDefault() {
		return this.infReporteRutaDefault;
	}

	public void setInfReporteRutaDefault(String infReporteRutaDefault) {
		this.infReporteRutaDefault = infReporteRutaDefault;
	}

	public String getUsrCodigo() {
		return this.usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public Timestamp getUsrFechaInsertaPc() {
		return this.usrFechaInsertaPc;
	}

	public void setUsrFechaInsertaPc(Timestamp usrFechaInsertaPc) {
		this.usrFechaInsertaPc = usrFechaInsertaPc;
	}

}
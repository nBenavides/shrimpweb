package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the anx_compra_electronica database table.
 * 
 */
@Entity
@Table(name="anx_compra_electronica", schema="anexo")
@NamedQuery(name="AnxCompraElectronica.findAll", query="SELECT a FROM AnxCompraElectronica a")
public class AnxCompraElectronica implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AnxCompraElectronicaPK id;

	@Column(name="comp_empresa", nullable=false, length=7)
	private String compEmpresa;

	@Column(name="comp_motivo", nullable=false, length=7)
	private String compMotivo;

	@Column(name="comp_numero", nullable=false, length=7)
	private String compNumero;

	@Column(name="comp_periodo", nullable=false, length=7)
	private String compPeriodo;

	@Column(name="e_autorizacion_fecha", nullable=false)
	private Timestamp eAutorizacionFecha;

	@Column(name="e_autorizacion_numero", nullable=false, length=55)
	private String eAutorizacionNumero;

	@Column(name="e_clave_acceso", nullable=false, length=50)
	private String eClaveAcceso;

	@Column(name="e_clave_descarga_ride", nullable=false, length=10)
	private String eClaveDescargaRide;

	@Column(name="e_enviado_por_correo", nullable=false)
	private Boolean eEnviadoPorCorreo;

	@Column(name="e_estado", nullable=false, length=35)
	private String eEstado;

	@Column(name="e_tipo_ambiente", nullable=false, length=10)
	private String eTipoAmbiente;

	@Column(name="e_xml")
	private byte[] eXml;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_empresa", nullable=false, length=7)
	private String usrEmpresa;

	@Column(name="usr_fecha_inserta", nullable=false)
	private Timestamp usrFechaInserta;

	public AnxCompraElectronica() {
	}

	public AnxCompraElectronicaPK getId() {
		return this.id;
	}

	public void setId(AnxCompraElectronicaPK id) {
		this.id = id;
	}

	public String getCompEmpresa() {
		return this.compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}

	public String getCompMotivo() {
		return this.compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getCompNumero() {
		return this.compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	public String getCompPeriodo() {
		return this.compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public Timestamp getEAutorizacionFecha() {
		return this.eAutorizacionFecha;
	}

	public void setEAutorizacionFecha(Timestamp eAutorizacionFecha) {
		this.eAutorizacionFecha = eAutorizacionFecha;
	}

	public String getEAutorizacionNumero() {
		return this.eAutorizacionNumero;
	}

	public void setEAutorizacionNumero(String eAutorizacionNumero) {
		this.eAutorizacionNumero = eAutorizacionNumero;
	}

	public String getEClaveAcceso() {
		return this.eClaveAcceso;
	}

	public void setEClaveAcceso(String eClaveAcceso) {
		this.eClaveAcceso = eClaveAcceso;
	}

	public String getEClaveDescargaRide() {
		return this.eClaveDescargaRide;
	}

	public void setEClaveDescargaRide(String eClaveDescargaRide) {
		this.eClaveDescargaRide = eClaveDescargaRide;
	}

	public Boolean getEEnviadoPorCorreo() {
		return this.eEnviadoPorCorreo;
	}

	public void setEEnviadoPorCorreo(Boolean eEnviadoPorCorreo) {
		this.eEnviadoPorCorreo = eEnviadoPorCorreo;
	}

	public String getEEstado() {
		return this.eEstado;
	}

	public void setEEstado(String eEstado) {
		this.eEstado = eEstado;
	}

	public String getETipoAmbiente() {
		return this.eTipoAmbiente;
	}

	public void setETipoAmbiente(String eTipoAmbiente) {
		this.eTipoAmbiente = eTipoAmbiente;
	}

	public byte[] getEXml() {
		return this.eXml;
	}

	public void setEXml(byte[] eXml) {
		this.eXml = eXml;
	}

	public String getUsrCodigo() {
		return this.usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrEmpresa() {
		return this.usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public Timestamp getUsrFechaInserta() {
		return this.usrFechaInserta;
	}

	public void setUsrFechaInserta(Timestamp usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

}
package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="anx_venta_electronica", schema="anexo")
@NamedQuery(name="AnxVentaElectronica.findAll", query="SELECT a FROM AnxVentaElectronica a")
public class AnxVentaElectronica implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AnxVentaElectronicaPK id;

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

	@Column(name="vta_empresa", nullable=false, length=7)
	private String vtaEmpresa;

	@Column(name="vta_motivo", nullable=false, length=7)
	private String vtaMotivo;

	@Column(name="vta_numero", nullable=false, length=7)
	private String vtaNumero;

	@Column(name="vta_periodo", nullable=false, length=7)
	private String vtaPeriodo;

	public AnxVentaElectronica() {
	}

	public AnxVentaElectronicaPK getId() {
		return this.id;
	}

	public void setId(AnxVentaElectronicaPK id) {
		this.id = id;
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

	public String getVtaEmpresa() {
		return this.vtaEmpresa;
	}

	public void setVtaEmpresa(String vtaEmpresa) {
		this.vtaEmpresa = vtaEmpresa;
	}

	public String getVtaMotivo() {
		return this.vtaMotivo;
	}

	public void setVtaMotivo(String vtaMotivo) {
		this.vtaMotivo = vtaMotivo;
	}

	public String getVtaNumero() {
		return this.vtaNumero;
	}

	public void setVtaNumero(String vtaNumero) {
		this.vtaNumero = vtaNumero;
	}

	public String getVtaPeriodo() {
		return this.vtaPeriodo;
	}

	public void setVtaPeriodo(String vtaPeriodo) {
		this.vtaPeriodo = vtaPeriodo;
	}

}
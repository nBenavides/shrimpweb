package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the anx_compra_electronica database table.
 * 
 */
@Entity
@Table(name = "anx_compra_electronica", schema = "anexo")
@NamedQuery(name = "AnxCompraElectronica.findAll", query = "SELECT a FROM AnxCompraElectronica a")
public class AnxCompraElectronica implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AnxCompraElectronicaPK id;

	@Column(name = "e_autorizacion_fecha", nullable = false)
	private Timestamp eAutorizacionFecha;

	@Column(name = "e_autorizacion_numero", nullable = false, length = 55)
	private String eAutorizacionNumero;

	@Column(name = "e_clave_acceso", nullable = false, length = 50)
	private String eClaveAcceso;

	@Column(name = "e_clave_descarga_ride", nullable = false, length = 10)
	private String eClaveDescargaRide;

	@Column(name = "e_enviado_por_correo", nullable = false)
	private Boolean eEnviadoPorCorreo;

	@Column(name = "e_estado", nullable = false, length = 35)
	private String eEstado;

	@Column(name = "e_tipo_ambiente", nullable = false, length = 10)
	private String eTipoAmbiente;

	@Column(name = "e_xml")
	private byte[] eXml;

	@Column(name = "usr_codigo", nullable = false, length = 7)
	private String usrCodigo;

	@Column(name = "usr_empresa", nullable = false, length = 7)
	private String usrEmpresa;

	@Column(name = "usr_fecha_inserta", nullable = false)
	private Timestamp usrFechaInserta;

	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa", nullable = false),
			@JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo", nullable = false),
			@JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero", nullable = false),
			@JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo", nullable = false) })
	private InvCompra invCompra;

	public AnxCompraElectronica() {
	}

	public AnxCompraElectronicaPK getId() {
		return id;
	}

	public void setId(AnxCompraElectronicaPK id) {
		this.id = id;
	}

	public Timestamp geteAutorizacionFecha() {
		return eAutorizacionFecha;
	}

	public void seteAutorizacionFecha(Timestamp eAutorizacionFecha) {
		this.eAutorizacionFecha = eAutorizacionFecha;
	}

	public String geteAutorizacionNumero() {
		return eAutorizacionNumero;
	}

	public void seteAutorizacionNumero(String eAutorizacionNumero) {
		this.eAutorizacionNumero = eAutorizacionNumero;
	}

	public String geteClaveAcceso() {
		return eClaveAcceso;
	}

	public void seteClaveAcceso(String eClaveAcceso) {
		this.eClaveAcceso = eClaveAcceso;
	}

	public String geteClaveDescargaRide() {
		return eClaveDescargaRide;
	}

	public void seteClaveDescargaRide(String eClaveDescargaRide) {
		this.eClaveDescargaRide = eClaveDescargaRide;
	}

	public Boolean geteEnviadoPorCorreo() {
		return eEnviadoPorCorreo;
	}

	public void seteEnviadoPorCorreo(Boolean eEnviadoPorCorreo) {
		this.eEnviadoPorCorreo = eEnviadoPorCorreo;
	}

	public String geteEstado() {
		return eEstado;
	}

	public void seteEstado(String eEstado) {
		this.eEstado = eEstado;
	}

	public String geteTipoAmbiente() {
		return eTipoAmbiente;
	}

	public void seteTipoAmbiente(String eTipoAmbiente) {
		this.eTipoAmbiente = eTipoAmbiente;
	}

	public byte[] geteXml() {
		return eXml;
	}

	public void seteXml(byte[] eXml) {
		this.eXml = eXml;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public Timestamp getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(Timestamp usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvCompra getInvCompra() {
		return invCompra;
	}

	public void setInvCompra(InvCompra invCompra) {
		this.invCompra = invCompra;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
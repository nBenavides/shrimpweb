package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the inv_cliente database table.
 * 
 */
@Entity
@Table(name="inv_cliente")
@NamedQuery(name="InvCliente.findAll", query="SELECT i FROM InvCliente i")
public class InvCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InvClientePK id;

	@Column(name="cc_codigo", nullable=false, length=7)
	private String ccCodigo;

	@Column(name="cc_empresa", nullable=false, length=7)
	private String ccEmpresa;

	@Column(name="cli_celular", length=12)
	private String cliCelular;

	@Column(name="cli_ciudad", length=30)
	private String cliCiudad;

	@Column(name="cli_cupo_credito", precision=9, scale=2)
	private BigDecimal cliCupoCredito;

	@Column(name="cli_dias_credito", precision=3)
	private BigDecimal cliDiasCredito;

	@Column(name="cli_direccion", length=100)
	private String cliDireccion;

	@Column(name="cli_email", length=500)
	private String cliEmail;

	@Column(name="cli_id_empresa", length=7)
	private String cliIdEmpresa;

	@Column(name="cli_id_numero", length=13)
	private String cliIdNumero;

	@Column(name="cli_id_tipo", length=1)
	private String cliIdTipo;

	@Column(name="cli_inactivo")
	private Boolean cliInactivo;

	@Column(name="cli_nombre", nullable=false, length=100)
	private String cliNombre;

	@Column(name="cli_observaciones", length=200)
	private String cliObservaciones;

	@Column(name="cli_parroquia", length=30)
	private String cliParroquia;

	@Column(name="cli_precio", precision=2)
	private BigDecimal cliPrecio;

	@Column(name="cli_provincia", length=30)
	private String cliProvincia;

	@Column(name="cli_razon_social", length=100)
	private String cliRazonSocial;

	@Column(name="cli_secuencia", precision=7)
	private BigDecimal cliSecuencia;

	@Column(name="cli_telefono", length=12)
	private String cliTelefono;

	@Column(name="cli_zona", length=30)
	private String cliZona;

	@Column(name="usr_codigo", nullable=false, length=20)
	private String usrCodigo;

	@Column(name="usr_empresa", nullable=false, length=7)
	private String usrEmpresa;

	@Column(name="usr_fecha_inserta", nullable=false)
	private Timestamp usrFechaInserta;

	@Column(name="vend_codigo", length=7)
	private String vendCodigo;

	@Column(name="vend_empresa", length=7)
	private String vendEmpresa;

	//bi-directional many-to-one association to InvVenta
	@OneToMany(mappedBy="invCliente")
	private List<InvVenta> invVentas;

	public InvCliente() {
	}

	public InvClientePK getId() {
		return this.id;
	}

	public void setId(InvClientePK id) {
		this.id = id;
	}

	public String getCcCodigo() {
		return this.ccCodigo;
	}

	public void setCcCodigo(String ccCodigo) {
		this.ccCodigo = ccCodigo;
	}

	public String getCcEmpresa() {
		return this.ccEmpresa;
	}

	public void setCcEmpresa(String ccEmpresa) {
		this.ccEmpresa = ccEmpresa;
	}

	public String getCliCelular() {
		return this.cliCelular;
	}

	public void setCliCelular(String cliCelular) {
		this.cliCelular = cliCelular;
	}

	public String getCliCiudad() {
		return this.cliCiudad;
	}

	public void setCliCiudad(String cliCiudad) {
		this.cliCiudad = cliCiudad;
	}

	public BigDecimal getCliCupoCredito() {
		return this.cliCupoCredito;
	}

	public void setCliCupoCredito(BigDecimal cliCupoCredito) {
		this.cliCupoCredito = cliCupoCredito;
	}

	public BigDecimal getCliDiasCredito() {
		return this.cliDiasCredito;
	}

	public void setCliDiasCredito(BigDecimal cliDiasCredito) {
		this.cliDiasCredito = cliDiasCredito;
	}

	public String getCliDireccion() {
		return this.cliDireccion;
	}

	public void setCliDireccion(String cliDireccion) {
		this.cliDireccion = cliDireccion;
	}

	public String getCliEmail() {
		return this.cliEmail;
	}

	public void setCliEmail(String cliEmail) {
		this.cliEmail = cliEmail;
	}

	public String getCliIdEmpresa() {
		return this.cliIdEmpresa;
	}

	public void setCliIdEmpresa(String cliIdEmpresa) {
		this.cliIdEmpresa = cliIdEmpresa;
	}

	public String getCliIdNumero() {
		return this.cliIdNumero;
	}

	public void setCliIdNumero(String cliIdNumero) {
		this.cliIdNumero = cliIdNumero;
	}

	public String getCliIdTipo() {
		return this.cliIdTipo;
	}

	public void setCliIdTipo(String cliIdTipo) {
		this.cliIdTipo = cliIdTipo;
	}

	public Boolean getCliInactivo() {
		return this.cliInactivo;
	}

	public void setCliInactivo(Boolean cliInactivo) {
		this.cliInactivo = cliInactivo;
	}

	public String getCliNombre() {
		return this.cliNombre;
	}

	public void setCliNombre(String cliNombre) {
		this.cliNombre = cliNombre;
	}

	public String getCliObservaciones() {
		return this.cliObservaciones;
	}

	public void setCliObservaciones(String cliObservaciones) {
		this.cliObservaciones = cliObservaciones;
	}

	public String getCliParroquia() {
		return this.cliParroquia;
	}

	public void setCliParroquia(String cliParroquia) {
		this.cliParroquia = cliParroquia;
	}

	public BigDecimal getCliPrecio() {
		return this.cliPrecio;
	}

	public void setCliPrecio(BigDecimal cliPrecio) {
		this.cliPrecio = cliPrecio;
	}

	public String getCliProvincia() {
		return this.cliProvincia;
	}

	public void setCliProvincia(String cliProvincia) {
		this.cliProvincia = cliProvincia;
	}

	public String getCliRazonSocial() {
		return this.cliRazonSocial;
	}

	public void setCliRazonSocial(String cliRazonSocial) {
		this.cliRazonSocial = cliRazonSocial;
	}

	public BigDecimal getCliSecuencia() {
		return this.cliSecuencia;
	}

	public void setCliSecuencia(BigDecimal cliSecuencia) {
		this.cliSecuencia = cliSecuencia;
	}

	public String getCliTelefono() {
		return this.cliTelefono;
	}

	public void setCliTelefono(String cliTelefono) {
		this.cliTelefono = cliTelefono;
	}

	public String getCliZona() {
		return this.cliZona;
	}

	public void setCliZona(String cliZona) {
		this.cliZona = cliZona;
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

	public String getVendCodigo() {
		return this.vendCodigo;
	}

	public void setVendCodigo(String vendCodigo) {
		this.vendCodigo = vendCodigo;
	}

	public String getVendEmpresa() {
		return this.vendEmpresa;
	}

	public void setVendEmpresa(String vendEmpresa) {
		this.vendEmpresa = vendEmpresa;
	}

	public List<InvVenta> getInvVentas() {
		return this.invVentas;
	}

	public void setInvVentas(List<InvVenta> invVentas) {
		this.invVentas = invVentas;
	}

	public InvVenta addInvVenta(InvVenta invVenta) {
		getInvVentas().add(invVenta);
		invVenta.setInvCliente(this);

		return invVenta;
	}

	public InvVenta removeInvVenta(InvVenta invVenta) {
		getInvVentas().remove(invVenta);
		invVenta.setInvCliente(null);

		return invVenta;
	}

}
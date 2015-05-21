package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the inv_proveedor database table.
 * 
 */
@Entity
@Table(name = "inv_proveedor", schema = "inventario")
@NamedQuery(name = "InvProveedor.findAll", query = "SELECT i FROM InvProveedor i")
public class InvProveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InvProveedorPK id;

	@Column(name = "pc_codigo", nullable = false, length = 7)
	private String pcCodigo;

	@Column(name = "pc_empresa", nullable = false, length = 7)
	private String pcEmpresa;

	@Column(name = "prov_celular", length = 12)
	private String provCelular;

	@Column(name = "prov_ciudad", length = 30)
	private String provCiudad;

	@Column(name = "prov_direccion", length = 100)
	private String provDireccion;

	@Column(name = "prov_email", length = 500)
	private String provEmail;

	@Column(name = "prov_id_empresa", length = 7)
	private String provIdEmpresa;

	@Column(name = "prov_id_numero", length = 13)
	private String provIdNumero;

	@Column(name = "prov_id_tipo", length = 1)
	private String provIdTipo;

	@Column(name = "prov_inactivo")
	private Boolean provInactivo;

	@Column(name = "prov_nombre", nullable = false, length = 100)
	private String provNombre;

	@Column(name = "prov_observaciones", length = 200)
	private String provObservaciones;

	@Column(name = "prov_parroquia", length = 30)
	private String provParroquia;

	@Column(name = "prov_provincia", length = 30)
	private String provProvincia;

	@Column(name = "prov_razon_social", length = 100)
	private String provRazonSocial;

	@Column(name = "prov_secuencia", precision = 7)
	private BigDecimal provSecuencia;

	@Column(name = "prov_telefono", length = 12)
	private String provTelefono;

	@Column(name = "prov_zona", length = 30)
	private String provZona;

	@Column(name = "usr_codigo", nullable = false, length = 7)
	private String usrCodigo;

	@Column(name = "usr_empresa", nullable = false, length = 7)
	private String usrEmpresa;

	@Column(name = "usr_fecha_inserta")
	private Timestamp usrFechaInserta;

	// bi-directional many-to-one association to InvCompra
	@OneToMany(mappedBy = "invProveedor")
	private List<InvCompra> invCompras;

	public InvProveedor() {
	}

	public InvProveedorPK getId() {
		return this.id;
	}

	public void setId(InvProveedorPK id) {
		this.id = id;
	}

	public String getPcCodigo() {
		return this.pcCodigo;
	}

	public void setPcCodigo(String pcCodigo) {
		this.pcCodigo = pcCodigo;
	}

	public String getPcEmpresa() {
		return this.pcEmpresa;
	}

	public void setPcEmpresa(String pcEmpresa) {
		this.pcEmpresa = pcEmpresa;
	}

	public String getProvCelular() {
		return this.provCelular;
	}

	public void setProvCelular(String provCelular) {
		this.provCelular = provCelular;
	}

	public String getProvCiudad() {
		return this.provCiudad;
	}

	public void setProvCiudad(String provCiudad) {
		this.provCiudad = provCiudad;
	}

	public String getProvDireccion() {
		return this.provDireccion;
	}

	public void setProvDireccion(String provDireccion) {
		this.provDireccion = provDireccion;
	}

	public String getProvEmail() {
		return this.provEmail;
	}

	public void setProvEmail(String provEmail) {
		this.provEmail = provEmail;
	}

	public String getProvIdEmpresa() {
		return this.provIdEmpresa;
	}

	public void setProvIdEmpresa(String provIdEmpresa) {
		this.provIdEmpresa = provIdEmpresa;
	}

	public String getProvIdNumero() {
		return this.provIdNumero;
	}

	public void setProvIdNumero(String provIdNumero) {
		this.provIdNumero = provIdNumero;
	}

	public String getProvIdTipo() {
		return this.provIdTipo;
	}

	public void setProvIdTipo(String provIdTipo) {
		this.provIdTipo = provIdTipo;
	}

	public Boolean getProvInactivo() {
		return this.provInactivo;
	}

	public void setProvInactivo(Boolean provInactivo) {
		this.provInactivo = provInactivo;
	}

	public String getProvNombre() {
		return this.provNombre;
	}

	public void setProvNombre(String provNombre) {
		this.provNombre = provNombre;
	}

	public String getProvObservaciones() {
		return this.provObservaciones;
	}

	public void setProvObservaciones(String provObservaciones) {
		this.provObservaciones = provObservaciones;
	}

	public String getProvParroquia() {
		return this.provParroquia;
	}

	public void setProvParroquia(String provParroquia) {
		this.provParroquia = provParroquia;
	}

	public String getProvProvincia() {
		return this.provProvincia;
	}

	public void setProvProvincia(String provProvincia) {
		this.provProvincia = provProvincia;
	}

	public String getProvRazonSocial() {
		return this.provRazonSocial;
	}

	public void setProvRazonSocial(String provRazonSocial) {
		this.provRazonSocial = provRazonSocial;
	}

	public BigDecimal getProvSecuencia() {
		return this.provSecuencia;
	}

	public void setProvSecuencia(BigDecimal provSecuencia) {
		this.provSecuencia = provSecuencia;
	}

	public String getProvTelefono() {
		return this.provTelefono;
	}

	public void setProvTelefono(String provTelefono) {
		this.provTelefono = provTelefono;
	}

	public String getProvZona() {
		return this.provZona;
	}

	public void setProvZona(String provZona) {
		this.provZona = provZona;
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

	public List<InvCompra> getInvCompras() {
		return this.invCompras;
	}

	public void setInvCompras(List<InvCompra> invCompras) {
		this.invCompras = invCompras;
	}

	public InvCompra addInvCompra(InvCompra invCompra) {
		getInvCompras().add(invCompra);
		invCompra.setInvProveedor(this);

		return invCompra;
	}

	public InvCompra removeInvCompra(InvCompra invCompra) {
		getInvCompras().remove(invCompra);
		invCompra.setInvProveedor(null);

		return invCompra;
	}

}
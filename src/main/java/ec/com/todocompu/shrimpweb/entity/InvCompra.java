package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the inv_compras database table.
 * 
 */
@Entity
@Table(name = "inv_compras", schema = "inventario")
@NamedQuery(name = "InvCompra.findAll", query = "SELECT i FROM InvCompra i")
public class InvCompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InvCompraPK id;

	@Column(name = "comp_activo_fijo", nullable = false)
	private Boolean compActivoFijo;

	@Column(name = "comp_anulado", nullable = false)
	private Boolean compAnulado;

	@Column(name = "comp_base0", nullable = false, precision = 13, scale = 2)
	private BigDecimal compBase0;

	@Column(name = "comp_baseimponible", nullable = false, precision = 13, scale = 2)
	private BigDecimal compBaseimponible;

	@Column(name = "comp_documento_empresa", length = 7)
	private String compDocumentoEmpresa;

	@Column(name = "comp_documento_forma_pago", length = 17)
	private String compDocumentoFormaPago;

	@Column(name = "comp_documento_numero", length = 17)
	private String compDocumentoNumero;

	@Column(name = "comp_documento_proveedor", length = 7)
	private String compDocumentoProveedor;

	@Column(name = "comp_documento_tipo", length = 2)
	private String compDocumentoTipo;

	@Column(name = "comp_electronica", nullable = false)
	private Boolean compElectronica;

	@Temporal(TemporalType.DATE)
	@Column(name = "comp_fecha", nullable = false)
	private Date compFecha;

	@Temporal(TemporalType.DATE)
	@Column(name = "comp_fecha_vencimiento", nullable = false)
	private Date compFechaVencimiento;

	@Column(name = "comp_forma_pago", nullable = false, length = 50)
	private String compFormaPago;

	@Column(name = "comp_iva_vigente", nullable = false, precision = 5, scale = 2)
	private BigDecimal compIvaVigente;

	@Column(name = "comp_montoiva", nullable = false, precision = 13, scale = 2)
	private BigDecimal compMontoiva;

	@Column(name = "comp_numero_alterno", nullable = false, length = 7)
	private String compNumeroAlterno;

	@Column(name = "comp_observaciones", length = 500)
	private String compObservaciones;

	@Column(name = "comp_otros_impuestos", nullable = false, precision = 13, scale = 2)
	private BigDecimal compOtrosImpuestos;

	@Column(name = "comp_pendiente", nullable = false)
	private Boolean compPendiente;

	@Column(name = "comp_retencion_asumida")
	private Boolean compRetencionAsumida;

	@Column(name = "comp_revisado", nullable = false)
	private Boolean compRevisado;

	@Column(name = "comp_saldo", nullable = false, precision = 13, scale = 2)
	private BigDecimal compSaldo;

	@Column(name = "comp_total", nullable = false, precision = 13, scale = 2)
	private BigDecimal compTotal;

	@Column(name = "comp_valorretenido", nullable = false, precision = 13, scale = 2)
	private BigDecimal compValorretenido;

	@Column(name = "con_empresa", length = 7)
	private String conEmpresa;

	@Column(name = "con_numero", length = 7)
	private String conNumero;

	@Column(name = "con_periodo", length = 7)
	private String conPeriodo;

	@Column(name = "con_tipo", length = 7)
	private String conTipo;

	@Column(name = "emp_codigo", nullable = false, length = 7)
	private String empCodigo;

	@Column(name = "sec_codigo", nullable = false, length = 7)
	private String secCodigo;

	@Column(name = "sec_empresa", nullable = false, length = 7)
	private String secEmpresa;

	@Column(name = "usr_codigo", nullable = false, length = 7)
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta", nullable = false)
	private Timestamp usrFechaInserta;

	// bi-directional many-to-one association to InvProveedor
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "prov_codigo", referencedColumnName = "prov_codigo", nullable = false),
			@JoinColumn(name = "prov_empresa", referencedColumnName = "prov_empresa", nullable = false) })
	private InvProveedor invProveedor;

	@OneToMany(mappedBy = "invCompra")
	private List<AnxCompraElectronica> anxComprasElectronicas;

	public List<AnxCompraElectronica> getAnxComprasElectronicas() {
		return anxComprasElectronicas;
	}

	public void setAnxComprasElectronicas(
			List<AnxCompraElectronica> anxComprasElectronicas) {
		this.anxComprasElectronicas = anxComprasElectronicas;
	}

	public InvCompra() {
	}

	public InvCompraPK getId() {
		return this.id;
	}

	public void setId(InvCompraPK id) {
		this.id = id;
	}

	public Boolean getCompActivoFijo() {
		return this.compActivoFijo;
	}

	public void setCompActivoFijo(Boolean compActivoFijo) {
		this.compActivoFijo = compActivoFijo;
	}

	public Boolean getCompAnulado() {
		return this.compAnulado;
	}

	public void setCompAnulado(Boolean compAnulado) {
		this.compAnulado = compAnulado;
	}

	public BigDecimal getCompBase0() {
		return this.compBase0;
	}

	public void setCompBase0(BigDecimal compBase0) {
		this.compBase0 = compBase0;
	}

	public BigDecimal getCompBaseimponible() {
		return this.compBaseimponible;
	}

	public void setCompBaseimponible(BigDecimal compBaseimponible) {
		this.compBaseimponible = compBaseimponible;
	}

	public String getCompDocumentoEmpresa() {
		return this.compDocumentoEmpresa;
	}

	public void setCompDocumentoEmpresa(String compDocumentoEmpresa) {
		this.compDocumentoEmpresa = compDocumentoEmpresa;
	}

	public String getCompDocumentoFormaPago() {
		return this.compDocumentoFormaPago;
	}

	public void setCompDocumentoFormaPago(String compDocumentoFormaPago) {
		this.compDocumentoFormaPago = compDocumentoFormaPago;
	}

	public String getCompDocumentoNumero() {
		return this.compDocumentoNumero;
	}

	public void setCompDocumentoNumero(String compDocumentoNumero) {
		this.compDocumentoNumero = compDocumentoNumero;
	}

	public String getCompDocumentoProveedor() {
		return this.compDocumentoProveedor;
	}

	public void setCompDocumentoProveedor(String compDocumentoProveedor) {
		this.compDocumentoProveedor = compDocumentoProveedor;
	}

	public String getCompDocumentoTipo() {
		return this.compDocumentoTipo;
	}

	public void setCompDocumentoTipo(String compDocumentoTipo) {
		this.compDocumentoTipo = compDocumentoTipo;
	}

	public Boolean getCompElectronica() {
		return this.compElectronica;
	}

	public void setCompElectronica(Boolean compElectronica) {
		this.compElectronica = compElectronica;
	}

	public Date getCompFecha() {
		return this.compFecha;
	}

	public void setCompFecha(Date compFecha) {
		this.compFecha = compFecha;
	}

	public Date getCompFechaVencimiento() {
		return this.compFechaVencimiento;
	}

	public void setCompFechaVencimiento(Date compFechaVencimiento) {
		this.compFechaVencimiento = compFechaVencimiento;
	}

	public String getCompFormaPago() {
		return this.compFormaPago;
	}

	public void setCompFormaPago(String compFormaPago) {
		this.compFormaPago = compFormaPago;
	}

	public BigDecimal getCompIvaVigente() {
		return this.compIvaVigente;
	}

	public void setCompIvaVigente(BigDecimal compIvaVigente) {
		this.compIvaVigente = compIvaVigente;
	}

	public BigDecimal getCompMontoiva() {
		return this.compMontoiva;
	}

	public void setCompMontoiva(BigDecimal compMontoiva) {
		this.compMontoiva = compMontoiva;
	}

	public String getCompNumeroAlterno() {
		return this.compNumeroAlterno;
	}

	public void setCompNumeroAlterno(String compNumeroAlterno) {
		this.compNumeroAlterno = compNumeroAlterno;
	}

	public String getCompObservaciones() {
		return this.compObservaciones;
	}

	public void setCompObservaciones(String compObservaciones) {
		this.compObservaciones = compObservaciones;
	}

	public BigDecimal getCompOtrosImpuestos() {
		return this.compOtrosImpuestos;
	}

	public void setCompOtrosImpuestos(BigDecimal compOtrosImpuestos) {
		this.compOtrosImpuestos = compOtrosImpuestos;
	}

	public Boolean getCompPendiente() {
		return this.compPendiente;
	}

	public void setCompPendiente(Boolean compPendiente) {
		this.compPendiente = compPendiente;
	}

	public Boolean getCompRetencionAsumida() {
		return this.compRetencionAsumida;
	}

	public void setCompRetencionAsumida(Boolean compRetencionAsumida) {
		this.compRetencionAsumida = compRetencionAsumida;
	}

	public Boolean getCompRevisado() {
		return this.compRevisado;
	}

	public void setCompRevisado(Boolean compRevisado) {
		this.compRevisado = compRevisado;
	}

	public BigDecimal getCompSaldo() {
		return this.compSaldo;
	}

	public void setCompSaldo(BigDecimal compSaldo) {
		this.compSaldo = compSaldo;
	}

	public BigDecimal getCompTotal() {
		return this.compTotal;
	}

	public void setCompTotal(BigDecimal compTotal) {
		this.compTotal = compTotal;
	}

	public BigDecimal getCompValorretenido() {
		return this.compValorretenido;
	}

	public void setCompValorretenido(BigDecimal compValorretenido) {
		this.compValorretenido = compValorretenido;
	}

	public String getConEmpresa() {
		return this.conEmpresa;
	}

	public void setConEmpresa(String conEmpresa) {
		this.conEmpresa = conEmpresa;
	}

	public String getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	public String getConPeriodo() {
		return this.conPeriodo;
	}

	public void setConPeriodo(String conPeriodo) {
		this.conPeriodo = conPeriodo;
	}

	public String getConTipo() {
		return this.conTipo;
	}

	public void setConTipo(String conTipo) {
		this.conTipo = conTipo;
	}

	public String getEmpCodigo() {
		return this.empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getSecCodigo() {
		return this.secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getSecEmpresa() {
		return this.secEmpresa;
	}

	public void setSecEmpresa(String secEmpresa) {
		this.secEmpresa = secEmpresa;
	}

	public String getUsrCodigo() {
		return this.usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public Timestamp getUsrFechaInserta() {
		return this.usrFechaInserta;
	}

	public void setUsrFechaInserta(Timestamp usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	public InvProveedor getInvProveedor() {
		return this.invProveedor;
	}

	public void setInvProveedor(InvProveedor invProveedor) {
		this.invProveedor = invProveedor;
	}

}
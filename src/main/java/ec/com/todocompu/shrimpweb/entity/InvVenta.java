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
 * The persistent class for the inv_ventas database table.
 * 
 */
@Entity
@Table(name = "inv_ventas")
@NamedQuery(name = "InvVenta.findAll", query = "SELECT i FROM InvVenta i")
public class InvVenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InvVentaPK id;

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

	@Column(name = "vta_anulado", nullable = false)
	private Boolean vtaAnulado;

	@Column(name = "vta_base0", nullable = false, precision = 25, scale = 15)
	private BigDecimal vtaBase0;

	@Column(name = "vta_baseimponible", nullable = false, precision = 25, scale = 15)
	private BigDecimal vtaBaseimponible;

	@Column(name = "vta_descuento_base0", nullable = false, precision = 25, scale = 15)
	private BigDecimal vtaDescuentoBase0;

	@Column(name = "vta_descuento_baseimponible", nullable = false, precision = 25, scale = 15)
	private BigDecimal vtaDescuentoBaseimponible;

	@Column(name = "vta_descuento_general_base0", nullable = false, precision = 25, scale = 15)
	private BigDecimal vtaDescuentoGeneralBase0;

	@Column(name = "vta_descuento_general_baseimponible", nullable = false, precision = 25, scale = 15)
	private BigDecimal vtaDescuentoGeneralBaseimponible;

	@Column(name = "vta_descuento_iva", nullable = false, precision = 25, scale = 15)
	private BigDecimal vtaDescuentoIva;

	@Column(name = "vta_documento_empresa", length = 7)
	private String vtaDocumentoEmpresa;

	@Column(name = "vta_documento_numero", length = 17)
	private String vtaDocumentoNumero;

	@Column(name = "vta_documento_tipo", length = 2)
	private String vtaDocumentoTipo;

	@Temporal(TemporalType.DATE)
	@Column(name = "vta_fecha", nullable = false)
	private Date vtaFecha;

	@Temporal(TemporalType.DATE)
	@Column(name = "vta_fecha_vencimiento", nullable = false)
	private Date vtaFechaVencimiento;

	@Column(name = "vta_forma_pago", nullable = false, length = 50)
	private String vtaFormaPago;

	@Column(name = "vta_informacion_adicional", length = 500)
	private String vtaInformacionAdicional;

	@Column(name = "vta_iva_vigente", nullable = false, precision = 5, scale = 2)
	private BigDecimal vtaIvaVigente;

	@Column(name = "vta_montoiva", nullable = false, precision = 13, scale = 2)
	private BigDecimal vtaMontoiva;

	@Column(name = "vta_numero_alterno", nullable = false, length = 7)
	private String vtaNumeroAlterno;

	@Column(name = "vta_observaciones", length = 500)
	private String vtaObservaciones;

	@Column(name = "vta_pagado", nullable = false, precision = 13, scale = 2)
	private BigDecimal vtaPagado;

	@Column(name = "vta_pendiente", nullable = false)
	private Boolean vtaPendiente;

	@Column(name = "vta_revisado", nullable = false)
	private Boolean vtaRevisado;

	@Column(name = "vta_subtotal_base0", nullable = false, precision = 25, scale = 15)
	private BigDecimal vtaSubtotalBase0;

	@Column(name = "vta_subtotal_baseimponible", nullable = false, precision = 25, scale = 15)
	private BigDecimal vtaSubtotalBaseimponible;

	@Column(name = "vta_total", nullable = false, precision = 13, scale = 2)
	private BigDecimal vtaTotal;

	// bi-directional many-to-one association to InvCliente
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo", nullable = false),
			@JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa", nullable = false) })
	private InvCliente invCliente;

	@OneToMany(mappedBy = "invVenta")
	private List<AnxVentaElectronica> anxVentasElectronicas;

	public List<AnxVentaElectronica> getAnxVentasElectronicas() {
		return anxVentasElectronicas;
	}

	public void setAnxVentasElectronicas(
			List<AnxVentaElectronica> anxVentasElectronicas) {
		this.anxVentasElectronicas = anxVentasElectronicas;
	}

	public InvVenta() {
	}

	public InvVentaPK getId() {
		return this.id;
	}

	public void setId(InvVentaPK id) {
		this.id = id;
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

	public Boolean getVtaAnulado() {
		return this.vtaAnulado;
	}

	public void setVtaAnulado(Boolean vtaAnulado) {
		this.vtaAnulado = vtaAnulado;
	}

	public BigDecimal getVtaBase0() {
		return this.vtaBase0;
	}

	public void setVtaBase0(BigDecimal vtaBase0) {
		this.vtaBase0 = vtaBase0;
	}

	public BigDecimal getVtaBaseimponible() {
		return this.vtaBaseimponible;
	}

	public void setVtaBaseimponible(BigDecimal vtaBaseimponible) {
		this.vtaBaseimponible = vtaBaseimponible;
	}

	public BigDecimal getVtaDescuentoBase0() {
		return this.vtaDescuentoBase0;
	}

	public void setVtaDescuentoBase0(BigDecimal vtaDescuentoBase0) {
		this.vtaDescuentoBase0 = vtaDescuentoBase0;
	}

	public BigDecimal getVtaDescuentoBaseimponible() {
		return this.vtaDescuentoBaseimponible;
	}

	public void setVtaDescuentoBaseimponible(
			BigDecimal vtaDescuentoBaseimponible) {
		this.vtaDescuentoBaseimponible = vtaDescuentoBaseimponible;
	}

	public BigDecimal getVtaDescuentoGeneralBase0() {
		return this.vtaDescuentoGeneralBase0;
	}

	public void setVtaDescuentoGeneralBase0(BigDecimal vtaDescuentoGeneralBase0) {
		this.vtaDescuentoGeneralBase0 = vtaDescuentoGeneralBase0;
	}

	public BigDecimal getVtaDescuentoGeneralBaseimponible() {
		return this.vtaDescuentoGeneralBaseimponible;
	}

	public void setVtaDescuentoGeneralBaseimponible(
			BigDecimal vtaDescuentoGeneralBaseimponible) {
		this.vtaDescuentoGeneralBaseimponible = vtaDescuentoGeneralBaseimponible;
	}

	public BigDecimal getVtaDescuentoIva() {
		return this.vtaDescuentoIva;
	}

	public void setVtaDescuentoIva(BigDecimal vtaDescuentoIva) {
		this.vtaDescuentoIva = vtaDescuentoIva;
	}

	public String getVtaDocumentoEmpresa() {
		return this.vtaDocumentoEmpresa;
	}

	public void setVtaDocumentoEmpresa(String vtaDocumentoEmpresa) {
		this.vtaDocumentoEmpresa = vtaDocumentoEmpresa;
	}

	public String getVtaDocumentoNumero() {
		return this.vtaDocumentoNumero;
	}

	public void setVtaDocumentoNumero(String vtaDocumentoNumero) {
		this.vtaDocumentoNumero = vtaDocumentoNumero;
	}

	public String getVtaDocumentoTipo() {
		return this.vtaDocumentoTipo;
	}

	public void setVtaDocumentoTipo(String vtaDocumentoTipo) {
		this.vtaDocumentoTipo = vtaDocumentoTipo;
	}

	public Date getVtaFecha() {
		return this.vtaFecha;
	}

	public void setVtaFecha(Date vtaFecha) {
		this.vtaFecha = vtaFecha;
	}

	public Date getVtaFechaVencimiento() {
		return this.vtaFechaVencimiento;
	}

	public void setVtaFechaVencimiento(Date vtaFechaVencimiento) {
		this.vtaFechaVencimiento = vtaFechaVencimiento;
	}

	public String getVtaFormaPago() {
		return this.vtaFormaPago;
	}

	public void setVtaFormaPago(String vtaFormaPago) {
		this.vtaFormaPago = vtaFormaPago;
	}

	public String getVtaInformacionAdicional() {
		return this.vtaInformacionAdicional;
	}

	public void setVtaInformacionAdicional(String vtaInformacionAdicional) {
		this.vtaInformacionAdicional = vtaInformacionAdicional;
	}

	public BigDecimal getVtaIvaVigente() {
		return this.vtaIvaVigente;
	}

	public void setVtaIvaVigente(BigDecimal vtaIvaVigente) {
		this.vtaIvaVigente = vtaIvaVigente;
	}

	public BigDecimal getVtaMontoiva() {
		return this.vtaMontoiva;
	}

	public void setVtaMontoiva(BigDecimal vtaMontoiva) {
		this.vtaMontoiva = vtaMontoiva;
	}

	public String getVtaNumeroAlterno() {
		return this.vtaNumeroAlterno;
	}

	public void setVtaNumeroAlterno(String vtaNumeroAlterno) {
		this.vtaNumeroAlterno = vtaNumeroAlterno;
	}

	public String getVtaObservaciones() {
		return this.vtaObservaciones;
	}

	public void setVtaObservaciones(String vtaObservaciones) {
		this.vtaObservaciones = vtaObservaciones;
	}

	public BigDecimal getVtaPagado() {
		return this.vtaPagado;
	}

	public void setVtaPagado(BigDecimal vtaPagado) {
		this.vtaPagado = vtaPagado;
	}

	public Boolean getVtaPendiente() {
		return this.vtaPendiente;
	}

	public void setVtaPendiente(Boolean vtaPendiente) {
		this.vtaPendiente = vtaPendiente;
	}

	public Boolean getVtaRevisado() {
		return this.vtaRevisado;
	}

	public void setVtaRevisado(Boolean vtaRevisado) {
		this.vtaRevisado = vtaRevisado;
	}

	public BigDecimal getVtaSubtotalBase0() {
		return this.vtaSubtotalBase0;
	}

	public void setVtaSubtotalBase0(BigDecimal vtaSubtotalBase0) {
		this.vtaSubtotalBase0 = vtaSubtotalBase0;
	}

	public BigDecimal getVtaSubtotalBaseimponible() {
		return this.vtaSubtotalBaseimponible;
	}

	public void setVtaSubtotalBaseimponible(BigDecimal vtaSubtotalBaseimponible) {
		this.vtaSubtotalBaseimponible = vtaSubtotalBaseimponible;
	}

	public BigDecimal getVtaTotal() {
		return this.vtaTotal;
	}

	public void setVtaTotal(BigDecimal vtaTotal) {
		this.vtaTotal = vtaTotal;
	}

	public InvCliente getInvCliente() {
		return this.invCliente;
	}

	public void setInvCliente(InvCliente invCliente) {
		this.invCliente = invCliente;
	}

}
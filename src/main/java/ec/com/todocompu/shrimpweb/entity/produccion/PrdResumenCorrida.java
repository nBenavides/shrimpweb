package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the prd_resumen_corrida database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_resumen_corrida")
@NamedQuery(name="PrdResumenCorrida.findAll", query="SELECT p FROM PrdResumenCorrida p")
public class PrdResumenCorrida implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdResumenCorridaPK id;

	@Column(name="rc_balanceado", precision=13, scale=2)
	private BigDecimal rcBalanceado;

	@Column(name="rc_biomasa", precision=13, scale=2)
	private BigDecimal rcBiomasa;

	@Column(name="rc_biomasa_real", precision=13, scale=2)
	private BigDecimal rcBiomasaReal;

	@Column(name="rc_conversion", precision=13, scale=2)
	private BigDecimal rcConversion;

	@Column(name="rc_costo_directo_dia", precision=13, scale=2)
	private BigDecimal rcCostoDirectoDia;

	@Column(name="rc_costo_hectarea", precision=13, scale=2)
	private BigDecimal rcCostoHectarea;

	@Column(name="rc_costo_libra", precision=13, scale=2)
	private BigDecimal rcCostoLibra;

	@Column(name="rc_costo_total_dia", precision=13, scale=2)
	private BigDecimal rcCostoTotalDia;

	@Column(name="rc_densidad")
	private Integer rcDensidad;

	@Column(name="rc_dias_muertos", precision=5)
	private BigDecimal rcDiasMuertos;

	@Column(name="rc_directo", precision=13, scale=2)
	private BigDecimal rcDirecto;

	@Column(name="rc_edad", precision=5)
	private BigDecimal rcEdad;

	@Column(name="rc_fecha_desde", length=10)
	private String rcFechaDesde;

	@Column(name="rc_fecha_hasta", length=10)
	private String rcFechaHasta;

	@Column(name="rc_fecha_hora", nullable=false)
	private Timestamp rcFechaHora;

	@Column(name="rc_fecha_pesca", length=10)
	private String rcFechaPesca;

	@Column(name="rc_fecha_siembra", length=10)
	private String rcFechaSiembra;

	@Column(name="rc_hectareaje", precision=9, scale=2)
	private BigDecimal rcHectareaje;

	@Column(name="rc_indirecto", precision=13, scale=2)
	private BigDecimal rcIndirecto;

	@Column(name="rc_laboratorio", length=25)
	private String rcLaboratorio;

	@Column(name="rc_nauplio", length=25)
	private String rcNauplio;

	@Column(name="rc_numero_larvas")
	private Integer rcNumeroLarvas;

	@Column(name="rc_peso_ideal", precision=13, scale=2)
	private BigDecimal rcPesoIdeal;

	@Column(name="rc_piscina_nombre", length=7)
	private String rcPiscinaNombre;

	@Column(name="rc_resultado", precision=13, scale=2)
	private BigDecimal rcResultado;

	@Column(name="rc_resultado_hectarea", precision=13, scale=2)
	private BigDecimal rcResultadoHectarea;

	@Column(name="rc_resultado_libra", precision=13, scale=2)
	private BigDecimal rcResultadoLibra;

	@Column(name="rc_sector_nombre", length=50)
	private String rcSectorNombre;

	@Column(name="rc_sobrevivencia", length=13)
	private String rcSobrevivencia;

	@Column(name="rc_talla_grande", precision=13, scale=2)
	private BigDecimal rcTallaGrande;

	@Column(name="rc_talla_mediano", precision=13, scale=2)
	private BigDecimal rcTallaMediano;

	@Column(name="rc_talla_pequeno", precision=13, scale=2)
	private BigDecimal rcTallaPequeno;

	@Column(name="rc_talla_promedio", precision=13, scale=2)
	private BigDecimal rcTallaPromedio;

	@Column(name="rc_total", precision=13, scale=2)
	private BigDecimal rcTotal;

	@Column(name="rc_valor_venta", precision=13, scale=2)
	private BigDecimal rcValorVenta;

	@Column(name="rc_venta_hectarea", precision=13, scale=2)
	private BigDecimal rcVentaHectarea;

	@Column(name="rc_venta_indirecto_dia", precision=13, scale=2)
	private BigDecimal rcVentaIndirectoDia;

	@Column(name="rc_venta_libra", precision=13, scale=2)
	private BigDecimal rcVentaLibra;

	public PrdResumenCorrida() {
	}

	public PrdResumenCorridaPK getId() {
		return this.id;
	}

	public void setId(PrdResumenCorridaPK id) {
		this.id = id;
	}

	public BigDecimal getRcBalanceado() {
		return this.rcBalanceado;
	}

	public void setRcBalanceado(BigDecimal rcBalanceado) {
		this.rcBalanceado = rcBalanceado;
	}

	public BigDecimal getRcBiomasa() {
		return this.rcBiomasa;
	}

	public void setRcBiomasa(BigDecimal rcBiomasa) {
		this.rcBiomasa = rcBiomasa;
	}

	public BigDecimal getRcBiomasaReal() {
		return this.rcBiomasaReal;
	}

	public void setRcBiomasaReal(BigDecimal rcBiomasaReal) {
		this.rcBiomasaReal = rcBiomasaReal;
	}

	public BigDecimal getRcConversion() {
		return this.rcConversion;
	}

	public void setRcConversion(BigDecimal rcConversion) {
		this.rcConversion = rcConversion;
	}

	public BigDecimal getRcCostoDirectoDia() {
		return this.rcCostoDirectoDia;
	}

	public void setRcCostoDirectoDia(BigDecimal rcCostoDirectoDia) {
		this.rcCostoDirectoDia = rcCostoDirectoDia;
	}

	public BigDecimal getRcCostoHectarea() {
		return this.rcCostoHectarea;
	}

	public void setRcCostoHectarea(BigDecimal rcCostoHectarea) {
		this.rcCostoHectarea = rcCostoHectarea;
	}

	public BigDecimal getRcCostoLibra() {
		return this.rcCostoLibra;
	}

	public void setRcCostoLibra(BigDecimal rcCostoLibra) {
		this.rcCostoLibra = rcCostoLibra;
	}

	public BigDecimal getRcCostoTotalDia() {
		return this.rcCostoTotalDia;
	}

	public void setRcCostoTotalDia(BigDecimal rcCostoTotalDia) {
		this.rcCostoTotalDia = rcCostoTotalDia;
	}

	public Integer getRcDensidad() {
		return this.rcDensidad;
	}

	public void setRcDensidad(Integer rcDensidad) {
		this.rcDensidad = rcDensidad;
	}

	public BigDecimal getRcDiasMuertos() {
		return this.rcDiasMuertos;
	}

	public void setRcDiasMuertos(BigDecimal rcDiasMuertos) {
		this.rcDiasMuertos = rcDiasMuertos;
	}

	public BigDecimal getRcDirecto() {
		return this.rcDirecto;
	}

	public void setRcDirecto(BigDecimal rcDirecto) {
		this.rcDirecto = rcDirecto;
	}

	public BigDecimal getRcEdad() {
		return this.rcEdad;
	}

	public void setRcEdad(BigDecimal rcEdad) {
		this.rcEdad = rcEdad;
	}

	public String getRcFechaDesde() {
		return this.rcFechaDesde;
	}

	public void setRcFechaDesde(String rcFechaDesde) {
		this.rcFechaDesde = rcFechaDesde;
	}

	public String getRcFechaHasta() {
		return this.rcFechaHasta;
	}

	public void setRcFechaHasta(String rcFechaHasta) {
		this.rcFechaHasta = rcFechaHasta;
	}

	public Timestamp getRcFechaHora() {
		return this.rcFechaHora;
	}

	public void setRcFechaHora(Timestamp rcFechaHora) {
		this.rcFechaHora = rcFechaHora;
	}

	public String getRcFechaPesca() {
		return this.rcFechaPesca;
	}

	public void setRcFechaPesca(String rcFechaPesca) {
		this.rcFechaPesca = rcFechaPesca;
	}

	public String getRcFechaSiembra() {
		return this.rcFechaSiembra;
	}

	public void setRcFechaSiembra(String rcFechaSiembra) {
		this.rcFechaSiembra = rcFechaSiembra;
	}

	public BigDecimal getRcHectareaje() {
		return this.rcHectareaje;
	}

	public void setRcHectareaje(BigDecimal rcHectareaje) {
		this.rcHectareaje = rcHectareaje;
	}

	public BigDecimal getRcIndirecto() {
		return this.rcIndirecto;
	}

	public void setRcIndirecto(BigDecimal rcIndirecto) {
		this.rcIndirecto = rcIndirecto;
	}

	public String getRcLaboratorio() {
		return this.rcLaboratorio;
	}

	public void setRcLaboratorio(String rcLaboratorio) {
		this.rcLaboratorio = rcLaboratorio;
	}

	public String getRcNauplio() {
		return this.rcNauplio;
	}

	public void setRcNauplio(String rcNauplio) {
		this.rcNauplio = rcNauplio;
	}

	public Integer getRcNumeroLarvas() {
		return this.rcNumeroLarvas;
	}

	public void setRcNumeroLarvas(Integer rcNumeroLarvas) {
		this.rcNumeroLarvas = rcNumeroLarvas;
	}

	public BigDecimal getRcPesoIdeal() {
		return this.rcPesoIdeal;
	}

	public void setRcPesoIdeal(BigDecimal rcPesoIdeal) {
		this.rcPesoIdeal = rcPesoIdeal;
	}

	public String getRcPiscinaNombre() {
		return this.rcPiscinaNombre;
	}

	public void setRcPiscinaNombre(String rcPiscinaNombre) {
		this.rcPiscinaNombre = rcPiscinaNombre;
	}

	public BigDecimal getRcResultado() {
		return this.rcResultado;
	}

	public void setRcResultado(BigDecimal rcResultado) {
		this.rcResultado = rcResultado;
	}

	public BigDecimal getRcResultadoHectarea() {
		return this.rcResultadoHectarea;
	}

	public void setRcResultadoHectarea(BigDecimal rcResultadoHectarea) {
		this.rcResultadoHectarea = rcResultadoHectarea;
	}

	public BigDecimal getRcResultadoLibra() {
		return this.rcResultadoLibra;
	}

	public void setRcResultadoLibra(BigDecimal rcResultadoLibra) {
		this.rcResultadoLibra = rcResultadoLibra;
	}

	public String getRcSectorNombre() {
		return this.rcSectorNombre;
	}

	public void setRcSectorNombre(String rcSectorNombre) {
		this.rcSectorNombre = rcSectorNombre;
	}

	public String getRcSobrevivencia() {
		return this.rcSobrevivencia;
	}

	public void setRcSobrevivencia(String rcSobrevivencia) {
		this.rcSobrevivencia = rcSobrevivencia;
	}

	public BigDecimal getRcTallaGrande() {
		return this.rcTallaGrande;
	}

	public void setRcTallaGrande(BigDecimal rcTallaGrande) {
		this.rcTallaGrande = rcTallaGrande;
	}

	public BigDecimal getRcTallaMediano() {
		return this.rcTallaMediano;
	}

	public void setRcTallaMediano(BigDecimal rcTallaMediano) {
		this.rcTallaMediano = rcTallaMediano;
	}

	public BigDecimal getRcTallaPequeno() {
		return this.rcTallaPequeno;
	}

	public void setRcTallaPequeno(BigDecimal rcTallaPequeno) {
		this.rcTallaPequeno = rcTallaPequeno;
	}

	public BigDecimal getRcTallaPromedio() {
		return this.rcTallaPromedio;
	}

	public void setRcTallaPromedio(BigDecimal rcTallaPromedio) {
		this.rcTallaPromedio = rcTallaPromedio;
	}

	public BigDecimal getRcTotal() {
		return this.rcTotal;
	}

	public void setRcTotal(BigDecimal rcTotal) {
		this.rcTotal = rcTotal;
	}

	public BigDecimal getRcValorVenta() {
		return this.rcValorVenta;
	}

	public void setRcValorVenta(BigDecimal rcValorVenta) {
		this.rcValorVenta = rcValorVenta;
	}

	public BigDecimal getRcVentaHectarea() {
		return this.rcVentaHectarea;
	}

	public void setRcVentaHectarea(BigDecimal rcVentaHectarea) {
		this.rcVentaHectarea = rcVentaHectarea;
	}

	public BigDecimal getRcVentaIndirectoDia() {
		return this.rcVentaIndirectoDia;
	}

	public void setRcVentaIndirectoDia(BigDecimal rcVentaIndirectoDia) {
		this.rcVentaIndirectoDia = rcVentaIndirectoDia;
	}

	public BigDecimal getRcVentaLibra() {
		return this.rcVentaLibra;
	}

	public void setRcVentaLibra(BigDecimal rcVentaLibra) {
		this.rcVentaLibra = rcVentaLibra;
	}

}
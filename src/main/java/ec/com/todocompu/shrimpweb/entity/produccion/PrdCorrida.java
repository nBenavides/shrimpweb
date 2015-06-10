package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the prd_corrida database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_corrida")
@NamedQuery(name="PrdCorrida.findAll", query="SELECT p FROM PrdCorrida p")
public class PrdCorrida implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdCorridaPK id;

	@Column(name="cor_activa")
	private Boolean corActiva;

	@Column(name="cor_biomasa", precision=9, scale=2)
	private BigDecimal corBiomasa;

	@Temporal(TemporalType.DATE)
	@Column(name="cor_fecha_desde", nullable=false)
	private Date corFechaDesde;

	@Temporal(TemporalType.DATE)
	@Column(name="cor_fecha_hasta")
	private Date corFechaHasta;

	@Temporal(TemporalType.DATE)
	@Column(name="cor_fecha_pesca")
	private Date corFechaPesca;

	@Temporal(TemporalType.DATE)
	@Column(name="cor_fecha_siembra")
	private Date corFechaSiembra;

	@Column(name="cor_hectareas", precision=9, scale=2)
	private BigDecimal corHectareas;

	@Column(name="cor_laboratorio", length=25)
	private String corLaboratorio;

	@Column(name="cor_nauplio", length=25)
	private String corNauplio;

	@Column(name="cor_numero_larvas", precision=9)
	private BigDecimal corNumeroLarvas;

	@Column(name="cor_observaciones", length=500)
	private String corObservaciones;

	@Column(name="cor_pellet", precision=3)
	private BigDecimal corPellet;

	@Column(name="cor_valor_venta", precision=9, scale=2)
	private BigDecimal corValorVenta;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_empresa", nullable=false, length=7)
	private String usrEmpresa;

	@Column(name="usr_fecha_inserta", nullable=false)
	private Timestamp usrFechaInserta;

	//bi-directional many-to-one association to PrdPiscina
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="pis_empresa", referencedColumnName="pis_empresa", nullable=false),
		@JoinColumn(name="pis_numero", referencedColumnName="pis_numero", nullable=false),
		@JoinColumn(name="pis_sector", referencedColumnName="pis_sector", nullable=false)
		})
	private PrdPiscina prdPiscina;

	public PrdCorrida() {
	}

	public PrdCorridaPK getId() {
		return this.id;
	}

	public void setId(PrdCorridaPK id) {
		this.id = id;
	}

	public Boolean getCorActiva() {
		return this.corActiva;
	}

	public void setCorActiva(Boolean corActiva) {
		this.corActiva = corActiva;
	}

	public BigDecimal getCorBiomasa() {
		return this.corBiomasa;
	}

	public void setCorBiomasa(BigDecimal corBiomasa) {
		this.corBiomasa = corBiomasa;
	}

	public Date getCorFechaDesde() {
		return this.corFechaDesde;
	}

	public void setCorFechaDesde(Date corFechaDesde) {
		this.corFechaDesde = corFechaDesde;
	}

	public Date getCorFechaHasta() {
		return this.corFechaHasta;
	}

	public void setCorFechaHasta(Date corFechaHasta) {
		this.corFechaHasta = corFechaHasta;
	}

	public Date getCorFechaPesca() {
		return this.corFechaPesca;
	}

	public void setCorFechaPesca(Date corFechaPesca) {
		this.corFechaPesca = corFechaPesca;
	}

	public Date getCorFechaSiembra() {
		return this.corFechaSiembra;
	}

	public void setCorFechaSiembra(Date corFechaSiembra) {
		this.corFechaSiembra = corFechaSiembra;
	}

	public BigDecimal getCorHectareas() {
		return this.corHectareas;
	}

	public void setCorHectareas(BigDecimal corHectareas) {
		this.corHectareas = corHectareas;
	}

	public String getCorLaboratorio() {
		return this.corLaboratorio;
	}

	public void setCorLaboratorio(String corLaboratorio) {
		this.corLaboratorio = corLaboratorio;
	}

	public String getCorNauplio() {
		return this.corNauplio;
	}

	public void setCorNauplio(String corNauplio) {
		this.corNauplio = corNauplio;
	}

	public BigDecimal getCorNumeroLarvas() {
		return this.corNumeroLarvas;
	}

	public void setCorNumeroLarvas(BigDecimal corNumeroLarvas) {
		this.corNumeroLarvas = corNumeroLarvas;
	}

	public String getCorObservaciones() {
		return this.corObservaciones;
	}

	public void setCorObservaciones(String corObservaciones) {
		this.corObservaciones = corObservaciones;
	}

	public BigDecimal getCorPellet() {
		return this.corPellet;
	}

	public void setCorPellet(BigDecimal corPellet) {
		this.corPellet = corPellet;
	}

	public BigDecimal getCorValorVenta() {
		return this.corValorVenta;
	}

	public void setCorValorVenta(BigDecimal corValorVenta) {
		this.corValorVenta = corValorVenta;
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

	public PrdPiscina getPrdPiscina() {
		return this.prdPiscina;
	}

	public void setPrdPiscina(PrdPiscina prdPiscina) {
		this.prdPiscina = prdPiscina;
	}

}
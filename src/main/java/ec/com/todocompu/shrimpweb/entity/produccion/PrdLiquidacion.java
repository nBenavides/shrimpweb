package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the prd_liquidacion database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_liquidacion")
@NamedQuery(name="PrdLiquidacion.findAll", query="SELECT p FROM PrdLiquidacion p")
public class PrdLiquidacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdLiquidacionPK id;

	@Column(name="cli_codigo", nullable=false, length=13)
	private String cliCodigo;

	@Column(name="cli_empresa", nullable=false, length=7)
	private String cliEmpresa;

	@Column(name="liq_animales_cosechados", nullable=false, precision=13, scale=2)
	private BigDecimal liqAnimalesCosechados;

	@Column(name="liq_anulado", nullable=false)
	private Boolean liqAnulado;

	@Temporal(TemporalType.DATE)
	@Column(name="liq_fecha", nullable=false)
	private Date liqFecha;

	@Column(name="liq_libras_basura", nullable=false, precision=13, scale=2)
	private BigDecimal liqLibrasBasura;

	@Column(name="liq_libras_cola", nullable=false, precision=13, scale=2)
	private BigDecimal liqLibrasCola;

	@Column(name="liq_libras_cola_procesadas", nullable=false, precision=13, scale=2)
	private BigDecimal liqLibrasColaProcesadas;

	@Column(name="liq_libras_entero", nullable=false, precision=13, scale=2)
	private BigDecimal liqLibrasEntero;

	@Column(name="liq_libras_enviadas", nullable=false, precision=13, scale=2)
	private BigDecimal liqLibrasEnviadas;

	@Column(name="liq_libras_netas", nullable=false, precision=13, scale=2)
	private BigDecimal liqLibrasNetas;

	@Column(name="liq_libras_recibidas", nullable=false, precision=13, scale=2)
	private BigDecimal liqLibrasRecibidas;

	@Column(name="liq_libras_retiradas", nullable=false, precision=13, scale=2)
	private BigDecimal liqLibrasRetiradas;

	@Column(name="liq_lote", nullable=false, length=7)
	private String liqLote;

	@Column(name="liq_pendiente", nullable=false)
	private Boolean liqPendiente;

	@Column(name="liq_total_monto", nullable=false, precision=13, scale=2)
	private BigDecimal liqTotalMonto;

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

	//bi-directional many-to-one association to PrdLiquidacionDetalle
	@OneToMany(mappedBy="prdLiquidacion")
	private List<PrdLiquidacionDetalle> prdLiquidacionDetalles;

	public PrdLiquidacion() {
	}

	public PrdLiquidacionPK getId() {
		return this.id;
	}

	public void setId(PrdLiquidacionPK id) {
		this.id = id;
	}

	public String getCliCodigo() {
		return this.cliCodigo;
	}

	public void setCliCodigo(String cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public String getCliEmpresa() {
		return this.cliEmpresa;
	}

	public void setCliEmpresa(String cliEmpresa) {
		this.cliEmpresa = cliEmpresa;
	}

	public BigDecimal getLiqAnimalesCosechados() {
		return this.liqAnimalesCosechados;
	}

	public void setLiqAnimalesCosechados(BigDecimal liqAnimalesCosechados) {
		this.liqAnimalesCosechados = liqAnimalesCosechados;
	}

	public Boolean getLiqAnulado() {
		return this.liqAnulado;
	}

	public void setLiqAnulado(Boolean liqAnulado) {
		this.liqAnulado = liqAnulado;
	}

	public Date getLiqFecha() {
		return this.liqFecha;
	}

	public void setLiqFecha(Date liqFecha) {
		this.liqFecha = liqFecha;
	}

	public BigDecimal getLiqLibrasBasura() {
		return this.liqLibrasBasura;
	}

	public void setLiqLibrasBasura(BigDecimal liqLibrasBasura) {
		this.liqLibrasBasura = liqLibrasBasura;
	}

	public BigDecimal getLiqLibrasCola() {
		return this.liqLibrasCola;
	}

	public void setLiqLibrasCola(BigDecimal liqLibrasCola) {
		this.liqLibrasCola = liqLibrasCola;
	}

	public BigDecimal getLiqLibrasColaProcesadas() {
		return this.liqLibrasColaProcesadas;
	}

	public void setLiqLibrasColaProcesadas(BigDecimal liqLibrasColaProcesadas) {
		this.liqLibrasColaProcesadas = liqLibrasColaProcesadas;
	}

	public BigDecimal getLiqLibrasEntero() {
		return this.liqLibrasEntero;
	}

	public void setLiqLibrasEntero(BigDecimal liqLibrasEntero) {
		this.liqLibrasEntero = liqLibrasEntero;
	}

	public BigDecimal getLiqLibrasEnviadas() {
		return this.liqLibrasEnviadas;
	}

	public void setLiqLibrasEnviadas(BigDecimal liqLibrasEnviadas) {
		this.liqLibrasEnviadas = liqLibrasEnviadas;
	}

	public BigDecimal getLiqLibrasNetas() {
		return this.liqLibrasNetas;
	}

	public void setLiqLibrasNetas(BigDecimal liqLibrasNetas) {
		this.liqLibrasNetas = liqLibrasNetas;
	}

	public BigDecimal getLiqLibrasRecibidas() {
		return this.liqLibrasRecibidas;
	}

	public void setLiqLibrasRecibidas(BigDecimal liqLibrasRecibidas) {
		this.liqLibrasRecibidas = liqLibrasRecibidas;
	}

	public BigDecimal getLiqLibrasRetiradas() {
		return this.liqLibrasRetiradas;
	}

	public void setLiqLibrasRetiradas(BigDecimal liqLibrasRetiradas) {
		this.liqLibrasRetiradas = liqLibrasRetiradas;
	}

	public String getLiqLote() {
		return this.liqLote;
	}

	public void setLiqLote(String liqLote) {
		this.liqLote = liqLote;
	}

	public Boolean getLiqPendiente() {
		return this.liqPendiente;
	}

	public void setLiqPendiente(Boolean liqPendiente) {
		this.liqPendiente = liqPendiente;
	}

	public BigDecimal getLiqTotalMonto() {
		return this.liqTotalMonto;
	}

	public void setLiqTotalMonto(BigDecimal liqTotalMonto) {
		this.liqTotalMonto = liqTotalMonto;
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

	public List<PrdLiquidacionDetalle> getPrdLiquidacionDetalles() {
		return this.prdLiquidacionDetalles;
	}

	public void setPrdLiquidacionDetalles(List<PrdLiquidacionDetalle> prdLiquidacionDetalles) {
		this.prdLiquidacionDetalles = prdLiquidacionDetalles;
	}

	public PrdLiquidacionDetalle addPrdLiquidacionDetalle(PrdLiquidacionDetalle prdLiquidacionDetalle) {
		getPrdLiquidacionDetalles().add(prdLiquidacionDetalle);
		prdLiquidacionDetalle.setPrdLiquidacion(this);

		return prdLiquidacionDetalle;
	}

	public PrdLiquidacionDetalle removePrdLiquidacionDetalle(PrdLiquidacionDetalle prdLiquidacionDetalle) {
		getPrdLiquidacionDetalles().remove(prdLiquidacionDetalle);
		prdLiquidacionDetalle.setPrdLiquidacion(null);

		return prdLiquidacionDetalle;
	}

}
package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the prd_liquidacion_detalle database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_liquidacion_detalle")
@NamedQuery(name="PrdLiquidacionDetalle.findAll", query="SELECT p FROM PrdLiquidacionDetalle p")
public class PrdLiquidacionDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="det_secuencial", unique=true, nullable=false)
	private Integer detSecuencial;

	@Column(name="det_libras", nullable=false, precision=13, scale=2)
	private BigDecimal detLibras;

	@Column(name="det_orden", nullable=false)
	private Integer detOrden;

	@Column(name="det_precio", nullable=false, precision=13, scale=2)
	private BigDecimal detPrecio;

	//bi-directional many-to-one association to PrdLiquidacion
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="liq_empresa", referencedColumnName="liq_empresa", nullable=false),
		@JoinColumn(name="liq_motivo", referencedColumnName="liq_motivo", nullable=false),
		@JoinColumn(name="liq_numero", referencedColumnName="liq_numero", nullable=false)
		})
	private PrdLiquidacion prdLiquidacion;

	//bi-directional many-to-one association to PrdLiquidacionProducto
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="prod_codigo", referencedColumnName="prod_codigo", nullable=false),
		@JoinColumn(name="prod_empresa", referencedColumnName="prod_empresa", nullable=false)
		})
	private PrdLiquidacionProducto prdLiquidacionProducto;

	//bi-directional many-to-one association to PrdLiquidacionTalla
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="talla_codigo", referencedColumnName="talla_codigo", nullable=false),
		@JoinColumn(name="talla_empresa", referencedColumnName="talla_empresa", nullable=false)
		})
	private PrdLiquidacionTalla prdLiquidacionTalla;

	public PrdLiquidacionDetalle() {
	}

	public Integer getDetSecuencial() {
		return this.detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public BigDecimal getDetLibras() {
		return this.detLibras;
	}

	public void setDetLibras(BigDecimal detLibras) {
		this.detLibras = detLibras;
	}

	public Integer getDetOrden() {
		return this.detOrden;
	}

	public void setDetOrden(Integer detOrden) {
		this.detOrden = detOrden;
	}

	public BigDecimal getDetPrecio() {
		return this.detPrecio;
	}

	public void setDetPrecio(BigDecimal detPrecio) {
		this.detPrecio = detPrecio;
	}

	public PrdLiquidacion getPrdLiquidacion() {
		return this.prdLiquidacion;
	}

	public void setPrdLiquidacion(PrdLiquidacion prdLiquidacion) {
		this.prdLiquidacion = prdLiquidacion;
	}

	public PrdLiquidacionProducto getPrdLiquidacionProducto() {
		return this.prdLiquidacionProducto;
	}

	public void setPrdLiquidacionProducto(PrdLiquidacionProducto prdLiquidacionProducto) {
		this.prdLiquidacionProducto = prdLiquidacionProducto;
	}

	public PrdLiquidacionTalla getPrdLiquidacionTalla() {
		return this.prdLiquidacionTalla;
	}

	public void setPrdLiquidacionTalla(PrdLiquidacionTalla prdLiquidacionTalla) {
		this.prdLiquidacionTalla = prdLiquidacionTalla;
	}

}
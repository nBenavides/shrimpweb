package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the prd_liquidacion_producto database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_liquidacion_producto")
@NamedQuery(name="PrdLiquidacionProducto.findAll", query="SELECT p FROM PrdLiquidacionProducto p")
public class PrdLiquidacionProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdLiquidacionProductoPK id;

	@Column(name="prod_clase", nullable=false, length=1)
	private String prodClase;

	@Column(name="prod_detalle", nullable=false, length=50)
	private String prodDetalle;

	@Column(name="prod_inactivo", nullable=false)
	private Boolean prodInactivo;

	@Column(name="prod_tipo", nullable=false, length=10)
	private String prodTipo;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_empresa", nullable=false, length=7)
	private String usrEmpresa;

	@Column(name="usr_fecha_inserta", nullable=false)
	private Timestamp usrFechaInserta;

	//bi-directional many-to-one association to PrdLiquidacionDetalle
	@OneToMany(mappedBy="prdLiquidacionProducto")
	private List<PrdLiquidacionDetalle> prdLiquidacionDetalles;

	public PrdLiquidacionProducto() {
	}

	public PrdLiquidacionProductoPK getId() {
		return this.id;
	}

	public void setId(PrdLiquidacionProductoPK id) {
		this.id = id;
	}

	public String getProdClase() {
		return this.prodClase;
	}

	public void setProdClase(String prodClase) {
		this.prodClase = prodClase;
	}

	public String getProdDetalle() {
		return this.prodDetalle;
	}

	public void setProdDetalle(String prodDetalle) {
		this.prodDetalle = prodDetalle;
	}

	public Boolean getProdInactivo() {
		return this.prodInactivo;
	}

	public void setProdInactivo(Boolean prodInactivo) {
		this.prodInactivo = prodInactivo;
	}

	public String getProdTipo() {
		return this.prodTipo;
	}

	public void setProdTipo(String prodTipo) {
		this.prodTipo = prodTipo;
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

	public List<PrdLiquidacionDetalle> getPrdLiquidacionDetalles() {
		return this.prdLiquidacionDetalles;
	}

	public void setPrdLiquidacionDetalles(List<PrdLiquidacionDetalle> prdLiquidacionDetalles) {
		this.prdLiquidacionDetalles = prdLiquidacionDetalles;
	}

	public PrdLiquidacionDetalle addPrdLiquidacionDetalle(PrdLiquidacionDetalle prdLiquidacionDetalle) {
		getPrdLiquidacionDetalles().add(prdLiquidacionDetalle);
		prdLiquidacionDetalle.setPrdLiquidacionProducto(this);

		return prdLiquidacionDetalle;
	}

	public PrdLiquidacionDetalle removePrdLiquidacionDetalle(PrdLiquidacionDetalle prdLiquidacionDetalle) {
		getPrdLiquidacionDetalles().remove(prdLiquidacionDetalle);
		prdLiquidacionDetalle.setPrdLiquidacionProducto(null);

		return prdLiquidacionDetalle;
	}

}
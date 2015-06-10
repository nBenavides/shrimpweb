package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the prd_liquidacion_talla database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_liquidacion_talla")
@NamedQuery(name="PrdLiquidacionTalla.findAll", query="SELECT p FROM PrdLiquidacionTalla p")
public class PrdLiquidacionTalla implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdLiquidacionTallaPK id;

	@Column(name="talla_detalle", nullable=false, length=50)
	private String tallaDetalle;

	@Column(name="talla_inactivo", nullable=false)
	private Boolean tallaInactivo;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_empresa", nullable=false, length=7)
	private String usrEmpresa;

	@Column(name="usr_fecha_inserta", nullable=false)
	private Timestamp usrFechaInserta;

	//bi-directional many-to-one association to PrdLiquidacionDetalle
	@OneToMany(mappedBy="prdLiquidacionTalla")
	private List<PrdLiquidacionDetalle> prdLiquidacionDetalles;

	public PrdLiquidacionTalla() {
	}

	public PrdLiquidacionTallaPK getId() {
		return this.id;
	}

	public void setId(PrdLiquidacionTallaPK id) {
		this.id = id;
	}

	public String getTallaDetalle() {
		return this.tallaDetalle;
	}

	public void setTallaDetalle(String tallaDetalle) {
		this.tallaDetalle = tallaDetalle;
	}

	public Boolean getTallaInactivo() {
		return this.tallaInactivo;
	}

	public void setTallaInactivo(Boolean tallaInactivo) {
		this.tallaInactivo = tallaInactivo;
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
		prdLiquidacionDetalle.setPrdLiquidacionTalla(this);

		return prdLiquidacionDetalle;
	}

	public PrdLiquidacionDetalle removePrdLiquidacionDetalle(PrdLiquidacionDetalle prdLiquidacionDetalle) {
		getPrdLiquidacionDetalles().remove(prdLiquidacionDetalle);
		prdLiquidacionDetalle.setPrdLiquidacionTalla(null);

		return prdLiquidacionDetalle;
	}

}
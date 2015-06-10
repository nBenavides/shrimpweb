package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the prd_piscina database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_piscina")
@NamedQuery(name="PrdPiscina.findAll", query="SELECT p FROM PrdPiscina p")
public class PrdPiscina implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdPiscinaPK id;

	@Column(name="pis_activa")
	private Boolean pisActiva;

	@Column(name="pis_hectareaje", nullable=false, precision=9, scale=2)
	private BigDecimal pisHectareaje;

	@Column(name="pis_nombre", nullable=false, length=50)
	private String pisNombre;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_empresa", nullable=false, length=7)
	private String usrEmpresa;

	@Column(name="usr_fecha_inserta", nullable=false)
	private Timestamp usrFechaInserta;

	//bi-directional many-to-one association to PrdCorrida
	@OneToMany(mappedBy="prdPiscina")
	private List<PrdCorrida> prdCorridas;

	//bi-directional many-to-one association to PrdGrameaje
	@OneToMany(mappedBy="prdPiscina")
	private List<PrdGrameaje> prdGrameajes;

	//bi-directional many-to-one association to PrdLiquidacion
	@OneToMany(mappedBy="prdPiscina")
	private List<PrdLiquidacion> prdLiquidacions;

	//bi-directional many-to-one association to PrdSector
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="sec_codigo", referencedColumnName="sec_codigo", nullable=false),
		@JoinColumn(name="sec_empresa", referencedColumnName="sec_empresa", nullable=false)
		})
	private PrdSector prdSector;

	//bi-directional many-to-one association to PrdVehiculo
	@OneToMany(mappedBy="prdPiscina")
	private List<PrdVehiculo> prdVehiculos;

	public PrdPiscina() {
	}

	public PrdPiscinaPK getId() {
		return this.id;
	}

	public void setId(PrdPiscinaPK id) {
		this.id = id;
	}

	public Boolean getPisActiva() {
		return this.pisActiva;
	}

	public void setPisActiva(Boolean pisActiva) {
		this.pisActiva = pisActiva;
	}

	public BigDecimal getPisHectareaje() {
		return this.pisHectareaje;
	}

	public void setPisHectareaje(BigDecimal pisHectareaje) {
		this.pisHectareaje = pisHectareaje;
	}

	public String getPisNombre() {
		return this.pisNombre;
	}

	public void setPisNombre(String pisNombre) {
		this.pisNombre = pisNombre;
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

	public List<PrdCorrida> getPrdCorridas() {
		return this.prdCorridas;
	}

	public void setPrdCorridas(List<PrdCorrida> prdCorridas) {
		this.prdCorridas = prdCorridas;
	}

	public PrdCorrida addPrdCorrida(PrdCorrida prdCorrida) {
		getPrdCorridas().add(prdCorrida);
		prdCorrida.setPrdPiscina(this);

		return prdCorrida;
	}

	public PrdCorrida removePrdCorrida(PrdCorrida prdCorrida) {
		getPrdCorridas().remove(prdCorrida);
		prdCorrida.setPrdPiscina(null);

		return prdCorrida;
	}

	public List<PrdGrameaje> getPrdGrameajes() {
		return this.prdGrameajes;
	}

	public void setPrdGrameajes(List<PrdGrameaje> prdGrameajes) {
		this.prdGrameajes = prdGrameajes;
	}

	public PrdGrameaje addPrdGrameaje(PrdGrameaje prdGrameaje) {
		getPrdGrameajes().add(prdGrameaje);
		prdGrameaje.setPrdPiscina(this);

		return prdGrameaje;
	}

	public PrdGrameaje removePrdGrameaje(PrdGrameaje prdGrameaje) {
		getPrdGrameajes().remove(prdGrameaje);
		prdGrameaje.setPrdPiscina(null);

		return prdGrameaje;
	}

	public List<PrdLiquidacion> getPrdLiquidacions() {
		return this.prdLiquidacions;
	}

	public void setPrdLiquidacions(List<PrdLiquidacion> prdLiquidacions) {
		this.prdLiquidacions = prdLiquidacions;
	}

	public PrdLiquidacion addPrdLiquidacion(PrdLiquidacion prdLiquidacion) {
		getPrdLiquidacions().add(prdLiquidacion);
		prdLiquidacion.setPrdPiscina(this);

		return prdLiquidacion;
	}

	public PrdLiquidacion removePrdLiquidacion(PrdLiquidacion prdLiquidacion) {
		getPrdLiquidacions().remove(prdLiquidacion);
		prdLiquidacion.setPrdPiscina(null);

		return prdLiquidacion;
	}

	public PrdSector getPrdSector() {
		return this.prdSector;
	}

	public void setPrdSector(PrdSector prdSector) {
		this.prdSector = prdSector;
	}

	public List<PrdVehiculo> getPrdVehiculos() {
		return this.prdVehiculos;
	}

	public void setPrdVehiculos(List<PrdVehiculo> prdVehiculos) {
		this.prdVehiculos = prdVehiculos;
	}

	public PrdVehiculo addPrdVehiculo(PrdVehiculo prdVehiculo) {
		getPrdVehiculos().add(prdVehiculo);
		prdVehiculo.setPrdPiscina(this);

		return prdVehiculo;
	}

	public PrdVehiculo removePrdVehiculo(PrdVehiculo prdVehiculo) {
		getPrdVehiculos().remove(prdVehiculo);
		prdVehiculo.setPrdPiscina(null);

		return prdVehiculo;
	}

}
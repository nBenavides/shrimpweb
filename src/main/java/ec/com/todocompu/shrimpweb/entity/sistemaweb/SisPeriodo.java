package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the sis_periodo database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="sis_periodo")
@NamedQuery(name="SisPeriodo.findAll", query="SELECT s FROM SisPeriodo s")
public class SisPeriodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SisPeriodoPK id;

	@Column(name="per_cerrado", nullable=false)
	private Boolean perCerrado;

	@Temporal(TemporalType.DATE)
	@Column(name="per_desde", nullable=false)
	private Date perDesde;

	@Column(name="per_detalle", nullable=false, length=50)
	private String perDetalle;

	@Temporal(TemporalType.DATE)
	@Column(name="per_hasta", nullable=false)
	private Date perHasta;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_fecha_inserta_periodo", nullable=false)
	private Timestamp usrFechaInsertaPeriodo;

	//bi-directional many-to-one association to SisEmpresa
	@ManyToOne
	@JoinColumn(name="emp_codigo", nullable=false)
	private SisEmpresa sisEmpresa;

	public SisPeriodo() {
	}

	public SisPeriodoPK getId() {
		return this.id;
	}

	public void setId(SisPeriodoPK id) {
		this.id = id;
	}

	public Boolean getPerCerrado() {
		return this.perCerrado;
	}

	public void setPerCerrado(Boolean perCerrado) {
		this.perCerrado = perCerrado;
	}

	public Date getPerDesde() {
		return this.perDesde;
	}

	public void setPerDesde(Date perDesde) {
		this.perDesde = perDesde;
	}

	public String getPerDetalle() {
		return this.perDetalle;
	}

	public void setPerDetalle(String perDetalle) {
		this.perDetalle = perDetalle;
	}

	public Date getPerHasta() {
		return this.perHasta;
	}

	public void setPerHasta(Date perHasta) {
		this.perHasta = perHasta;
	}

	public String getUsrCodigo() {
		return this.usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public Timestamp getUsrFechaInsertaPeriodo() {
		return this.usrFechaInsertaPeriodo;
	}

	public void setUsrFechaInsertaPeriodo(Timestamp usrFechaInsertaPeriodo) {
		this.usrFechaInsertaPeriodo = usrFechaInsertaPeriodo;
	}

	public SisEmpresa getSisEmpresa() {
		return this.sisEmpresa;
	}

	public void setSisEmpresa(SisEmpresa sisEmpresa) {
		this.sisEmpresa = sisEmpresa;
	}

}
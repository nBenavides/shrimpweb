package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the prd_sobrevivencia database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_sobrevivencia")
@NamedQuery(name="PrdSobrevivencia.findAll", query="SELECT p FROM PrdSobrevivencia p")
public class PrdSobrevivencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sob_codigo", unique=true, nullable=false)
	private Integer sobCodigo;

	@Column(name="sob_alimentacion", nullable=false, precision=6, scale=2)
	private BigDecimal sobAlimentacion;

	@Column(name="sob_dias_desde", nullable=false, precision=6)
	private BigDecimal sobDiasDesde;

	@Column(name="sob_dias_hasta", nullable=false, precision=6)
	private BigDecimal sobDiasHasta;

	@Column(name="sob_sobrevivencia", nullable=false, precision=6, scale=2)
	private BigDecimal sobSobrevivencia;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_empresa", nullable=false, length=7)
	private String usrEmpresa;

	@Column(name="usr_fecha_inserta", nullable=false)
	private Timestamp usrFechaInserta;

	//bi-directional many-to-one association to PrdSector
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="sec_codigo", referencedColumnName="sec_codigo", nullable=false),
		@JoinColumn(name="sec_empresa", referencedColumnName="sec_empresa", nullable=false)
		})
	private PrdSector prdSector;

	public PrdSobrevivencia() {
	}

	public Integer getSobCodigo() {
		return this.sobCodigo;
	}

	public void setSobCodigo(Integer sobCodigo) {
		this.sobCodigo = sobCodigo;
	}

	public BigDecimal getSobAlimentacion() {
		return this.sobAlimentacion;
	}

	public void setSobAlimentacion(BigDecimal sobAlimentacion) {
		this.sobAlimentacion = sobAlimentacion;
	}

	public BigDecimal getSobDiasDesde() {
		return this.sobDiasDesde;
	}

	public void setSobDiasDesde(BigDecimal sobDiasDesde) {
		this.sobDiasDesde = sobDiasDesde;
	}

	public BigDecimal getSobDiasHasta() {
		return this.sobDiasHasta;
	}

	public void setSobDiasHasta(BigDecimal sobDiasHasta) {
		this.sobDiasHasta = sobDiasHasta;
	}

	public BigDecimal getSobSobrevivencia() {
		return this.sobSobrevivencia;
	}

	public void setSobSobrevivencia(BigDecimal sobSobrevivencia) {
		this.sobSobrevivencia = sobSobrevivencia;
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

	public PrdSector getPrdSector() {
		return this.prdSector;
	}

	public void setPrdSector(PrdSector prdSector) {
		this.prdSector = prdSector;
	}

}
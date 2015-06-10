package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the prd_grameaje database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_grameaje")
@NamedQuery(name="PrdGrameaje.findAll", query="SELECT p FROM PrdGrameaje p")
public class PrdGrameaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdGrameajePK id;

	@Column(name="gra_alimentacion", precision=6, scale=2)
	private BigDecimal graAlimentacion;

	@Column(name="gra_anulado")
	private Boolean graAnulado;

	@Column(name="gra_biomasa", precision=9, scale=2)
	private BigDecimal graBiomasa;

	@Column(name="gra_comentario", length=50)
	private String graComentario;

	@Column(name="gra_costo_directo", precision=9, scale=2)
	private BigDecimal graCostoDirecto;

	@Column(name="gra_costo_indirecto", precision=9, scale=2)
	private BigDecimal graCostoIndirecto;

	@Column(name="gra_ipromedio", precision=6, scale=2)
	private BigDecimal graIpromedio;

	@Column(name="gra_itgrande", precision=6, scale=2)
	private BigDecimal graItgrande;

	@Column(name="gra_itmediano", precision=6, scale=2)
	private BigDecimal graItmediano;

	@Column(name="gra_itpequeno", precision=6, scale=2)
	private BigDecimal graItpequeno;

	@Column(name="gra_libras_balanceado", precision=9, scale=2)
	private BigDecimal graLibrasBalanceado;

	@Column(name="gra_sobrevivencia", precision=6, scale=2)
	private BigDecimal graSobrevivencia;

	@Column(name="gra_tgrande", nullable=false, precision=6, scale=2)
	private BigDecimal graTgrande;

	@Column(name="gra_tmediano", precision=6, scale=2)
	private BigDecimal graTmediano;

	@Column(name="gra_tpequeno", precision=6, scale=2)
	private BigDecimal graTpequeno;

	@Column(name="gra_tpromedio", precision=6, scale=2)
	private BigDecimal graTpromedio;

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

	public PrdGrameaje() {
	}

	public PrdGrameajePK getId() {
		return this.id;
	}

	public void setId(PrdGrameajePK id) {
		this.id = id;
	}

	public BigDecimal getGraAlimentacion() {
		return this.graAlimentacion;
	}

	public void setGraAlimentacion(BigDecimal graAlimentacion) {
		this.graAlimentacion = graAlimentacion;
	}

	public Boolean getGraAnulado() {
		return this.graAnulado;
	}

	public void setGraAnulado(Boolean graAnulado) {
		this.graAnulado = graAnulado;
	}

	public BigDecimal getGraBiomasa() {
		return this.graBiomasa;
	}

	public void setGraBiomasa(BigDecimal graBiomasa) {
		this.graBiomasa = graBiomasa;
	}

	public String getGraComentario() {
		return this.graComentario;
	}

	public void setGraComentario(String graComentario) {
		this.graComentario = graComentario;
	}

	public BigDecimal getGraCostoDirecto() {
		return this.graCostoDirecto;
	}

	public void setGraCostoDirecto(BigDecimal graCostoDirecto) {
		this.graCostoDirecto = graCostoDirecto;
	}

	public BigDecimal getGraCostoIndirecto() {
		return this.graCostoIndirecto;
	}

	public void setGraCostoIndirecto(BigDecimal graCostoIndirecto) {
		this.graCostoIndirecto = graCostoIndirecto;
	}

	public BigDecimal getGraIpromedio() {
		return this.graIpromedio;
	}

	public void setGraIpromedio(BigDecimal graIpromedio) {
		this.graIpromedio = graIpromedio;
	}

	public BigDecimal getGraItgrande() {
		return this.graItgrande;
	}

	public void setGraItgrande(BigDecimal graItgrande) {
		this.graItgrande = graItgrande;
	}

	public BigDecimal getGraItmediano() {
		return this.graItmediano;
	}

	public void setGraItmediano(BigDecimal graItmediano) {
		this.graItmediano = graItmediano;
	}

	public BigDecimal getGraItpequeno() {
		return this.graItpequeno;
	}

	public void setGraItpequeno(BigDecimal graItpequeno) {
		this.graItpequeno = graItpequeno;
	}

	public BigDecimal getGraLibrasBalanceado() {
		return this.graLibrasBalanceado;
	}

	public void setGraLibrasBalanceado(BigDecimal graLibrasBalanceado) {
		this.graLibrasBalanceado = graLibrasBalanceado;
	}

	public BigDecimal getGraSobrevivencia() {
		return this.graSobrevivencia;
	}

	public void setGraSobrevivencia(BigDecimal graSobrevivencia) {
		this.graSobrevivencia = graSobrevivencia;
	}

	public BigDecimal getGraTgrande() {
		return this.graTgrande;
	}

	public void setGraTgrande(BigDecimal graTgrande) {
		this.graTgrande = graTgrande;
	}

	public BigDecimal getGraTmediano() {
		return this.graTmediano;
	}

	public void setGraTmediano(BigDecimal graTmediano) {
		this.graTmediano = graTmediano;
	}

	public BigDecimal getGraTpequeno() {
		return this.graTpequeno;
	}

	public void setGraTpequeno(BigDecimal graTpequeno) {
		this.graTpequeno = graTpequeno;
	}

	public BigDecimal getGraTpromedio() {
		return this.graTpromedio;
	}

	public void setGraTpromedio(BigDecimal graTpromedio) {
		this.graTpromedio = graTpromedio;
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
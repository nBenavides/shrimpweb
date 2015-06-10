package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sis_empresa_parametros database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="sis_empresa_parametros")
@NamedQuery(name="SisEmpresaParametro.findAll", query="SELECT s FROM SisEmpresaParametro s")
public class SisEmpresaParametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="par_empresa", unique=true, nullable=false, length=7)
	private String parEmpresa;

	@Column(name="par_actividad", nullable=false, length=15)
	private String parActividad;

	@Column(name="par_codigo_dinardap", length=7)
	private String parCodigoDinardap;

	@Column(name="par_columnas_estados_financieros", nullable=false, precision=1)
	private BigDecimal parColumnasEstadosFinancieros;

	@Column(name="par_contador", length=50)
	private String parContador;

	@Column(name="par_contador_ruc", length=13)
	private String parContadorRuc;

	@Column(name="par_escoger_precio_por", nullable=false, length=15)
	private String parEscogerPrecioPor;

	@Column(name="par_financiero", length=50)
	private String parFinanciero;

	@Column(name="par_financiero_id", length=10)
	private String parFinancieroId;

	@Column(name="par_gerente", length=50)
	private String parGerente;

	@Column(name="par_gerente_id", length=10)
	private String parGerenteId;

	@Column(name="par_gerente_tipo_id", length=1)
	private String parGerenteTipoId;

	@Column(name="par_obligado_llevar_contabilidad", nullable=false)
	private Boolean parObligadoLlevarContabilidad;

	@Column(name="par_resolucion_contribuyente_especial", nullable=false, length=5)
	private String parResolucionContribuyenteEspecial;

	//bi-directional many-to-one association to SisEmpresa
	@ManyToOne
	@JoinColumn(name="emp_codigo", nullable=false)
	private SisEmpresa sisEmpresa;

	public SisEmpresaParametro() {
	}

	public String getParEmpresa() {
		return this.parEmpresa;
	}

	public void setParEmpresa(String parEmpresa) {
		this.parEmpresa = parEmpresa;
	}

	public String getParActividad() {
		return this.parActividad;
	}

	public void setParActividad(String parActividad) {
		this.parActividad = parActividad;
	}

	public String getParCodigoDinardap() {
		return this.parCodigoDinardap;
	}

	public void setParCodigoDinardap(String parCodigoDinardap) {
		this.parCodigoDinardap = parCodigoDinardap;
	}

	public BigDecimal getParColumnasEstadosFinancieros() {
		return this.parColumnasEstadosFinancieros;
	}

	public void setParColumnasEstadosFinancieros(BigDecimal parColumnasEstadosFinancieros) {
		this.parColumnasEstadosFinancieros = parColumnasEstadosFinancieros;
	}

	public String getParContador() {
		return this.parContador;
	}

	public void setParContador(String parContador) {
		this.parContador = parContador;
	}

	public String getParContadorRuc() {
		return this.parContadorRuc;
	}

	public void setParContadorRuc(String parContadorRuc) {
		this.parContadorRuc = parContadorRuc;
	}

	public String getParEscogerPrecioPor() {
		return this.parEscogerPrecioPor;
	}

	public void setParEscogerPrecioPor(String parEscogerPrecioPor) {
		this.parEscogerPrecioPor = parEscogerPrecioPor;
	}

	public String getParFinanciero() {
		return this.parFinanciero;
	}

	public void setParFinanciero(String parFinanciero) {
		this.parFinanciero = parFinanciero;
	}

	public String getParFinancieroId() {
		return this.parFinancieroId;
	}

	public void setParFinancieroId(String parFinancieroId) {
		this.parFinancieroId = parFinancieroId;
	}

	public String getParGerente() {
		return this.parGerente;
	}

	public void setParGerente(String parGerente) {
		this.parGerente = parGerente;
	}

	public String getParGerenteId() {
		return this.parGerenteId;
	}

	public void setParGerenteId(String parGerenteId) {
		this.parGerenteId = parGerenteId;
	}

	public String getParGerenteTipoId() {
		return this.parGerenteTipoId;
	}

	public void setParGerenteTipoId(String parGerenteTipoId) {
		this.parGerenteTipoId = parGerenteTipoId;
	}

	public Boolean getParObligadoLlevarContabilidad() {
		return this.parObligadoLlevarContabilidad;
	}

	public void setParObligadoLlevarContabilidad(Boolean parObligadoLlevarContabilidad) {
		this.parObligadoLlevarContabilidad = parObligadoLlevarContabilidad;
	}

	public String getParResolucionContribuyenteEspecial() {
		return this.parResolucionContribuyenteEspecial;
	}

	public void setParResolucionContribuyenteEspecial(String parResolucionContribuyenteEspecial) {
		this.parResolucionContribuyenteEspecial = parResolucionContribuyenteEspecial;
	}

	public SisEmpresa getSisEmpresa() {
		return this.sisEmpresa;
	}

	public void setSisEmpresa(SisEmpresa sisEmpresa) {
		this.sisEmpresa = sisEmpresa;
	}

}
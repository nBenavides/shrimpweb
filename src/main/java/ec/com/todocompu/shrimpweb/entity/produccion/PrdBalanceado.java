package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the prd_balanceado database table.
 * 
 */
@Entity
@Table(schema="produccion", name="prd_balanceado")
@NamedQuery(name="PrdBalanceado.findAll", query="SELECT p FROM PrdBalanceado p")
public class PrdBalanceado implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdBalanceadoPK id;

	@Column(name="bal_factor_libras", nullable=false)
	private double balFactorLibras;

	@Column(name="pro_codigo_principal", nullable=false, length=7)
	private String proCodigoPrincipal;

	@Column(name="pro_empresa", nullable=false, length=7)
	private String proEmpresa;

	public PrdBalanceado() {
	}

	public PrdBalanceadoPK getId() {
		return this.id;
	}

	public void setId(PrdBalanceadoPK id) {
		this.id = id;
	}

	public double getBalFactorLibras() {
		return this.balFactorLibras;
	}

	public void setBalFactorLibras(double balFactorLibras) {
		this.balFactorLibras = balFactorLibras;
	}

	public String getProCodigoPrincipal() {
		return this.proCodigoPrincipal;
	}

	public void setProCodigoPrincipal(String proCodigoPrincipal) {
		this.proCodigoPrincipal = proCodigoPrincipal;
	}

	public String getProEmpresa() {
		return this.proEmpresa;
	}

	public void setProEmpresa(String proEmpresa) {
		this.proEmpresa = proEmpresa;
	}

}
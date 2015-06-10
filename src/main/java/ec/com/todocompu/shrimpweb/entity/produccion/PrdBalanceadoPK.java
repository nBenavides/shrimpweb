package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_balanceado database table.
 * 
 */
@Embeddable
public class PrdBalanceadoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="bal_empresa", unique=true, nullable=false, length=7)
	private String balEmpresa;

	@Column(name="bal_codigo_principal", unique=true, nullable=false, length=7)
	private String balCodigoPrincipal;

	public PrdBalanceadoPK() {
	}
	public String getBalEmpresa() {
		return this.balEmpresa;
	}
	public void setBalEmpresa(String balEmpresa) {
		this.balEmpresa = balEmpresa;
	}
	public String getBalCodigoPrincipal() {
		return this.balCodigoPrincipal;
	}
	public void setBalCodigoPrincipal(String balCodigoPrincipal) {
		this.balCodigoPrincipal = balCodigoPrincipal;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdBalanceadoPK)) {
			return false;
		}
		PrdBalanceadoPK castOther = (PrdBalanceadoPK)other;
		return 
			this.balEmpresa.equals(castOther.balEmpresa)
			&& this.balCodigoPrincipal.equals(castOther.balCodigoPrincipal);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.balEmpresa.hashCode();
		hash = hash * prime + this.balCodigoPrincipal.hashCode();
		
		return hash;
	}
}
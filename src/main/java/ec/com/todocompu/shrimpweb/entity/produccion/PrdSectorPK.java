package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_sector database table.
 * 
 */
@Embeddable
public class PrdSectorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="sec_empresa", unique=true, nullable=false, length=7)
	private String secEmpresa;

	@Column(name="sec_codigo", unique=true, nullable=false, length=7)
	private String secCodigo;

	public PrdSectorPK() {
	}
	public String getSecEmpresa() {
		return this.secEmpresa;
	}
	public void setSecEmpresa(String secEmpresa) {
		this.secEmpresa = secEmpresa;
	}
	public String getSecCodigo() {
		return this.secCodigo;
	}
	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdSectorPK)) {
			return false;
		}
		PrdSectorPK castOther = (PrdSectorPK)other;
		return 
			this.secEmpresa.equals(castOther.secEmpresa)
			&& this.secCodigo.equals(castOther.secCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.secEmpresa.hashCode();
		hash = hash * prime + this.secCodigo.hashCode();
		
		return hash;
	}
}
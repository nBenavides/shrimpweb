package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sis_periodo database table.
 * 
 */
@Embeddable
public class SisPeriodoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="per_empresa", unique=true, nullable=false, length=7)
	private String perEmpresa;

	@Column(name="per_codigo", unique=true, nullable=false, length=7)
	private String perCodigo;

	public SisPeriodoPK() {
	}
	public String getPerEmpresa() {
		return this.perEmpresa;
	}
	public void setPerEmpresa(String perEmpresa) {
		this.perEmpresa = perEmpresa;
	}
	public String getPerCodigo() {
		return this.perCodigo;
	}
	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SisPeriodoPK)) {
			return false;
		}
		SisPeriodoPK castOther = (SisPeriodoPK)other;
		return 
			this.perEmpresa.equals(castOther.perEmpresa)
			&& this.perCodigo.equals(castOther.perCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.perEmpresa.hashCode();
		hash = hash * prime + this.perCodigo.hashCode();
		
		return hash;
	}
}
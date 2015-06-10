package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_corrida database table.
 * 
 */
@Embeddable
public class PrdCorridaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cor_empresa", unique=true, nullable=false, length=7)
	private String corEmpresa;

	@Column(name="cor_sector", unique=true, nullable=false, length=7)
	private String corSector;

	@Column(name="cor_piscina", unique=true, nullable=false, length=7)
	private String corPiscina;

	@Column(name="cor_numero", unique=true, nullable=false, length=7)
	private String corNumero;

	public PrdCorridaPK() {
	}
	public String getCorEmpresa() {
		return this.corEmpresa;
	}
	public void setCorEmpresa(String corEmpresa) {
		this.corEmpresa = corEmpresa;
	}
	public String getCorSector() {
		return this.corSector;
	}
	public void setCorSector(String corSector) {
		this.corSector = corSector;
	}
	public String getCorPiscina() {
		return this.corPiscina;
	}
	public void setCorPiscina(String corPiscina) {
		this.corPiscina = corPiscina;
	}
	public String getCorNumero() {
		return this.corNumero;
	}
	public void setCorNumero(String corNumero) {
		this.corNumero = corNumero;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdCorridaPK)) {
			return false;
		}
		PrdCorridaPK castOther = (PrdCorridaPK)other;
		return 
			this.corEmpresa.equals(castOther.corEmpresa)
			&& this.corSector.equals(castOther.corSector)
			&& this.corPiscina.equals(castOther.corPiscina)
			&& this.corNumero.equals(castOther.corNumero);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.corEmpresa.hashCode();
		hash = hash * prime + this.corSector.hashCode();
		hash = hash * prime + this.corPiscina.hashCode();
		hash = hash * prime + this.corNumero.hashCode();
		
		return hash;
	}
}
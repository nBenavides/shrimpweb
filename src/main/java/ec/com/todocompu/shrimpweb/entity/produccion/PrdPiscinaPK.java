package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_piscina database table.
 * 
 */
@Embeddable
public class PrdPiscinaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="pis_empresa", unique=true, nullable=false, length=7)
	private String pisEmpresa;

	@Column(name="pis_sector", unique=true, nullable=false, length=7)
	private String pisSector;

	@Column(name="pis_numero", unique=true, nullable=false, length=7)
	private String pisNumero;

	public PrdPiscinaPK() {
	}
	public String getPisEmpresa() {
		return this.pisEmpresa;
	}
	public void setPisEmpresa(String pisEmpresa) {
		this.pisEmpresa = pisEmpresa;
	}
	public String getPisSector() {
		return this.pisSector;
	}
	public void setPisSector(String pisSector) {
		this.pisSector = pisSector;
	}
	public String getPisNumero() {
		return this.pisNumero;
	}
	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdPiscinaPK)) {
			return false;
		}
		PrdPiscinaPK castOther = (PrdPiscinaPK)other;
		return 
			this.pisEmpresa.equals(castOther.pisEmpresa)
			&& this.pisSector.equals(castOther.pisSector)
			&& this.pisNumero.equals(castOther.pisNumero);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pisEmpresa.hashCode();
		hash = hash * prime + this.pisSector.hashCode();
		hash = hash * prime + this.pisNumero.hashCode();
		
		return hash;
	}
}
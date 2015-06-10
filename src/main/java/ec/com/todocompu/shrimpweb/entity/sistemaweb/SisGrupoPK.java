package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sis_grupo database table.
 * 
 */
@Embeddable
public class SisGrupoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="gru_empresa", unique=true, nullable=false, length=7)
	private String gruEmpresa;

	@Column(name="gru_codigo", unique=true, nullable=false, length=7)
	private String gruCodigo;

	public SisGrupoPK() {
	}
	public String getGruEmpresa() {
		return this.gruEmpresa;
	}
	public void setGruEmpresa(String gruEmpresa) {
		this.gruEmpresa = gruEmpresa;
	}
	public String getGruCodigo() {
		return this.gruCodigo;
	}
	public void setGruCodigo(String gruCodigo) {
		this.gruCodigo = gruCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SisGrupoPK)) {
			return false;
		}
		SisGrupoPK castOther = (SisGrupoPK)other;
		return 
			this.gruEmpresa.equals(castOther.gruEmpresa)
			&& this.gruCodigo.equals(castOther.gruCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.gruEmpresa.hashCode();
		hash = hash * prime + this.gruCodigo.hashCode();
		
		return hash;
	}
}
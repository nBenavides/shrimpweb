package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_liquidacion_talla database table.
 * 
 */
@Embeddable
public class PrdLiquidacionTallaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="talla_empresa", unique=true, nullable=false, length=7)
	private String tallaEmpresa;

	@Column(name="talla_codigo", unique=true, nullable=false, length=7)
	private String tallaCodigo;

	public PrdLiquidacionTallaPK() {
	}
	public String getTallaEmpresa() {
		return this.tallaEmpresa;
	}
	public void setTallaEmpresa(String tallaEmpresa) {
		this.tallaEmpresa = tallaEmpresa;
	}
	public String getTallaCodigo() {
		return this.tallaCodigo;
	}
	public void setTallaCodigo(String tallaCodigo) {
		this.tallaCodigo = tallaCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdLiquidacionTallaPK)) {
			return false;
		}
		PrdLiquidacionTallaPK castOther = (PrdLiquidacionTallaPK)other;
		return 
			this.tallaEmpresa.equals(castOther.tallaEmpresa)
			&& this.tallaCodigo.equals(castOther.tallaCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tallaEmpresa.hashCode();
		hash = hash * prime + this.tallaCodigo.hashCode();
		
		return hash;
	}
}
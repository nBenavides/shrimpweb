package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_liquidacion_motivo database table.
 * 
 */
@Embeddable
public class PrdLiquidacionMotivoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="lm_empresa", unique=true, nullable=false, length=7)
	private String lmEmpresa;

	@Column(name="lm_codigo", unique=true, nullable=false, length=7)
	private String lmCodigo;

	public PrdLiquidacionMotivoPK() {
	}
	public String getLmEmpresa() {
		return this.lmEmpresa;
	}
	public void setLmEmpresa(String lmEmpresa) {
		this.lmEmpresa = lmEmpresa;
	}
	public String getLmCodigo() {
		return this.lmCodigo;
	}
	public void setLmCodigo(String lmCodigo) {
		this.lmCodigo = lmCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdLiquidacionMotivoPK)) {
			return false;
		}
		PrdLiquidacionMotivoPK castOther = (PrdLiquidacionMotivoPK)other;
		return 
			this.lmEmpresa.equals(castOther.lmEmpresa)
			&& this.lmCodigo.equals(castOther.lmCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.lmEmpresa.hashCode();
		hash = hash * prime + this.lmCodigo.hashCode();
		
		return hash;
	}
}
package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_liquidacion_numeracion database table.
 * 
 */
@Embeddable
public class PrdLiquidacionNumeracionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="num_empresa", unique=true, nullable=false, length=7)
	private String numEmpresa;

	@Column(name="num_motivo", unique=true, nullable=false, length=7)
	private String numMotivo;

	public PrdLiquidacionNumeracionPK() {
	}
	public String getNumEmpresa() {
		return this.numEmpresa;
	}
	public void setNumEmpresa(String numEmpresa) {
		this.numEmpresa = numEmpresa;
	}
	public String getNumMotivo() {
		return this.numMotivo;
	}
	public void setNumMotivo(String numMotivo) {
		this.numMotivo = numMotivo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdLiquidacionNumeracionPK)) {
			return false;
		}
		PrdLiquidacionNumeracionPK castOther = (PrdLiquidacionNumeracionPK)other;
		return 
			this.numEmpresa.equals(castOther.numEmpresa)
			&& this.numMotivo.equals(castOther.numMotivo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.numEmpresa.hashCode();
		hash = hash * prime + this.numMotivo.hashCode();
		
		return hash;
	}
}
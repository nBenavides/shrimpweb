package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_grameaje database table.
 * 
 */
@Embeddable
public class PrdGrameajePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="gra_empresa", unique=true, nullable=false, length=7)
	private String graEmpresa;

	@Column(name="gra_sector", unique=true, nullable=false, length=7)
	private String graSector;

	@Column(name="gra_piscina", unique=true, nullable=false, length=7)
	private String graPiscina;

	@Temporal(TemporalType.DATE)
	@Column(name="gra_fecha", unique=true, nullable=false)
	private java.util.Date graFecha;

	public PrdGrameajePK() {
	}
	public String getGraEmpresa() {
		return this.graEmpresa;
	}
	public void setGraEmpresa(String graEmpresa) {
		this.graEmpresa = graEmpresa;
	}
	public String getGraSector() {
		return this.graSector;
	}
	public void setGraSector(String graSector) {
		this.graSector = graSector;
	}
	public String getGraPiscina() {
		return this.graPiscina;
	}
	public void setGraPiscina(String graPiscina) {
		this.graPiscina = graPiscina;
	}
	public java.util.Date getGraFecha() {
		return this.graFecha;
	}
	public void setGraFecha(java.util.Date graFecha) {
		this.graFecha = graFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdGrameajePK)) {
			return false;
		}
		PrdGrameajePK castOther = (PrdGrameajePK)other;
		return 
			this.graEmpresa.equals(castOther.graEmpresa)
			&& this.graSector.equals(castOther.graSector)
			&& this.graPiscina.equals(castOther.graPiscina)
			&& this.graFecha.equals(castOther.graFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.graEmpresa.hashCode();
		hash = hash * prime + this.graSector.hashCode();
		hash = hash * prime + this.graPiscina.hashCode();
		hash = hash * prime + this.graFecha.hashCode();
		
		return hash;
	}
}
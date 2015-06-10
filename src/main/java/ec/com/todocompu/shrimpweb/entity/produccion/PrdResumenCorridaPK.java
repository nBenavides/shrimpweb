package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_resumen_corrida database table.
 * 
 */
@Embeddable
public class PrdResumenCorridaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="rc_empresa", unique=true, nullable=false, length=7)
	private String rcEmpresa;

	@Column(name="rc_sector", unique=true, nullable=false, length=7)
	private String rcSector;

	@Column(name="rc_piscina", unique=true, nullable=false, length=7)
	private String rcPiscina;

	@Column(name="rc_corrida", unique=true, nullable=false, length=50)
	private String rcCorrida;

	public PrdResumenCorridaPK() {
	}
	public String getRcEmpresa() {
		return this.rcEmpresa;
	}
	public void setRcEmpresa(String rcEmpresa) {
		this.rcEmpresa = rcEmpresa;
	}
	public String getRcSector() {
		return this.rcSector;
	}
	public void setRcSector(String rcSector) {
		this.rcSector = rcSector;
	}
	public String getRcPiscina() {
		return this.rcPiscina;
	}
	public void setRcPiscina(String rcPiscina) {
		this.rcPiscina = rcPiscina;
	}
	public String getRcCorrida() {
		return this.rcCorrida;
	}
	public void setRcCorrida(String rcCorrida) {
		this.rcCorrida = rcCorrida;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdResumenCorridaPK)) {
			return false;
		}
		PrdResumenCorridaPK castOther = (PrdResumenCorridaPK)other;
		return 
			this.rcEmpresa.equals(castOther.rcEmpresa)
			&& this.rcSector.equals(castOther.rcSector)
			&& this.rcPiscina.equals(castOther.rcPiscina)
			&& this.rcCorrida.equals(castOther.rcCorrida);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.rcEmpresa.hashCode();
		hash = hash * prime + this.rcSector.hashCode();
		hash = hash * prime + this.rcPiscina.hashCode();
		hash = hash * prime + this.rcCorrida.hashCode();
		
		return hash;
	}
}
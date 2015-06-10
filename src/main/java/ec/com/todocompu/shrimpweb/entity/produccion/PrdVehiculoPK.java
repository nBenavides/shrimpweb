package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_vehiculos database table.
 * 
 */
@Embeddable
public class PrdVehiculoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="veh_empresa", unique=true, nullable=false, length=7)
	private String vehEmpresa;

	@Column(name="veh_establecimiento", unique=true, nullable=false, length=7)
	private String vehEstablecimiento;

	@Column(name="veh_placa", unique=true, nullable=false, length=7)
	private String vehPlaca;

	public PrdVehiculoPK() {
	}
	public String getVehEmpresa() {
		return this.vehEmpresa;
	}
	public void setVehEmpresa(String vehEmpresa) {
		this.vehEmpresa = vehEmpresa;
	}
	public String getVehEstablecimiento() {
		return this.vehEstablecimiento;
	}
	public void setVehEstablecimiento(String vehEstablecimiento) {
		this.vehEstablecimiento = vehEstablecimiento;
	}
	public String getVehPlaca() {
		return this.vehPlaca;
	}
	public void setVehPlaca(String vehPlaca) {
		this.vehPlaca = vehPlaca;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdVehiculoPK)) {
			return false;
		}
		PrdVehiculoPK castOther = (PrdVehiculoPK)other;
		return 
			this.vehEmpresa.equals(castOther.vehEmpresa)
			&& this.vehEstablecimiento.equals(castOther.vehEstablecimiento)
			&& this.vehPlaca.equals(castOther.vehPlaca);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.vehEmpresa.hashCode();
		hash = hash * prime + this.vehEstablecimiento.hashCode();
		hash = hash * prime + this.vehPlaca.hashCode();
		
		return hash;
	}
}
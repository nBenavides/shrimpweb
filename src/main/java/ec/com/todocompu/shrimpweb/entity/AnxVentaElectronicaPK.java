package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the anx_venta_electronica database table.
 * 
 */
@Embeddable
public class AnxVentaElectronicaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="e_empresa", unique=true, nullable=false, length=7)
	private String eEmpresa;

	@Column(name="e_periodo", unique=true, nullable=false, length=7)
	private String ePeriodo;

	@Column(name="e_motivo", unique=true, nullable=false, length=7)
	private String eMotivo;

	@Column(name="e_numero", unique=true, nullable=false, length=7)
	private String eNumero;

	public AnxVentaElectronicaPK() {
	}
	public String getEEmpresa() {
		return this.eEmpresa;
	}
	public void setEEmpresa(String eEmpresa) {
		this.eEmpresa = eEmpresa;
	}
	public String getEPeriodo() {
		return this.ePeriodo;
	}
	public void setEPeriodo(String ePeriodo) {
		this.ePeriodo = ePeriodo;
	}
	public String getEMotivo() {
		return this.eMotivo;
	}
	public void setEMotivo(String eMotivo) {
		this.eMotivo = eMotivo;
	}
	public String getENumero() {
		return this.eNumero;
	}
	public void setENumero(String eNumero) {
		this.eNumero = eNumero;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AnxVentaElectronicaPK)) {
			return false;
		}
		AnxVentaElectronicaPK castOther = (AnxVentaElectronicaPK)other;
		return 
			this.eEmpresa.equals(castOther.eEmpresa)
			&& this.ePeriodo.equals(castOther.ePeriodo)
			&& this.eMotivo.equals(castOther.eMotivo)
			&& this.eNumero.equals(castOther.eNumero);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eEmpresa.hashCode();
		hash = hash * prime + this.ePeriodo.hashCode();
		hash = hash * prime + this.eMotivo.hashCode();
		hash = hash * prime + this.eNumero.hashCode();
		
		return hash;
	}
}
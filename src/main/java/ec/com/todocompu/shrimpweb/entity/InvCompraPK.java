package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the inv_compras database table.
 * 
 */
@Embeddable
public class InvCompraPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="comp_empresa", unique=true, nullable=false, length=7)
	private String compEmpresa;

	@Column(name="comp_periodo", unique=true, nullable=false, length=7)
	private String compPeriodo;

	@Column(name="comp_motivo", unique=true, nullable=false, length=7)
	private String compMotivo;

	@Column(name="comp_numero", unique=true, nullable=false, length=7)
	private String compNumero;

	public InvCompraPK() {
	}
	public String getCompEmpresa() {
		return this.compEmpresa;
	}
	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}
	public String getCompPeriodo() {
		return this.compPeriodo;
	}
	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}
	public String getCompMotivo() {
		return this.compMotivo;
	}
	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}
	public String getCompNumero() {
		return this.compNumero;
	}
	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InvCompraPK)) {
			return false;
		}
		InvCompraPK castOther = (InvCompraPK)other;
		return 
			this.compEmpresa.equals(castOther.compEmpresa)
			&& this.compPeriodo.equals(castOther.compPeriodo)
			&& this.compMotivo.equals(castOther.compMotivo)
			&& this.compNumero.equals(castOther.compNumero);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.compEmpresa.hashCode();
		hash = hash * prime + this.compPeriodo.hashCode();
		hash = hash * prime + this.compMotivo.hashCode();
		hash = hash * prime + this.compNumero.hashCode();
		
		return hash;
	}
}
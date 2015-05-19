package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the inv_ventas database table.
 * 
 */
@Embeddable
public class InvVentaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="vta_empresa", unique=true, nullable=false, length=7)
	private String vtaEmpresa;

	@Column(name="vta_periodo", unique=true, nullable=false, length=7)
	private String vtaPeriodo;

	@Column(name="vta_motivo", unique=true, nullable=false, length=7)
	private String vtaMotivo;

	@Column(name="vta_numero", unique=true, nullable=false, length=7)
	private String vtaNumero;

	public InvVentaPK() {
	}
	public String getVtaEmpresa() {
		return this.vtaEmpresa;
	}
	public void setVtaEmpresa(String vtaEmpresa) {
		this.vtaEmpresa = vtaEmpresa;
	}
	public String getVtaPeriodo() {
		return this.vtaPeriodo;
	}
	public void setVtaPeriodo(String vtaPeriodo) {
		this.vtaPeriodo = vtaPeriodo;
	}
	public String getVtaMotivo() {
		return this.vtaMotivo;
	}
	public void setVtaMotivo(String vtaMotivo) {
		this.vtaMotivo = vtaMotivo;
	}
	public String getVtaNumero() {
		return this.vtaNumero;
	}
	public void setVtaNumero(String vtaNumero) {
		this.vtaNumero = vtaNumero;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InvVentaPK)) {
			return false;
		}
		InvVentaPK castOther = (InvVentaPK)other;
		return 
			this.vtaEmpresa.equals(castOther.vtaEmpresa)
			&& this.vtaPeriodo.equals(castOther.vtaPeriodo)
			&& this.vtaMotivo.equals(castOther.vtaMotivo)
			&& this.vtaNumero.equals(castOther.vtaNumero);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.vtaEmpresa.hashCode();
		hash = hash * prime + this.vtaPeriodo.hashCode();
		hash = hash * prime + this.vtaMotivo.hashCode();
		hash = hash * prime + this.vtaNumero.hashCode();
		
		return hash;
	}
}
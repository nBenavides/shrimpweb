package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_liquidacion database table.
 * 
 */
@Embeddable
public class PrdLiquidacionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="liq_empresa", unique=true, nullable=false, length=7)
	private String liqEmpresa;

	@Column(name="liq_motivo", unique=true, nullable=false, length=7)
	private String liqMotivo;

	@Column(name="liq_numero", unique=true, nullable=false, length=7)
	private String liqNumero;

	public PrdLiquidacionPK() {
	}
	public String getLiqEmpresa() {
		return this.liqEmpresa;
	}
	public void setLiqEmpresa(String liqEmpresa) {
		this.liqEmpresa = liqEmpresa;
	}
	public String getLiqMotivo() {
		return this.liqMotivo;
	}
	public void setLiqMotivo(String liqMotivo) {
		this.liqMotivo = liqMotivo;
	}
	public String getLiqNumero() {
		return this.liqNumero;
	}
	public void setLiqNumero(String liqNumero) {
		this.liqNumero = liqNumero;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdLiquidacionPK)) {
			return false;
		}
		PrdLiquidacionPK castOther = (PrdLiquidacionPK)other;
		return 
			this.liqEmpresa.equals(castOther.liqEmpresa)
			&& this.liqMotivo.equals(castOther.liqMotivo)
			&& this.liqNumero.equals(castOther.liqNumero);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.liqEmpresa.hashCode();
		hash = hash * prime + this.liqMotivo.hashCode();
		hash = hash * prime + this.liqNumero.hashCode();
		
		return hash;
	}
}
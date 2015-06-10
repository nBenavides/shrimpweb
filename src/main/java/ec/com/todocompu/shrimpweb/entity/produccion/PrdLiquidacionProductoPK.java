package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prd_liquidacion_producto database table.
 * 
 */
@Embeddable
public class PrdLiquidacionProductoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="prod_empresa", unique=true, nullable=false, length=7)
	private String prodEmpresa;

	@Column(name="prod_codigo", unique=true, nullable=false, length=7)
	private String prodCodigo;

	public PrdLiquidacionProductoPK() {
	}
	public String getProdEmpresa() {
		return this.prodEmpresa;
	}
	public void setProdEmpresa(String prodEmpresa) {
		this.prodEmpresa = prodEmpresa;
	}
	public String getProdCodigo() {
		return this.prodCodigo;
	}
	public void setProdCodigo(String prodCodigo) {
		this.prodCodigo = prodCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrdLiquidacionProductoPK)) {
			return false;
		}
		PrdLiquidacionProductoPK castOther = (PrdLiquidacionProductoPK)other;
		return 
			this.prodEmpresa.equals(castOther.prodEmpresa)
			&& this.prodCodigo.equals(castOther.prodCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.prodEmpresa.hashCode();
		hash = hash * prime + this.prodCodigo.hashCode();
		
		return hash;
	}
}
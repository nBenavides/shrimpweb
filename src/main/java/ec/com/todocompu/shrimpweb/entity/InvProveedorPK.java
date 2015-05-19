package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the inv_proveedor database table.
 * 
 */
@Embeddable
public class InvProveedorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="prov_empresa", unique=true, nullable=false, length=7)
	private String provEmpresa;

	@Column(name="prov_codigo", unique=true, nullable=false, length=13)
	private String provCodigo;

	public InvProveedorPK() {
	}
	public String getProvEmpresa() {
		return this.provEmpresa;
	}
	public void setProvEmpresa(String provEmpresa) {
		this.provEmpresa = provEmpresa;
	}
	public String getProvCodigo() {
		return this.provCodigo;
	}
	public void setProvCodigo(String provCodigo) {
		this.provCodigo = provCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InvProveedorPK)) {
			return false;
		}
		InvProveedorPK castOther = (InvProveedorPK)other;
		return 
			this.provEmpresa.equals(castOther.provEmpresa)
			&& this.provCodigo.equals(castOther.provCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.provEmpresa.hashCode();
		hash = hash * prime + this.provCodigo.hashCode();
		
		return hash;
	}
}
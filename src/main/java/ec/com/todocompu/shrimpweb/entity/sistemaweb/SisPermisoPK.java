package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sis_permiso database table.
 * 
 */
@Embeddable
public class SisPermisoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="per_empresa", unique=true, nullable=false, length=7)
	private String perEmpresa;

	@Column(name="per_modulo", unique=true, nullable=false, length=20)
	private String perModulo;

	@Column(name="per_menu", unique=true, nullable=false, length=20)
	private String perMenu;

	@Column(name="per_item", unique=true, nullable=false, length=50)
	private String perItem;

	public SisPermisoPK() {
	}
	public String getPerEmpresa() {
		return this.perEmpresa;
	}
	public void setPerEmpresa(String perEmpresa) {
		this.perEmpresa = perEmpresa;
	}
	public String getPerModulo() {
		return this.perModulo;
	}
	public void setPerModulo(String perModulo) {
		this.perModulo = perModulo;
	}
	public String getPerMenu() {
		return this.perMenu;
	}
	public void setPerMenu(String perMenu) {
		this.perMenu = perMenu;
	}
	public String getPerItem() {
		return this.perItem;
	}
	public void setPerItem(String perItem) {
		this.perItem = perItem;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SisPermisoPK)) {
			return false;
		}
		SisPermisoPK castOther = (SisPermisoPK)other;
		return 
			this.perEmpresa.equals(castOther.perEmpresa)
			&& this.perModulo.equals(castOther.perModulo)
			&& this.perMenu.equals(castOther.perMenu)
			&& this.perItem.equals(castOther.perItem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.perEmpresa.hashCode();
		hash = hash * prime + this.perModulo.hashCode();
		hash = hash * prime + this.perMenu.hashCode();
		hash = hash * prime + this.perItem.hashCode();
		
		return hash;
	}
}
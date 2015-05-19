package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the inv_cliente database table.
 * 
 */
@Embeddable
public class InvClientePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cli_empresa", unique=true, nullable=false, length=7)
	private String cliEmpresa;

	@Column(name="cli_codigo", unique=true, nullable=false, length=13)
	private String cliCodigo;

	public InvClientePK() {
	}
	public String getCliEmpresa() {
		return this.cliEmpresa;
	}
	public void setCliEmpresa(String cliEmpresa) {
		this.cliEmpresa = cliEmpresa;
	}
	public String getCliCodigo() {
		return this.cliCodigo;
	}
	public void setCliCodigo(String cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InvClientePK)) {
			return false;
		}
		InvClientePK castOther = (InvClientePK)other;
		return 
			this.cliEmpresa.equals(castOther.cliEmpresa)
			&& this.cliCodigo.equals(castOther.cliCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cliEmpresa.hashCode();
		hash = hash * prime + this.cliCodigo.hashCode();
		
		return hash;
	}
}
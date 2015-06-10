package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sis_usuario_detalle database table.
 * 
 */
@Embeddable
public class SisUsuarioDetallePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="det_empresa", unique=true, nullable=false, length=7)
	private String detEmpresa;

	@Column(name="det_usuario", unique=true, nullable=false, length=7)
	private String detUsuario;

	public SisUsuarioDetallePK() {
	}
	public String getDetEmpresa() {
		return this.detEmpresa;
	}
	public void setDetEmpresa(String detEmpresa) {
		this.detEmpresa = detEmpresa;
	}
	public String getDetUsuario() {
		return this.detUsuario;
	}
	public void setDetUsuario(String detUsuario) {
		this.detUsuario = detUsuario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SisUsuarioDetallePK)) {
			return false;
		}
		SisUsuarioDetallePK castOther = (SisUsuarioDetallePK)other;
		return 
			this.detEmpresa.equals(castOther.detEmpresa)
			&& this.detUsuario.equals(castOther.detUsuario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.detEmpresa.hashCode();
		hash = hash * prime + this.detUsuario.hashCode();
		
		return hash;
	}
}
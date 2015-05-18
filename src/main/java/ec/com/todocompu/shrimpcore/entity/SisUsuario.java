package ec.com.todocompu.shrimpcore.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sis_usuario", schema = "sistemaweb")
public class SisUsuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private String usrCodigo;
	private String usrNick;
	private String usrNombre;
	private String usrApellido;
	private String usrPassword;
	private Date usrCaduca;
	private boolean usrActivo;
	private boolean usrCambiarContrasenia;
	private String usrCodigoInserta;
	private Date usrFechaInsertaUsuario;

	public SisUsuario() {
	}

	public SisUsuario(String usrCodigo, String usrNick, String usrNombre,
			String usrApellido, String usrPassword, Date usrCaduca,
			boolean usrActivo, boolean usrCambiarContrasenia,
			String usrCodigoInserta, Date usrFechaInsertaUsuario) {
		this.usrCodigo = usrCodigo;
		this.usrNick = usrNick;
		this.usrNombre = usrNombre;
		this.usrApellido = usrApellido;
		this.usrPassword = usrPassword;
		this.usrCaduca = usrCaduca;
		this.usrActivo = usrActivo;
		this.usrCambiarContrasenia = usrCambiarContrasenia;
		this.usrCodigoInserta = usrCodigoInserta;
		this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof SisUsuario)) {
			return false;
		}
		SisUsuario other = (SisUsuario) object;
		if ((this.usrCodigo == null && other.usrCodigo != null)
				|| (this.usrCodigo != null && !this.usrCodigo
						.equals(other.usrCodigo))) {
			return false;
		}
		return true;
	}

	@Basic(optional = false)
	@Column(name = "usr_activo")
	public boolean getUsrActivo() {
		return usrActivo;
	}

	@Column(name = "usr_apellido")
	public String getUsrApellido() {
		return usrApellido;
	}

	@Column(name = "usr_caduca")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getUsrCaduca() {
		return usrCaduca;
	}

	@Basic(optional = false)
	@Column(name = "usr_cambiar_contrasenia")
	public boolean getUsrCambiarContrasenia() {
		return usrCambiarContrasenia;
	}

	@Id
	@Basic(optional = false)
	@Column(name = "usr_codigo")
	public String getUsrCodigo() {
		return usrCodigo;
	}

	@Column(name = "usr_codigo_inserta")
	public String getUsrCodigoInserta() {
		return usrCodigoInserta;
	}

	@Basic(optional = false)
	@Column(name = "usr_fecha_inserta_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getUsrFechaInsertaUsuario() {
		return usrFechaInsertaUsuario;
	}

	@Basic(optional = false)
	@Column(name = "usr_nick")
	public String getUsrNick() {
		return usrNick;
	}

	@Column(name = "usr_nombre")
	public String getUsrNombre() {
		return usrNombre;
	}

	@Basic(optional = false)
	@Column(name = "usr_password")
	public String getUsrPassword() {
		return usrPassword;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (usrCodigo != null ? usrCodigo.hashCode() : 0);
		return hash;
	}

	public void setUsrActivo(boolean usrActivo) {
		this.usrActivo = usrActivo;
	}

	public void setUsrApellido(String usrApellido) {
		this.usrApellido = usrApellido;
	}

	public void setUsrCaduca(Date usrCaduca) {
		this.usrCaduca = usrCaduca;
	}

	public void setUsrCambiarContrasenia(boolean usrCambiarContrasenia) {
		this.usrCambiarContrasenia = usrCambiarContrasenia;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public void setUsrCodigoInserta(String usrCodigoInserta) {
		this.usrCodigoInserta = usrCodigoInserta;
	}

	public void setUsrFechaInsertaUsuario(Date usrFechaInsertaUsuario) {
		this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
	}

	public void setUsrNick(String usrNick) {
		this.usrNick = usrNick;
	}

	public void setUsrNombre(String usrNombre) {
		this.usrNombre = usrNombre;
	}

	public void setUsrPassword(String usrPassword) {
		this.usrPassword = usrPassword;
	}

	@Override
	public String toString() {
		return "registro.entity.SisUsuario[ usrCodigo=" + usrCodigo + " ]";
	}

}

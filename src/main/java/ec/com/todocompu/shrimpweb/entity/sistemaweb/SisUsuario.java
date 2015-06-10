package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the sis_usuario database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="sis_usuario")
@NamedQuery(name="SisUsuario.findAll", query="SELECT s FROM SisUsuario s")
public class SisUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="usr_codigo", unique=true, nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_activo", nullable=false)
	private Boolean usrActivo;

	@Column(name="usr_apellido", length=30)
	private String usrApellido;

	@Column(name="usr_caduca")
	private Timestamp usrCaduca;

	@Column(name="usr_cambiar_contrasenia", nullable=false)
	private Boolean usrCambiarContrasenia;

	@Column(name="usr_codigo_inserta", length=7)
	private String usrCodigoInserta;

	@Column(name="usr_fecha_inserta_usuario", nullable=false)
	private Timestamp usrFechaInsertaUsuario;

	@Column(name="usr_nick", nullable=false, length=20)
	private String usrNick;

	@Column(name="usr_nombre", length=30)
	private String usrNombre;

	@Column(name="usr_password", nullable=false, length=300)
	private String usrPassword;

	//bi-directional many-to-one association to SisUsuarioDetalle
	@OneToMany(mappedBy="sisUsuario")
	private List<SisUsuarioDetalle> sisUsuarioDetalles;

	public SisUsuario() {
	}

	public String getUsrCodigo() {
		return this.usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public Boolean getUsrActivo() {
		return this.usrActivo;
	}

	public void setUsrActivo(Boolean usrActivo) {
		this.usrActivo = usrActivo;
	}

	public String getUsrApellido() {
		return this.usrApellido;
	}

	public void setUsrApellido(String usrApellido) {
		this.usrApellido = usrApellido;
	}

	public Timestamp getUsrCaduca() {
		return this.usrCaduca;
	}

	public void setUsrCaduca(Timestamp usrCaduca) {
		this.usrCaduca = usrCaduca;
	}

	public Boolean getUsrCambiarContrasenia() {
		return this.usrCambiarContrasenia;
	}

	public void setUsrCambiarContrasenia(Boolean usrCambiarContrasenia) {
		this.usrCambiarContrasenia = usrCambiarContrasenia;
	}

	public String getUsrCodigoInserta() {
		return this.usrCodigoInserta;
	}

	public void setUsrCodigoInserta(String usrCodigoInserta) {
		this.usrCodigoInserta = usrCodigoInserta;
	}

	public Timestamp getUsrFechaInsertaUsuario() {
		return this.usrFechaInsertaUsuario;
	}

	public void setUsrFechaInsertaUsuario(Timestamp usrFechaInsertaUsuario) {
		this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
	}

	public String getUsrNick() {
		return this.usrNick;
	}

	public void setUsrNick(String usrNick) {
		this.usrNick = usrNick;
	}

	public String getUsrNombre() {
		return this.usrNombre;
	}

	public void setUsrNombre(String usrNombre) {
		this.usrNombre = usrNombre;
	}

	public String getUsrPassword() {
		return this.usrPassword;
	}

	public void setUsrPassword(String usrPassword) {
		this.usrPassword = usrPassword;
	}

	public List<SisUsuarioDetalle> getSisUsuarioDetalles() {
		return this.sisUsuarioDetalles;
	}

	public void setSisUsuarioDetalles(List<SisUsuarioDetalle> sisUsuarioDetalles) {
		this.sisUsuarioDetalles = sisUsuarioDetalles;
	}

	public SisUsuarioDetalle addSisUsuarioDetalle(SisUsuarioDetalle sisUsuarioDetalle) {
		getSisUsuarioDetalles().add(sisUsuarioDetalle);
		sisUsuarioDetalle.setSisUsuario(this);

		return sisUsuarioDetalle;
	}

	public SisUsuarioDetalle removeSisUsuarioDetalle(SisUsuarioDetalle sisUsuarioDetalle) {
		getSisUsuarioDetalles().remove(sisUsuarioDetalle);
		sisUsuarioDetalle.setSisUsuario(null);

		return sisUsuarioDetalle;
	}

}
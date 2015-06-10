package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the sis_usuario_detalle database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="sis_usuario_detalle")
@NamedQuery(name="SisUsuarioDetalle.findAll", query="SELECT s FROM SisUsuarioDetalle s")
public class SisUsuarioDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SisUsuarioDetallePK id;

	@Column(name="det_activo", nullable=false)
	private Boolean detActivo;

	@Column(name="det_equipo", nullable=false, length=17)
	private String detEquipo;

	@Column(name="usr_fecha_inserta_usuario", nullable=false)
	private Timestamp usrFechaInsertaUsuario;

	//bi-directional many-to-one association to SisError
	@OneToMany(mappedBy="sisUsuarioDetalle")
	private List<SisError> sisErrors;

	//bi-directional many-to-one association to SisSuceso
	@OneToMany(mappedBy="sisUsuarioDetalle")
	private List<SisSuceso> sisSucesos;

	//bi-directional many-to-one association to SisGrupo
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="gru_codigo", referencedColumnName="gru_codigo", nullable=false),
		@JoinColumn(name="gru_empresa", referencedColumnName="gru_empresa", nullable=false)
		})
	private SisGrupo sisGrupo;

	//bi-directional many-to-one association to SisUsuario
	@ManyToOne
	@JoinColumn(name="usr_codigo", nullable=false)
	private SisUsuario sisUsuario;

	public SisUsuarioDetalle() {
	}

	public SisUsuarioDetallePK getId() {
		return this.id;
	}

	public void setId(SisUsuarioDetallePK id) {
		this.id = id;
	}

	public Boolean getDetActivo() {
		return this.detActivo;
	}

	public void setDetActivo(Boolean detActivo) {
		this.detActivo = detActivo;
	}

	public String getDetEquipo() {
		return this.detEquipo;
	}

	public void setDetEquipo(String detEquipo) {
		this.detEquipo = detEquipo;
	}

	public Timestamp getUsrFechaInsertaUsuario() {
		return this.usrFechaInsertaUsuario;
	}

	public void setUsrFechaInsertaUsuario(Timestamp usrFechaInsertaUsuario) {
		this.usrFechaInsertaUsuario = usrFechaInsertaUsuario;
	}

	public List<SisError> getSisErrors() {
		return this.sisErrors;
	}

	public void setSisErrors(List<SisError> sisErrors) {
		this.sisErrors = sisErrors;
	}

	public SisError addSisError(SisError sisError) {
		getSisErrors().add(sisError);
		sisError.setSisUsuarioDetalle(this);

		return sisError;
	}

	public SisError removeSisError(SisError sisError) {
		getSisErrors().remove(sisError);
		sisError.setSisUsuarioDetalle(null);

		return sisError;
	}

	public List<SisSuceso> getSisSucesos() {
		return this.sisSucesos;
	}

	public void setSisSucesos(List<SisSuceso> sisSucesos) {
		this.sisSucesos = sisSucesos;
	}

	public SisSuceso addSisSuceso(SisSuceso sisSuceso) {
		getSisSucesos().add(sisSuceso);
		sisSuceso.setSisUsuarioDetalle(this);

		return sisSuceso;
	}

	public SisSuceso removeSisSuceso(SisSuceso sisSuceso) {
		getSisSucesos().remove(sisSuceso);
		sisSuceso.setSisUsuarioDetalle(null);

		return sisSuceso;
	}

	public SisGrupo getSisGrupo() {
		return this.sisGrupo;
	}

	public void setSisGrupo(SisGrupo sisGrupo) {
		this.sisGrupo = sisGrupo;
	}

	public SisUsuario getSisUsuario() {
		return this.sisUsuario;
	}

	public void setSisUsuario(SisUsuario sisUsuario) {
		this.sisUsuario = sisUsuario;
	}

}
package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the sis_grupo database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="sis_grupo")
@NamedQuery(name="SisGrupo.findAll", query="SELECT s FROM SisGrupo s")
public class SisGrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SisGrupoPK id;

	@Column(name="gru_anular_compras", nullable=false)
	private Boolean gruAnularCompras;

	@Column(name="gru_anular_consumos", nullable=false)
	private Boolean gruAnularConsumos;

	@Column(name="gru_anular_contables", nullable=false)
	private Boolean gruAnularContables;

	@Column(name="gru_anular_transferencias", nullable=false)
	private Boolean gruAnularTransferencias;

	@Column(name="gru_anular_ventas", nullable=false)
	private Boolean gruAnularVentas;

	@Column(name="gru_configurar", nullable=false)
	private Boolean gruConfigurar;

	@Column(name="gru_crear", nullable=false)
	private Boolean gruCrear;

	@Column(name="gru_desmayorizar_compras", nullable=false)
	private Boolean gruDesmayorizarCompras;

	@Column(name="gru_desmayorizar_consumos", nullable=false)
	private Boolean gruDesmayorizarConsumos;

	@Column(name="gru_desmayorizar_contables", nullable=false)
	private Boolean gruDesmayorizarContables;

	@Column(name="gru_desmayorizar_transferencias", nullable=false)
	private Boolean gruDesmayorizarTransferencias;

	@Column(name="gru_desmayorizar_ventas", nullable=false)
	private Boolean gruDesmayorizarVentas;

	@Column(name="gru_eliminar", nullable=false)
	private Boolean gruEliminar;

	@Column(name="gru_exportar", nullable=false)
	private Boolean gruExportar;

	@Column(name="gru_imprimir", nullable=false)
	private Boolean gruImprimir;

	@Column(name="gru_modificar", nullable=false)
	private Boolean gruModificar;

	@Column(name="gru_nombre", nullable=false, length=50)
	private String gruNombre;

	@Column(name="usr_fecha_inserta_grupo")
	private Timestamp usrFechaInsertaGrupo;

	@Column(name="usr_inserta_grupo", length=7)
	private String usrInsertaGrupo;

	//bi-directional many-to-one association to SisEmpresa
	@ManyToOne
	@JoinColumn(name="emp_codigo", nullable=false)
	private SisEmpresa sisEmpresa;

	//bi-directional many-to-one association to SisUsuarioDetalle
	@OneToMany(mappedBy="sisGrupo")
	private List<SisUsuarioDetalle> sisUsuarioDetalles;

	public SisGrupo() {
	}

	public SisGrupoPK getId() {
		return this.id;
	}

	public void setId(SisGrupoPK id) {
		this.id = id;
	}

	public Boolean getGruAnularCompras() {
		return this.gruAnularCompras;
	}

	public void setGruAnularCompras(Boolean gruAnularCompras) {
		this.gruAnularCompras = gruAnularCompras;
	}

	public Boolean getGruAnularConsumos() {
		return this.gruAnularConsumos;
	}

	public void setGruAnularConsumos(Boolean gruAnularConsumos) {
		this.gruAnularConsumos = gruAnularConsumos;
	}

	public Boolean getGruAnularContables() {
		return this.gruAnularContables;
	}

	public void setGruAnularContables(Boolean gruAnularContables) {
		this.gruAnularContables = gruAnularContables;
	}

	public Boolean getGruAnularTransferencias() {
		return this.gruAnularTransferencias;
	}

	public void setGruAnularTransferencias(Boolean gruAnularTransferencias) {
		this.gruAnularTransferencias = gruAnularTransferencias;
	}

	public Boolean getGruAnularVentas() {
		return this.gruAnularVentas;
	}

	public void setGruAnularVentas(Boolean gruAnularVentas) {
		this.gruAnularVentas = gruAnularVentas;
	}

	public Boolean getGruConfigurar() {
		return this.gruConfigurar;
	}

	public void setGruConfigurar(Boolean gruConfigurar) {
		this.gruConfigurar = gruConfigurar;
	}

	public Boolean getGruCrear() {
		return this.gruCrear;
	}

	public void setGruCrear(Boolean gruCrear) {
		this.gruCrear = gruCrear;
	}

	public Boolean getGruDesmayorizarCompras() {
		return this.gruDesmayorizarCompras;
	}

	public void setGruDesmayorizarCompras(Boolean gruDesmayorizarCompras) {
		this.gruDesmayorizarCompras = gruDesmayorizarCompras;
	}

	public Boolean getGruDesmayorizarConsumos() {
		return this.gruDesmayorizarConsumos;
	}

	public void setGruDesmayorizarConsumos(Boolean gruDesmayorizarConsumos) {
		this.gruDesmayorizarConsumos = gruDesmayorizarConsumos;
	}

	public Boolean getGruDesmayorizarContables() {
		return this.gruDesmayorizarContables;
	}

	public void setGruDesmayorizarContables(Boolean gruDesmayorizarContables) {
		this.gruDesmayorizarContables = gruDesmayorizarContables;
	}

	public Boolean getGruDesmayorizarTransferencias() {
		return this.gruDesmayorizarTransferencias;
	}

	public void setGruDesmayorizarTransferencias(Boolean gruDesmayorizarTransferencias) {
		this.gruDesmayorizarTransferencias = gruDesmayorizarTransferencias;
	}

	public Boolean getGruDesmayorizarVentas() {
		return this.gruDesmayorizarVentas;
	}

	public void setGruDesmayorizarVentas(Boolean gruDesmayorizarVentas) {
		this.gruDesmayorizarVentas = gruDesmayorizarVentas;
	}

	public Boolean getGruEliminar() {
		return this.gruEliminar;
	}

	public void setGruEliminar(Boolean gruEliminar) {
		this.gruEliminar = gruEliminar;
	}

	public Boolean getGruExportar() {
		return this.gruExportar;
	}

	public void setGruExportar(Boolean gruExportar) {
		this.gruExportar = gruExportar;
	}

	public Boolean getGruImprimir() {
		return this.gruImprimir;
	}

	public void setGruImprimir(Boolean gruImprimir) {
		this.gruImprimir = gruImprimir;
	}

	public Boolean getGruModificar() {
		return this.gruModificar;
	}

	public void setGruModificar(Boolean gruModificar) {
		this.gruModificar = gruModificar;
	}

	public String getGruNombre() {
		return this.gruNombre;
	}

	public void setGruNombre(String gruNombre) {
		this.gruNombre = gruNombre;
	}

	public Timestamp getUsrFechaInsertaGrupo() {
		return this.usrFechaInsertaGrupo;
	}

	public void setUsrFechaInsertaGrupo(Timestamp usrFechaInsertaGrupo) {
		this.usrFechaInsertaGrupo = usrFechaInsertaGrupo;
	}

	public String getUsrInsertaGrupo() {
		return this.usrInsertaGrupo;
	}

	public void setUsrInsertaGrupo(String usrInsertaGrupo) {
		this.usrInsertaGrupo = usrInsertaGrupo;
	}

	public SisEmpresa getSisEmpresa() {
		return this.sisEmpresa;
	}

	public void setSisEmpresa(SisEmpresa sisEmpresa) {
		this.sisEmpresa = sisEmpresa;
	}

	public List<SisUsuarioDetalle> getSisUsuarioDetalles() {
		return this.sisUsuarioDetalles;
	}

	public void setSisUsuarioDetalles(List<SisUsuarioDetalle> sisUsuarioDetalles) {
		this.sisUsuarioDetalles = sisUsuarioDetalles;
	}

	public SisUsuarioDetalle addSisUsuarioDetalle(SisUsuarioDetalle sisUsuarioDetalle) {
		getSisUsuarioDetalles().add(sisUsuarioDetalle);
		sisUsuarioDetalle.setSisGrupo(this);

		return sisUsuarioDetalle;
	}

	public SisUsuarioDetalle removeSisUsuarioDetalle(SisUsuarioDetalle sisUsuarioDetalle) {
		getSisUsuarioDetalles().remove(sisUsuarioDetalle);
		sisUsuarioDetalle.setSisGrupo(null);

		return sisUsuarioDetalle;
	}

}
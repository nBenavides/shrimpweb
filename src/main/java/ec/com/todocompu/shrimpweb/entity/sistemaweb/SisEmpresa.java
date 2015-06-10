package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the sis_empresa database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="sis_empresa")
@NamedQuery(name="SisEmpresa.findAll", query="SELECT s FROM SisEmpresa s")
public class SisEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="emp_codigo", unique=true, nullable=false, length=7)
	private String empCodigo;

	@Column(name="emp_activa")
	private Boolean empActiva;

	@Column(name="emp_ciudad", length=15)
	private String empCiudad;

	@Column(name="emp_clave", length=300)
	private String empClave;

	@Column(name="emp_direccion", length=100)
	private String empDireccion;

	@Column(name="emp_email", length=50)
	private String empEmail;

	@Column(name="emp_fax", length=10)
	private String empFax;

	@Column(name="emp_logo")
	private byte[] empLogo;

	@Column(name="emp_nombre", length=100)
	private String empNombre;

	@Column(name="emp_razon_social", length=100)
	private String empRazonSocial;

	@Column(name="emp_ruc", length=13)
	private String empRuc;

	@Column(name="emp_telefono", length=10)
	private String empTelefono;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_fecha_inserta_empresa")
	private Timestamp usrFechaInsertaEmpresa;

	//bi-directional many-to-one association to SisEmpresaParametro
	@OneToMany(mappedBy="sisEmpresa")
	private List<SisEmpresaParametro> sisEmpresaParametros;

	//bi-directional many-to-one association to SisGrupo
	@OneToMany(mappedBy="sisEmpresa")
	private List<SisGrupo> sisGrupos;

	//bi-directional many-to-one association to SisPeriodo
	@OneToMany(mappedBy="sisEmpresa")
	private List<SisPeriodo> sisPeriodos;

	//bi-directional many-to-one association to SisPermiso
	@OneToMany(mappedBy="sisEmpresa")
	private List<SisPermiso> sisPermisos;

	public SisEmpresa() {
	}

	public String getEmpCodigo() {
		return this.empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public Boolean getEmpActiva() {
		return this.empActiva;
	}

	public void setEmpActiva(Boolean empActiva) {
		this.empActiva = empActiva;
	}

	public String getEmpCiudad() {
		return this.empCiudad;
	}

	public void setEmpCiudad(String empCiudad) {
		this.empCiudad = empCiudad;
	}

	public String getEmpClave() {
		return this.empClave;
	}

	public void setEmpClave(String empClave) {
		this.empClave = empClave;
	}

	public String getEmpDireccion() {
		return this.empDireccion;
	}

	public void setEmpDireccion(String empDireccion) {
		this.empDireccion = empDireccion;
	}

	public String getEmpEmail() {
		return this.empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpFax() {
		return this.empFax;
	}

	public void setEmpFax(String empFax) {
		this.empFax = empFax;
	}

	public byte[] getEmpLogo() {
		return this.empLogo;
	}

	public void setEmpLogo(byte[] empLogo) {
		this.empLogo = empLogo;
	}

	public String getEmpNombre() {
		return this.empNombre;
	}

	public void setEmpNombre(String empNombre) {
		this.empNombre = empNombre;
	}

	public String getEmpRazonSocial() {
		return this.empRazonSocial;
	}

	public void setEmpRazonSocial(String empRazonSocial) {
		this.empRazonSocial = empRazonSocial;
	}

	public String getEmpRuc() {
		return this.empRuc;
	}

	public void setEmpRuc(String empRuc) {
		this.empRuc = empRuc;
	}

	public String getEmpTelefono() {
		return this.empTelefono;
	}

	public void setEmpTelefono(String empTelefono) {
		this.empTelefono = empTelefono;
	}

	public String getUsrCodigo() {
		return this.usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public Timestamp getUsrFechaInsertaEmpresa() {
		return this.usrFechaInsertaEmpresa;
	}

	public void setUsrFechaInsertaEmpresa(Timestamp usrFechaInsertaEmpresa) {
		this.usrFechaInsertaEmpresa = usrFechaInsertaEmpresa;
	}

	public List<SisEmpresaParametro> getSisEmpresaParametros() {
		return this.sisEmpresaParametros;
	}

	public void setSisEmpresaParametros(List<SisEmpresaParametro> sisEmpresaParametros) {
		this.sisEmpresaParametros = sisEmpresaParametros;
	}

	public SisEmpresaParametro addSisEmpresaParametro(SisEmpresaParametro sisEmpresaParametro) {
		getSisEmpresaParametros().add(sisEmpresaParametro);
		sisEmpresaParametro.setSisEmpresa(this);

		return sisEmpresaParametro;
	}

	public SisEmpresaParametro removeSisEmpresaParametro(SisEmpresaParametro sisEmpresaParametro) {
		getSisEmpresaParametros().remove(sisEmpresaParametro);
		sisEmpresaParametro.setSisEmpresa(null);

		return sisEmpresaParametro;
	}

	public List<SisGrupo> getSisGrupos() {
		return this.sisGrupos;
	}

	public void setSisGrupos(List<SisGrupo> sisGrupos) {
		this.sisGrupos = sisGrupos;
	}

	public SisGrupo addSisGrupo(SisGrupo sisGrupo) {
		getSisGrupos().add(sisGrupo);
		sisGrupo.setSisEmpresa(this);

		return sisGrupo;
	}

	public SisGrupo removeSisGrupo(SisGrupo sisGrupo) {
		getSisGrupos().remove(sisGrupo);
		sisGrupo.setSisEmpresa(null);

		return sisGrupo;
	}

	public List<SisPeriodo> getSisPeriodos() {
		return this.sisPeriodos;
	}

	public void setSisPeriodos(List<SisPeriodo> sisPeriodos) {
		this.sisPeriodos = sisPeriodos;
	}

	public SisPeriodo addSisPeriodo(SisPeriodo sisPeriodo) {
		getSisPeriodos().add(sisPeriodo);
		sisPeriodo.setSisEmpresa(this);

		return sisPeriodo;
	}

	public SisPeriodo removeSisPeriodo(SisPeriodo sisPeriodo) {
		getSisPeriodos().remove(sisPeriodo);
		sisPeriodo.setSisEmpresa(null);

		return sisPeriodo;
	}

	public List<SisPermiso> getSisPermisos() {
		return this.sisPermisos;
	}

	public void setSisPermisos(List<SisPermiso> sisPermisos) {
		this.sisPermisos = sisPermisos;
	}

	public SisPermiso addSisPermiso(SisPermiso sisPermiso) {
		getSisPermisos().add(sisPermiso);
		sisPermiso.setSisEmpresa(this);

		return sisPermiso;
	}

	public SisPermiso removeSisPermiso(SisPermiso sisPermiso) {
		getSisPermisos().remove(sisPermiso);
		sisPermiso.setSisEmpresa(null);

		return sisPermiso;
	}

}
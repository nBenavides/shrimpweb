package ec.com.todocompu.shrimpweb.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the sis_empresa database table.
 * 
 */
@Entity
@Table(name = "sis_empresa", schema = "sistemaweb")
@NamedQuery(name = "SisEmpresa.findAll", query = "SELECT s FROM SisEmpresa s")
public class SisEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "emp_codigo")
	private String empCodigo;

	@Column(name = "emp_activa")
	private Boolean empActiva;

	@Column(name = "emp_ciudad")
	private String empCiudad;

	@Column(name = "emp_clave")
	private String empClave;

	@Column(name = "emp_direccion")
	private String empDireccion;

	@Column(name = "emp_email")
	private String empEmail;

	@Column(name = "emp_fax")
	private String empFax;

	@Column(name = "emp_logo")
	private byte[] empLogo;

	@Column(name = "emp_nombre")
	private String empNombre;

	@Column(name = "emp_razon_social")
	private String empRazonSocial;

	@Column(name = "emp_ruc")
	private String empRuc;

	@Column(name = "emp_telefono")
	private String empTelefono;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta_empresa")
	private Timestamp usrFechaInsertaEmpresa;

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

}
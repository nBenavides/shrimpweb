package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sis_error database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="sis_error")
@NamedQuery(name="SisError.findAll", query="SELECT s FROM SisError s")
public class SisError implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="er_secuencia", unique=true, nullable=false)
	private Integer erSecuencia;

	@Column(name="er_archivo", length=50)
	private String erArchivo;

	@Column(name="er_clase", length=115)
	private String erClase;

	@Column(name="er_fecha", nullable=false)
	private Timestamp erFecha;

	@Column(name="er_linea", length=30)
	private String erLinea;

	@Column(name="er_mac", nullable=false, length=17)
	private String erMac;

	@Column(name="er_metodo", length=50)
	private String erMetodo;

	@Column(name="er_sentencia", length=1000)
	private String erSentencia;

	//bi-directional many-to-one association to SisUsuarioDetalle
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="det_empresa", referencedColumnName="det_empresa", nullable=false),
		@JoinColumn(name="det_usuario", referencedColumnName="det_usuario", nullable=false)
		})
	private SisUsuarioDetalle sisUsuarioDetalle;

	public SisError() {
	}

	public Integer getErSecuencia() {
		return this.erSecuencia;
	}

	public void setErSecuencia(Integer erSecuencia) {
		this.erSecuencia = erSecuencia;
	}

	public String getErArchivo() {
		return this.erArchivo;
	}

	public void setErArchivo(String erArchivo) {
		this.erArchivo = erArchivo;
	}

	public String getErClase() {
		return this.erClase;
	}

	public void setErClase(String erClase) {
		this.erClase = erClase;
	}

	public Timestamp getErFecha() {
		return this.erFecha;
	}

	public void setErFecha(Timestamp erFecha) {
		this.erFecha = erFecha;
	}

	public String getErLinea() {
		return this.erLinea;
	}

	public void setErLinea(String erLinea) {
		this.erLinea = erLinea;
	}

	public String getErMac() {
		return this.erMac;
	}

	public void setErMac(String erMac) {
		this.erMac = erMac;
	}

	public String getErMetodo() {
		return this.erMetodo;
	}

	public void setErMetodo(String erMetodo) {
		this.erMetodo = erMetodo;
	}

	public String getErSentencia() {
		return this.erSentencia;
	}

	public void setErSentencia(String erSentencia) {
		this.erSentencia = erSentencia;
	}

	public SisUsuarioDetalle getSisUsuarioDetalle() {
		return this.sisUsuarioDetalle;
	}

	public void setSisUsuarioDetalle(SisUsuarioDetalle sisUsuarioDetalle) {
		this.sisUsuarioDetalle = sisUsuarioDetalle;
	}

}
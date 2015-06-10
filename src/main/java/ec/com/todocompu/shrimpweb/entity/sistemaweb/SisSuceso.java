package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sis_suceso database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="sis_suceso")
@NamedQuery(name="SisSuceso.findAll", query="SELECT s FROM SisSuceso s")
public class SisSuceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sus_secuencia", unique=true, nullable=false)
	private Integer susSecuencia;

	@Column(name="sus_clave", nullable=false, length=50)
	private String susClave;

	@Column(name="sus_detalle", length=300)
	private String susDetalle;

	@Column(name="sus_fecha", nullable=false)
	private Timestamp susFecha;

	@Column(name="sus_mac", nullable=false, length=17)
	private String susMac;

	@Column(name="sus_suceso", nullable=false, length=10)
	private String susSuceso;

	@Column(name="sus_tabla", nullable=false, length=50)
	private String susTabla;

	//bi-directional many-to-one association to SisUsuarioDetalle
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="det_empresa", referencedColumnName="det_empresa", nullable=false),
		@JoinColumn(name="det_usuario", referencedColumnName="det_usuario", nullable=false)
		})
	private SisUsuarioDetalle sisUsuarioDetalle;

	public SisSuceso() {
	}

	public Integer getSusSecuencia() {
		return this.susSecuencia;
	}

	public void setSusSecuencia(Integer susSecuencia) {
		this.susSecuencia = susSecuencia;
	}

	public String getSusClave() {
		return this.susClave;
	}

	public void setSusClave(String susClave) {
		this.susClave = susClave;
	}

	public String getSusDetalle() {
		return this.susDetalle;
	}

	public void setSusDetalle(String susDetalle) {
		this.susDetalle = susDetalle;
	}

	public Timestamp getSusFecha() {
		return this.susFecha;
	}

	public void setSusFecha(Timestamp susFecha) {
		this.susFecha = susFecha;
	}

	public String getSusMac() {
		return this.susMac;
	}

	public void setSusMac(String susMac) {
		this.susMac = susMac;
	}

	public String getSusSuceso() {
		return this.susSuceso;
	}

	public void setSusSuceso(String susSuceso) {
		this.susSuceso = susSuceso;
	}

	public String getSusTabla() {
		return this.susTabla;
	}

	public void setSusTabla(String susTabla) {
		this.susTabla = susTabla;
	}

	public SisUsuarioDetalle getSisUsuarioDetalle() {
		return this.sisUsuarioDetalle;
	}

	public void setSisUsuarioDetalle(SisUsuarioDetalle sisUsuarioDetalle) {
		this.sisUsuarioDetalle = sisUsuarioDetalle;
	}

}
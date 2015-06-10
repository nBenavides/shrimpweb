package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sis_permiso database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="sis_permiso")
@NamedQuery(name="SisPermiso.findAll", query="SELECT s FROM SisPermiso s")
public class SisPermiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SisPermisoPK id;

	@Column(name="per_item_etiqueta", nullable=false, length=50)
	private String perItemEtiqueta;

	@Column(name="per_secuencia", nullable=false)
	private Integer perSecuencia;

	@Column(name="per_usuarios", nullable=false, length=300)
	private String perUsuarios;

	//bi-directional many-to-one association to SisEmpresa
	@ManyToOne
	@JoinColumn(name="emp_codigo", nullable=false)
	private SisEmpresa sisEmpresa;

	public SisPermiso() {
	}

	public SisPermisoPK getId() {
		return this.id;
	}

	public void setId(SisPermisoPK id) {
		this.id = id;
	}

	public String getPerItemEtiqueta() {
		return this.perItemEtiqueta;
	}

	public void setPerItemEtiqueta(String perItemEtiqueta) {
		this.perItemEtiqueta = perItemEtiqueta;
	}

	public Integer getPerSecuencia() {
		return this.perSecuencia;
	}

	public void setPerSecuencia(Integer perSecuencia) {
		this.perSecuencia = perSecuencia;
	}

	public String getPerUsuarios() {
		return this.perUsuarios;
	}

	public void setPerUsuarios(String perUsuarios) {
		this.perUsuarios = perUsuarios;
	}

	public SisEmpresa getSisEmpresa() {
		return this.sisEmpresa;
	}

	public void setSisEmpresa(SisEmpresa sisEmpresa) {
		this.sisEmpresa = sisEmpresa;
	}

}
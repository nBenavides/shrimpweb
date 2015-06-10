package ec.com.todocompu.shrimpweb.entity.sistemaweb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the menus database table.
 * 
 */
@Entity
@Table(schema="sistemaweb",name="menus")
@NamedQuery(name="Menus.findAll", query="SELECT m FROM Menus m")
public class Menus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=3)
	private String id;

	@Column(nullable=false, length=25)
	private String icono;

	@Column(nullable=false)
	private Integer nivel;

	@Column(nullable=false, length=50)
	private String nombre;

	@Column(nullable=false, length=3)
	private String padre;

	@Column(nullable=false, length=100)
	private String vista;

	public Menus() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIcono() {
		return this.icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public Integer getNivel() {
		return this.nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPadre() {
		return this.padre;
	}

	public void setPadre(String padre) {
		this.padre = padre;
	}

	public String getVista() {
		return this.vista;
	}

	public void setVista(String vista) {
		this.vista = vista;
	}

}
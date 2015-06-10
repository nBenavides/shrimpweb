package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the prd_liquidacion_numeracion database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_liquidacion_numeracion")
@NamedQuery(name="PrdLiquidacionNumeracion.findAll", query="SELECT p FROM PrdLiquidacionNumeracion p")
public class PrdLiquidacionNumeracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdLiquidacionNumeracionPK id;

	@Column(name="num_secuencia", nullable=false, length=7)
	private String numSecuencia;

	public PrdLiquidacionNumeracion() {
	}

	public PrdLiquidacionNumeracionPK getId() {
		return this.id;
	}

	public void setId(PrdLiquidacionNumeracionPK id) {
		this.id = id;
	}

	public String getNumSecuencia() {
		return this.numSecuencia;
	}

	public void setNumSecuencia(String numSecuencia) {
		this.numSecuencia = numSecuencia;
	}

}
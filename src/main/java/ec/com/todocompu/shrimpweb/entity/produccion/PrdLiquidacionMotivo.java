package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the prd_liquidacion_motivo database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_liquidacion_motivo")
@NamedQuery(name="PrdLiquidacionMotivo.findAll", query="SELECT p FROM PrdLiquidacionMotivo p")
public class PrdLiquidacionMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdLiquidacionMotivoPK id;

	@Column(name="lm_detalle", nullable=false, length=50)
	private String lmDetalle;

	@Column(name="lm_inactivo", nullable=false)
	private Boolean lmInactivo;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_empresa", nullable=false, length=7)
	private String usrEmpresa;

	@Column(name="usr_fecha_inserta", nullable=false)
	private Timestamp usrFechaInserta;

	public PrdLiquidacionMotivo() {
	}

	public PrdLiquidacionMotivoPK getId() {
		return this.id;
	}

	public void setId(PrdLiquidacionMotivoPK id) {
		this.id = id;
	}

	public String getLmDetalle() {
		return this.lmDetalle;
	}

	public void setLmDetalle(String lmDetalle) {
		this.lmDetalle = lmDetalle;
	}

	public Boolean getLmInactivo() {
		return this.lmInactivo;
	}

	public void setLmInactivo(Boolean lmInactivo) {
		this.lmInactivo = lmInactivo;
	}

	public String getUsrCodigo() {
		return this.usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrEmpresa() {
		return this.usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public Timestamp getUsrFechaInserta() {
		return this.usrFechaInserta;
	}

	public void setUsrFechaInserta(Timestamp usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

}
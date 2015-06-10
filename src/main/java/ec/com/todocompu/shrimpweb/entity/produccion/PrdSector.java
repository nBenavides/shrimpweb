package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the prd_sector database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_sector")
@NamedQuery(name="PrdSector.findAll", query="SELECT p FROM PrdSector p")
public class PrdSector implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdSectorPK id;

	@Column(name="sec_activo")
	private Boolean secActivo;

	@Column(name="sec_latitud", length=25)
	private String secLatitud;

	@Column(name="sec_longitud", length=25)
	private String secLongitud;

	@Column(name="sec_nombre", nullable=false, length=50)
	private String secNombre;

	@Column(name="usr_codigo", nullable=false, length=7)
	private String usrCodigo;

	@Column(name="usr_empresa", nullable=false, length=7)
	private String usrEmpresa;

	@Column(name="usr_fecha_inserta", nullable=false)
	private Timestamp usrFechaInserta;

	//bi-directional many-to-one association to PrdPiscina
	@OneToMany(mappedBy="prdSector")
	private List<PrdPiscina> prdPiscinas;

	//bi-directional many-to-one association to PrdSobrevivencia
	@OneToMany(mappedBy="prdSector")
	private List<PrdSobrevivencia> prdSobrevivencias;

	public PrdSector() {
	}

	public PrdSectorPK getId() {
		return this.id;
	}

	public void setId(PrdSectorPK id) {
		this.id = id;
	}

	public Boolean getSecActivo() {
		return this.secActivo;
	}

	public void setSecActivo(Boolean secActivo) {
		this.secActivo = secActivo;
	}

	public String getSecLatitud() {
		return this.secLatitud;
	}

	public void setSecLatitud(String secLatitud) {
		this.secLatitud = secLatitud;
	}

	public String getSecLongitud() {
		return this.secLongitud;
	}

	public void setSecLongitud(String secLongitud) {
		this.secLongitud = secLongitud;
	}

	public String getSecNombre() {
		return this.secNombre;
	}

	public void setSecNombre(String secNombre) {
		this.secNombre = secNombre;
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

	public List<PrdPiscina> getPrdPiscinas() {
		return this.prdPiscinas;
	}

	public void setPrdPiscinas(List<PrdPiscina> prdPiscinas) {
		this.prdPiscinas = prdPiscinas;
	}

	public PrdPiscina addPrdPiscina(PrdPiscina prdPiscina) {
		getPrdPiscinas().add(prdPiscina);
		prdPiscina.setPrdSector(this);

		return prdPiscina;
	}

	public PrdPiscina removePrdPiscina(PrdPiscina prdPiscina) {
		getPrdPiscinas().remove(prdPiscina);
		prdPiscina.setPrdSector(null);

		return prdPiscina;
	}

	public List<PrdSobrevivencia> getPrdSobrevivencias() {
		return this.prdSobrevivencias;
	}

	public void setPrdSobrevivencias(List<PrdSobrevivencia> prdSobrevivencias) {
		this.prdSobrevivencias = prdSobrevivencias;
	}

	public PrdSobrevivencia addPrdSobrevivencia(PrdSobrevivencia prdSobrevivencia) {
		getPrdSobrevivencias().add(prdSobrevivencia);
		prdSobrevivencia.setPrdSector(this);

		return prdSobrevivencia;
	}

	public PrdSobrevivencia removePrdSobrevivencia(PrdSobrevivencia prdSobrevivencia) {
		getPrdSobrevivencias().remove(prdSobrevivencia);
		prdSobrevivencia.setPrdSector(null);

		return prdSobrevivencia;
	}

}
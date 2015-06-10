package ec.com.todocompu.shrimpweb.entity.produccion;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the prd_vehiculos database table.
 * 
 */
@Entity
@Table(schema="produccion",name="prd_vehiculos")
@NamedQuery(name="PrdVehiculo.findAll", query="SELECT p FROM PrdVehiculo p")
public class PrdVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrdVehiculoPK id;

	@Column(name="veh_anio", length=20)
	private String vehAnio;

	@Column(name="veh_chasis", length=20)
	private String vehChasis;

	@Column(name="veh_cilindraje", length=20)
	private String vehCilindraje;

	@Column(name="veh_cliente_direccion", length=100)
	private String vehClienteDireccion;

	@Column(name="veh_cliente_id", length=13)
	private String vehClienteId;

	@Column(name="veh_cliente_nombre", length=100)
	private String vehClienteNombre;

	@Column(name="veh_cliente_telefono", length=10)
	private String vehClienteTelefono;

	@Column(name="veh_color", length=20)
	private String vehColor;

	@Column(name="veh_combustible", length=20)
	private String vehCombustible;

	@Column(name="veh_compra_comision", precision=11, scale=2)
	private BigDecimal vehCompraComision;

	@Column(name="veh_compra_multas_ant", precision=11, scale=2)
	private BigDecimal vehCompraMultasAnt;

	@Column(name="veh_compra_multas_ctg", precision=11, scale=2)
	private BigDecimal vehCompraMultasCtg;

	@Column(name="veh_compra_valor", precision=11, scale=2)
	private BigDecimal vehCompraValor;

	@Column(name="veh_marca", length=20)
	private String vehMarca;

	@Column(name="veh_matriculado_a_nombre_de", length=100)
	private String vehMatriculadoANombreDe;

	@Column(name="veh_modelo", length=20)
	private String vehModelo;

	@Column(name="veh_motor", length=20)
	private String vehMotor;

	@Column(name="veh_observaciones", length=20)
	private String vehObservaciones;

	@Column(name="veh_origen", length=20)
	private String vehOrigen;

	@Column(name="veh_primer_traspaso_direccion", length=100)
	private String vehPrimerTraspasoDireccion;

	@Column(name="veh_primer_traspaso_id", length=13)
	private String vehPrimerTraspasoId;

	@Column(name="veh_primer_traspaso_nombre", length=100)
	private String vehPrimerTraspasoNombre;

	@Column(name="veh_primer_traspaso_telefono", length=10)
	private String vehPrimerTraspasoTelefono;

	@Column(name="veh_proveedor_direccion", length=100)
	private String vehProveedorDireccion;

	@Column(name="veh_proveedor_id", length=13)
	private String vehProveedorId;

	@Column(name="veh_proveedor_nombre", length=100)
	private String vehProveedorNombre;

	@Column(name="veh_proveedor_telefono", length=10)
	private String vehProveedorTelefono;

	@Column(name="veh_segundo_traspaso_direccion", length=100)
	private String vehSegundoTraspasoDireccion;

	@Column(name="veh_segundo_traspaso_id", length=13)
	private String vehSegundoTraspasoId;

	@Column(name="veh_segundo_traspaso_nombre", length=100)
	private String vehSegundoTraspasoNombre;

	@Column(name="veh_segundo_traspaso_telefono", length=10)
	private String vehSegundoTraspasoTelefono;

	@Column(name="veh_tipo", length=20)
	private String vehTipo;

	@Column(name="veh_tipo_servicio", length=20)
	private String vehTipoServicio;

	@Column(name="veh_tonelaje", length=20)
	private String vehTonelaje;

	@Column(name="veh_venta_comision", precision=11, scale=2)
	private BigDecimal vehVentaComision;

	@Column(name="veh_venta_valor", precision=11, scale=2)
	private BigDecimal vehVentaValor;

	//bi-directional many-to-one association to PrdPiscina
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="pis_empresa", referencedColumnName="pis_empresa", nullable=false),
		@JoinColumn(name="pis_numero", referencedColumnName="pis_numero", nullable=false),
		@JoinColumn(name="pis_sector", referencedColumnName="pis_sector", nullable=false)
		})
	private PrdPiscina prdPiscina;

	public PrdVehiculo() {
	}

	public PrdVehiculoPK getId() {
		return this.id;
	}

	public void setId(PrdVehiculoPK id) {
		this.id = id;
	}

	public String getVehAnio() {
		return this.vehAnio;
	}

	public void setVehAnio(String vehAnio) {
		this.vehAnio = vehAnio;
	}

	public String getVehChasis() {
		return this.vehChasis;
	}

	public void setVehChasis(String vehChasis) {
		this.vehChasis = vehChasis;
	}

	public String getVehCilindraje() {
		return this.vehCilindraje;
	}

	public void setVehCilindraje(String vehCilindraje) {
		this.vehCilindraje = vehCilindraje;
	}

	public String getVehClienteDireccion() {
		return this.vehClienteDireccion;
	}

	public void setVehClienteDireccion(String vehClienteDireccion) {
		this.vehClienteDireccion = vehClienteDireccion;
	}

	public String getVehClienteId() {
		return this.vehClienteId;
	}

	public void setVehClienteId(String vehClienteId) {
		this.vehClienteId = vehClienteId;
	}

	public String getVehClienteNombre() {
		return this.vehClienteNombre;
	}

	public void setVehClienteNombre(String vehClienteNombre) {
		this.vehClienteNombre = vehClienteNombre;
	}

	public String getVehClienteTelefono() {
		return this.vehClienteTelefono;
	}

	public void setVehClienteTelefono(String vehClienteTelefono) {
		this.vehClienteTelefono = vehClienteTelefono;
	}

	public String getVehColor() {
		return this.vehColor;
	}

	public void setVehColor(String vehColor) {
		this.vehColor = vehColor;
	}

	public String getVehCombustible() {
		return this.vehCombustible;
	}

	public void setVehCombustible(String vehCombustible) {
		this.vehCombustible = vehCombustible;
	}

	public BigDecimal getVehCompraComision() {
		return this.vehCompraComision;
	}

	public void setVehCompraComision(BigDecimal vehCompraComision) {
		this.vehCompraComision = vehCompraComision;
	}

	public BigDecimal getVehCompraMultasAnt() {
		return this.vehCompraMultasAnt;
	}

	public void setVehCompraMultasAnt(BigDecimal vehCompraMultasAnt) {
		this.vehCompraMultasAnt = vehCompraMultasAnt;
	}

	public BigDecimal getVehCompraMultasCtg() {
		return this.vehCompraMultasCtg;
	}

	public void setVehCompraMultasCtg(BigDecimal vehCompraMultasCtg) {
		this.vehCompraMultasCtg = vehCompraMultasCtg;
	}

	public BigDecimal getVehCompraValor() {
		return this.vehCompraValor;
	}

	public void setVehCompraValor(BigDecimal vehCompraValor) {
		this.vehCompraValor = vehCompraValor;
	}

	public String getVehMarca() {
		return this.vehMarca;
	}

	public void setVehMarca(String vehMarca) {
		this.vehMarca = vehMarca;
	}

	public String getVehMatriculadoANombreDe() {
		return this.vehMatriculadoANombreDe;
	}

	public void setVehMatriculadoANombreDe(String vehMatriculadoANombreDe) {
		this.vehMatriculadoANombreDe = vehMatriculadoANombreDe;
	}

	public String getVehModelo() {
		return this.vehModelo;
	}

	public void setVehModelo(String vehModelo) {
		this.vehModelo = vehModelo;
	}

	public String getVehMotor() {
		return this.vehMotor;
	}

	public void setVehMotor(String vehMotor) {
		this.vehMotor = vehMotor;
	}

	public String getVehObservaciones() {
		return this.vehObservaciones;
	}

	public void setVehObservaciones(String vehObservaciones) {
		this.vehObservaciones = vehObservaciones;
	}

	public String getVehOrigen() {
		return this.vehOrigen;
	}

	public void setVehOrigen(String vehOrigen) {
		this.vehOrigen = vehOrigen;
	}

	public String getVehPrimerTraspasoDireccion() {
		return this.vehPrimerTraspasoDireccion;
	}

	public void setVehPrimerTraspasoDireccion(String vehPrimerTraspasoDireccion) {
		this.vehPrimerTraspasoDireccion = vehPrimerTraspasoDireccion;
	}

	public String getVehPrimerTraspasoId() {
		return this.vehPrimerTraspasoId;
	}

	public void setVehPrimerTraspasoId(String vehPrimerTraspasoId) {
		this.vehPrimerTraspasoId = vehPrimerTraspasoId;
	}

	public String getVehPrimerTraspasoNombre() {
		return this.vehPrimerTraspasoNombre;
	}

	public void setVehPrimerTraspasoNombre(String vehPrimerTraspasoNombre) {
		this.vehPrimerTraspasoNombre = vehPrimerTraspasoNombre;
	}

	public String getVehPrimerTraspasoTelefono() {
		return this.vehPrimerTraspasoTelefono;
	}

	public void setVehPrimerTraspasoTelefono(String vehPrimerTraspasoTelefono) {
		this.vehPrimerTraspasoTelefono = vehPrimerTraspasoTelefono;
	}

	public String getVehProveedorDireccion() {
		return this.vehProveedorDireccion;
	}

	public void setVehProveedorDireccion(String vehProveedorDireccion) {
		this.vehProveedorDireccion = vehProveedorDireccion;
	}

	public String getVehProveedorId() {
		return this.vehProveedorId;
	}

	public void setVehProveedorId(String vehProveedorId) {
		this.vehProveedorId = vehProveedorId;
	}

	public String getVehProveedorNombre() {
		return this.vehProveedorNombre;
	}

	public void setVehProveedorNombre(String vehProveedorNombre) {
		this.vehProveedorNombre = vehProveedorNombre;
	}

	public String getVehProveedorTelefono() {
		return this.vehProveedorTelefono;
	}

	public void setVehProveedorTelefono(String vehProveedorTelefono) {
		this.vehProveedorTelefono = vehProveedorTelefono;
	}

	public String getVehSegundoTraspasoDireccion() {
		return this.vehSegundoTraspasoDireccion;
	}

	public void setVehSegundoTraspasoDireccion(String vehSegundoTraspasoDireccion) {
		this.vehSegundoTraspasoDireccion = vehSegundoTraspasoDireccion;
	}

	public String getVehSegundoTraspasoId() {
		return this.vehSegundoTraspasoId;
	}

	public void setVehSegundoTraspasoId(String vehSegundoTraspasoId) {
		this.vehSegundoTraspasoId = vehSegundoTraspasoId;
	}

	public String getVehSegundoTraspasoNombre() {
		return this.vehSegundoTraspasoNombre;
	}

	public void setVehSegundoTraspasoNombre(String vehSegundoTraspasoNombre) {
		this.vehSegundoTraspasoNombre = vehSegundoTraspasoNombre;
	}

	public String getVehSegundoTraspasoTelefono() {
		return this.vehSegundoTraspasoTelefono;
	}

	public void setVehSegundoTraspasoTelefono(String vehSegundoTraspasoTelefono) {
		this.vehSegundoTraspasoTelefono = vehSegundoTraspasoTelefono;
	}

	public String getVehTipo() {
		return this.vehTipo;
	}

	public void setVehTipo(String vehTipo) {
		this.vehTipo = vehTipo;
	}

	public String getVehTipoServicio() {
		return this.vehTipoServicio;
	}

	public void setVehTipoServicio(String vehTipoServicio) {
		this.vehTipoServicio = vehTipoServicio;
	}

	public String getVehTonelaje() {
		return this.vehTonelaje;
	}

	public void setVehTonelaje(String vehTonelaje) {
		this.vehTonelaje = vehTonelaje;
	}

	public BigDecimal getVehVentaComision() {
		return this.vehVentaComision;
	}

	public void setVehVentaComision(BigDecimal vehVentaComision) {
		this.vehVentaComision = vehVentaComision;
	}

	public BigDecimal getVehVentaValor() {
		return this.vehVentaValor;
	}

	public void setVehVentaValor(BigDecimal vehVentaValor) {
		this.vehVentaValor = vehVentaValor;
	}

	public PrdPiscina getPrdPiscina() {
		return this.prdPiscina;
	}

	public void setPrdPiscina(PrdPiscina prdPiscina) {
		this.prdPiscina = prdPiscina;
	}

}
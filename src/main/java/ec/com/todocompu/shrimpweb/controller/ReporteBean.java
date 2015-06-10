package ec.com.todocompu.shrimpweb.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import ec.com.todocompu.shrimpweb.entity.produccion.PrdSector;
import ec.com.todocompu.shrimpweb.entity.sistemaweb.SisEmpresa;
import ec.com.todocompu.shrimpweb.service.PrdSectorService;
import ec.com.todocompu.shrimpweb.service.SisEmpresaService;
import ec.com.todocompu.utilidades.service.ReporteService;

@Controller
@Scope("session")
public class ReporteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private SisEmpresaService sisEmpresaService;

	@Autowired
	private PrdSectorService prdSectorService;

	@Autowired
	private ReporteService reporteService;

	private Date fechaInicio;
	private Date fechaFin;

	private List<SisEmpresa> empresas;
	private String empresa;

	private List<PrdSector> sectores;
	private String sector;

	public ReporteBean() {
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@PostConstruct
	public void init() {
		empresas = new ArrayList<SisEmpresa>();
		empresas = sisEmpresaService
				.obtenerEmpresasPorUsuario(SecurityContextHolder.getContext()
						.getAuthentication().getName());
	}

	public List<PrdSector> getSectores() {
		return sectores;
	}

	public void setSectores(List<PrdSector> sectores) {
		this.sectores = sectores;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public void cargarCentroProduccion() {
		sectores = new ArrayList<PrdSector>();
		sectores = prdSectorService.obtenerPorEmpresa(empresa);
	}

	public List<SisEmpresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<SisEmpresa> empresas) {
		this.empresas = empresas;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public void resumenSiembra() {
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("TITLE", "REPORTE DE SIEMBRA");
		parametros.put("EMPRESA", empresa.trim());
		reporteService.generarPdf("ResumenSiembras", parametros, null);
	}

}

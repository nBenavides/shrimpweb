package ec.com.todocompu.shrimpweb.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ec.com.todocompu.shrimpweb.entity.sistemaweb.SisEmpresa;

public interface SisEmpresaService {

	@Transactional(readOnly = true)
	public List<SisEmpresa> obtenerEmpresasPorUsuario(String usuario);

}

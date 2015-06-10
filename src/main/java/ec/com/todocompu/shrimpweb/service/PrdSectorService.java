package ec.com.todocompu.shrimpweb.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ec.com.todocompu.shrimpweb.entity.produccion.PrdSector;

public interface PrdSectorService {

	@Transactional(readOnly = true)
	public List<PrdSector> obtenerPorEmpresa(String empresa);

}

package ec.com.todocompu.shrimpweb.service;

import org.springframework.transaction.annotation.Transactional;

public interface InvProveedorService {

	@Transactional(readOnly = true)
	public String obtenerPorRuc(String ruc);

}

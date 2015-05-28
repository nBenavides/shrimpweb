package ec.com.todocompu.shrimpweb.service;

import org.springframework.transaction.annotation.Transactional;

public interface InvClienteService {

	@Transactional(readOnly = true)
	public String obtenerPorCedulaRuc(String cedulaRuc);

}

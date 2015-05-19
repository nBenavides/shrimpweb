package ec.com.todocompu.shrimpweb.service;

import org.springframework.transaction.annotation.Transactional;

public interface DocumentoElectronicoService {

	@Transactional(readOnly = true)
	public void obtenerDocumentosPorCedulaRucMesAnio(String cedulaRuc,
			String mes, String anio);

}

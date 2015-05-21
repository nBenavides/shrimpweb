package ec.com.todocompu.shrimpweb.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ec.com.todocompu.shrimpweb.entity.ComprobanteElectronico;

public interface DocumentoElectronicoService {

	@Transactional(readOnly = true)
	public List<ComprobanteElectronico> obtenerDocumentosPorCedulaRucMesAnio(
			String cedulaRuc, String mes, String anio);

}

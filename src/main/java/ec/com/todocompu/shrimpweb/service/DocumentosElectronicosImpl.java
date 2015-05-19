package ec.com.todocompu.shrimpweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.todocompu.shrimpweb.dao.AnxCompraElectronicaDao;
import ec.com.todocompu.shrimpweb.dao.AnxVentaElectronicaDao;

@Service
public class DocumentosElectronicosImpl implements DocumentosElectronicos {
	@Autowired
	private AnxCompraElectronicaDao anxCompraElectronicaDao;
	@Autowired
	private AnxVentaElectronicaDao anxVentaElectronicaDao;
	@Override
	public void obtenerDocumentosPorCedulaRucMesAnio(String cedulaRuc,
			String mes, String anio) {
		

	}

}

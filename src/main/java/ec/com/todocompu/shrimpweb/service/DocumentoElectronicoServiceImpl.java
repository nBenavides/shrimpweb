package ec.com.todocompu.shrimpweb.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.todocompu.shrimpweb.dao.AnxCompraElectronicaDao;
import ec.com.todocompu.shrimpweb.dao.AnxVentaElectronicaDao;
import ec.com.todocompu.shrimpweb.entity.AnxCompraElectronica;

@Service
public class DocumentoElectronicoServiceImpl implements
		DocumentoElectronicoService, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private AnxCompraElectronicaDao anxCompraElectronicaDao;

	@Autowired
	private AnxVentaElectronicaDao anxVentaElectronicaDao;

	@Override
	public void obtenerDocumentosPorCedulaRucMesAnio(String cedulaRuc,
			String mes, String anio) {
		List<AnxCompraElectronica> listaAnxCompraElectronicas;
		listaAnxCompraElectronicas = anxCompraElectronicaDao.obtenerLista(
				"select a from AnxCompraElectronica a", new Object[] {}, false,
				new Object[] {});
		for (AnxCompraElectronica anxCompraElectronica : listaAnxCompraElectronicas) {
			System.out.println(anxCompraElectronica.geteClaveAcceso());
		}
	}

}

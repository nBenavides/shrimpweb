package ec.com.todocompu.shrimpweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.todocompu.shrimpweb.dao.SisPcsDao;
import ec.com.todocompu.shrimpweb.entity.SisPcs;

@Service
public class SisPcsServiceImpl implements SisPcsService {

	@Autowired
	SisPcsDao sisPcsDao;

	public void insertarPc(SisPcs sisPcs) throws Exception {
		sisPcsDao.insertar(sisPcs);
	}

	public SisPcs obtenerPcPorMac(String mac) throws Exception {
		return sisPcsDao.obtenerObjeto(
				"select pc from SisPcs pc where pc.infMac=?1",
				new Object[] { mac }, false);
	}

	public SisPcs actualizarPc(SisPcs sisPcs) throws Exception {
		sisPcsDao.actualizar(sisPcs);
		return null;
	}
}
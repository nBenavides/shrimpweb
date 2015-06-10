package ec.com.todocompu.shrimpweb.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.todocompu.shrimpweb.dao.PrdSectorDao;
import ec.com.todocompu.shrimpweb.entity.produccion.PrdSector;

@Service
public class PrdSectorServiceImpl implements PrdSectorService, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private PrdSectorDao prdSectorDao;

	@Override
	public List<PrdSector> obtenerPorEmpresa(String empresa) {
		return prdSectorDao.obtenerLista("select s from PrdSector s "
				+ "where trim(s.id.secEmpresa)=?1 order by s.secNombre",
				new Object[] { empresa.trim() }, false, new Object[] {});
	}

}

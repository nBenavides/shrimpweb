package ec.com.todocompu.shrimpweb.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpweb.entity.SisPcs;
import ec.com.todocompu.utilidades.dao.GenericDaoImpl;

@Repository
public class SisPcsDaoImpl extends GenericDaoImpl<SisPcs, String> implements
		SisPcsDao {

}

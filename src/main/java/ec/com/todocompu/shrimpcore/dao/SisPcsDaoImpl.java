package ec.com.todocompu.shrimpcore.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpcore.entity.SisPcs;
import ec.com.todocompu.shrimputils.dao.GenericDaoImpl;

@Repository
public class SisPcsDaoImpl extends GenericDaoImpl<SisPcs, String> implements
		SisPcsDao {

}

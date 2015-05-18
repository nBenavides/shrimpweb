package ec.com.todocompu.shrimpsoftweb.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpsoftweb.entity.SisPcs;
import ec.com.todocompu.shrimputils.dao.GenericDaoImpl;

@Repository
public class SisPcsDaoImpl extends GenericDaoImpl<SisPcs, String> implements
		SisPcsDao {

}

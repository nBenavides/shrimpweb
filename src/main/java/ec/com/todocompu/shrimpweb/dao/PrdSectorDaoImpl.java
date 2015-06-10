package ec.com.todocompu.shrimpweb.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpweb.entity.produccion.PrdSector;
import ec.com.todocompu.shrimpweb.entity.produccion.PrdSectorPK;
import ec.com.todocompu.utilidades.dao.GenericDaoImpl;

@Repository
public class PrdSectorDaoImpl extends GenericDaoImpl<PrdSector, PrdSectorPK>
		implements PrdSectorDao {

}

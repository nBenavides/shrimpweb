package ec.com.todocompu.shrimpweb.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpweb.entity.AnxCompraElectronica;
import ec.com.todocompu.shrimpweb.entity.AnxCompraElectronicaPK;
import ec.com.todocompu.utilidades.dao.GenericDaoImpl;

@Repository
public class AnxCompraElectronicaDaoImpl extends
		GenericDaoImpl<AnxCompraElectronica, AnxCompraElectronicaPK> implements
		AnxCompraElectronicaDao {

}

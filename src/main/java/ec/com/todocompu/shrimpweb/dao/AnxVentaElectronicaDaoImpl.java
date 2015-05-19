package ec.com.todocompu.shrimpweb.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpweb.entity.AnxVentaElectronica;
import ec.com.todocompu.shrimpweb.entity.AnxVentaElectronicaPK;
import ec.com.todocompu.utilidades.dao.GenericDaoImpl;

@Repository
public class AnxVentaElectronicaDaoImpl extends
		GenericDaoImpl<AnxVentaElectronica, AnxVentaElectronicaPK> implements
		AnxVentaElectronicaDao {

}

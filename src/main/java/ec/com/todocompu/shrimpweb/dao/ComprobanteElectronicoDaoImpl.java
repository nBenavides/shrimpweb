package ec.com.todocompu.shrimpweb.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpweb.entity.ComprobanteElectronico;
import ec.com.todocompu.utilidades.dao.GenericDaoImpl;

@Repository
public class ComprobanteElectronicoDaoImpl extends
		GenericDaoImpl<ComprobanteElectronico, String> implements
		ComprobanteElectronicoDao {

}

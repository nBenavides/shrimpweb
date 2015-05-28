package ec.com.todocompu.shrimpweb.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpweb.entity.InvProveedor;
import ec.com.todocompu.shrimpweb.entity.InvProveedorPK;
import ec.com.todocompu.utilidades.dao.GenericDaoImpl;

@Repository
public class InvProveedorDaoImpl extends
		GenericDaoImpl<InvProveedor, InvProveedorPK> implements InvProveedorDao {

}

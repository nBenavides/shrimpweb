package ec.com.todocompu.shrimpweb.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpweb.entity.InvCliente;
import ec.com.todocompu.shrimpweb.entity.InvClientePK;
import ec.com.todocompu.utilidades.dao.GenericDaoImpl;

@Repository
public class InvClienteDaoImpl extends GenericDaoImpl<InvCliente, InvClientePK>
		implements InvClienteDao {

}

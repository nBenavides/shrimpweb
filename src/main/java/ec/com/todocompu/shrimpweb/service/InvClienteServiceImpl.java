package ec.com.todocompu.shrimpweb.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.todocompu.shrimpweb.dao.InvClienteDao;
import ec.com.todocompu.shrimpweb.entity.InvCliente;

@Service
public class InvClienteServiceImpl implements InvClienteService, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private InvClienteDao invClienteDao;

	@Override
	public String obtenerPorCedulaRuc(String cedulaRuc) {
		InvCliente invCliente = invClienteDao.obtenerObjeto(
				"select c from InvCliente c where c.cliIdNumero=?1 ",
				new Object[] { cedulaRuc }, false, new Object[] {});

		if (invCliente != null)
			return invCliente.getCliNombre().trim();
		else
			return null;
	}

}

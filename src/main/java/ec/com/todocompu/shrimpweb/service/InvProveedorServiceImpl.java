package ec.com.todocompu.shrimpweb.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.todocompu.shrimpweb.dao.InvProveedorDao;
import ec.com.todocompu.shrimpweb.entity.InvProveedor;

@Service
public class InvProveedorServiceImpl implements InvProveedorService,
		Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private InvProveedorDao invProveedorDao;

	@Override
	public String obtenerPorRuc(String ruc) {
		InvProveedor invProveedor = invProveedorDao.obtenerObjeto(

		"select p from InvProveedor p where p.provIdNumero=?1 ",
				new Object[] { ruc }, false, new Object[] {});

		if (invProveedor != null)
			return invProveedor.getProvNombre().trim();
		else
			return null;
	}
}

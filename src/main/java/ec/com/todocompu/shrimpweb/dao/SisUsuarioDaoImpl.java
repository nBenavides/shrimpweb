package ec.com.todocompu.shrimpweb.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpweb.entity.SisUsuario;
import ec.com.todocompu.utilidades.dao.GenericDaoImpl;

@Repository
public class SisUsuarioDaoImpl extends GenericDaoImpl<SisUsuario, String>
		implements SisUsuarioDao {

}

package ec.com.todocompu.shrimpcore.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpcore.entity.SisUsuario;
import ec.com.todocompu.shrimputils.dao.GenericDaoImpl;

@Repository
public class SisUsuarioDaoImpl extends GenericDaoImpl<SisUsuario, String>
		implements SisUsuarioDao {

}

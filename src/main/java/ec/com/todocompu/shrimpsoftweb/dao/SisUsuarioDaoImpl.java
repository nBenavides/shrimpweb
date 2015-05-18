package ec.com.todocompu.shrimpsoftweb.dao;

import org.springframework.stereotype.Repository;

import ec.com.todocompu.shrimpsoftweb.entity.SisUsuario;
import ec.com.todocompu.shrimputils.dao.GenericDaoImpl;

@Repository
public class SisUsuarioDaoImpl extends GenericDaoImpl<SisUsuario, String>
		implements SisUsuarioDao {

}

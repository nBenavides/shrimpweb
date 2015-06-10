package ec.com.todocompu.shrimpweb.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.todocompu.shrimpweb.dao.SisEmpresaDao;
import ec.com.todocompu.shrimpweb.entity.sistemaweb.SisEmpresa;

@Service
public class SisEmpresaServiceImpl implements SisEmpresaService, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private SisEmpresaDao sisEmpresaDao;

	@Override
	public List<SisEmpresa> obtenerEmpresasPorUsuario(String usuario) {
		return sisEmpresaDao
				.obtenerLista(
						"select e from SisEmpresa e "
								+ "inner join e.sisGrupos g inner join g.sisUsuarioDetalles ud "
								+ "inner join ud.sisUsuario u where trim(u.usrNick)=?1 "
								+ "order by e.empRazonSocial",
						new Object[] { usuario }, false, new Object[] {});
	}

}

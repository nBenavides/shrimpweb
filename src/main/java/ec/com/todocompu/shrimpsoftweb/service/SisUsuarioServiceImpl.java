package ec.com.todocompu.shrimpsoftweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.todocompu.shrimpsoftweb.dao.SisUsuarioDao;
import ec.com.todocompu.shrimpsoftweb.entity.SisUsuario;

@Service
public class SisUsuarioServiceImpl implements SisUsuarioService {

	@Autowired
	SisUsuarioDao sisUsuarioDao;

	public String login(String nick, String password) throws Exception {
		String mensaje = "";
		SisUsuario usuario = sisUsuarioDao.obtenerObjeto(
				"select u from SisUsuario u where u.usrNick = ?1",
				new Object[] { nick }, false);
		if (usuario == null) {
			mensaje = "El usuario no existe";
		} else {
			String passwordOrigen = usuario.getUsrPassword();
			// Desencriptar.desencriptarMod(usuario.getUsrPassword());
			if (passwordOrigen.compareTo(password) != 0) {
				mensaje = "Contraseña incorrecta";
			} else {
				mensaje = "VALIDO";
			}
		}
		return mensaje;
	}
}
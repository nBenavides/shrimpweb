package ec.com.todocompu.shrimpweb.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

@Controller
@Scope("session")
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public void logout() {
		SecurityContextHolder.clearContext();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("/shrimpweb/views/publicas/login.jsf");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

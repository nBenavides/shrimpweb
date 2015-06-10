package ec.com.todocompu.shrimpweb.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import ec.com.todocompu.utilidades.Conexion;

@Configuration
@EnableWebSecurity
// @PropertySource("classpath:database.properties")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		Conexion conexion = Conexion.getConexion();

		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(conexion.getDriver());
		dataSource.setUrl("jdbc:" + conexion.getDb() + "://"
				+ conexion.getServer() + ":" + conexion.getPort() + "/"
				+ conexion.getDatabase());
		dataSource.setUsername(conexion.getUser());
		dataSource.setPassword(conexion.getPassword());

		return dataSource;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf()
				.disable()
				.authorizeRequests()
				.antMatchers("/javax.faces.resource/**", "/resources/**",
						"/views/publicas/**").permitAll()

				.antMatchers("/views/privadas/**").access("isAuthenticated()")

				.and().formLogin().loginPage("/views/publicas/login.jsf")
				.defaultSuccessUrl("/views/privadas/dashboard.jsf")

				.and().logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/views/publicas/login.jsf")
				.invalidateHttpSession(true).deleteCookies("JSESSIONID")

				.and().exceptionHandling()
				.accessDeniedPage("/views/publicas/access-denied.jsf")

				.and().sessionManagement()
				.invalidSessionUrl("/views/publicas/login.jsf")
				.maximumSessions(1);
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {

		auth.jdbcAuthentication().dataSource(this.dataSource())
				.passwordEncoder(new ShaPasswordEncoder(256))
				.usersByUsernameQuery(getUserQuery())
				.authoritiesByUsernameQuery(getAuthoritiesQuery());
	}

	// private String getAuthoritiesQuery() {
	// return "select u.login, r.nombre "
	// +
	// "from seguridad.usuarios as u, seguridad.roles as r, seguridad.permisos as p "
	// + "where u.login = p.usuario and r.nombre = p.rol and u.login = ?";
	// }

	private String getAuthoritiesQuery() {
		return "select distinct trim(u.usr_nick), trim(g.gru_nombre) "
				+ "from sistemaweb.sis_usuario as u "
				+ "inner join sistemaweb.sis_usuario_detalle ud on (ud.usr_codigo=u.usr_codigo) "
				+ "inner join sistemaweb.sis_grupo g on (g.gru_empresa=ud.gru_empresa and g.gru_codigo=ud.gru_codigo) "
				+ "where u.usr_nick=?";
	}

	private String getUserQuery() {
		return "select trim(u.usr_nick), trim(u.usr_password), u.usr_activo from sistemaweb.sis_usuario u where u.usr_nick=?";
	}
}

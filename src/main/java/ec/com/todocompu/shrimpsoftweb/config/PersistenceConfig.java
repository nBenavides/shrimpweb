package ec.com.todocompu.shrimpsoftweb.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("ec.com.redepronik")
@PropertySource("classpath:database.properties")
public class PersistenceConfig {

	@Autowired
	private Environment env;

	@Value("${jdbc.driverClassName}")
	String driverClassName;

	@Value("${jdbc.language}")
	String language;

	@Value("${jdbc.server}")
	String server;

	@Value("${jdbc.port}")
	String port;

	@Value("${jdbc.database}")
	String database;

	@Value("${jdbc.username}")
	String username;

	@Value("${jdbc.password}")
	String password;

	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl("jdbc:" + language + "://" + server + ":" + port
				+ "/" + database);
		dataSource.setUsername(username);
		dataSource.setPassword(password);

		return dataSource;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@SuppressWarnings("serial")
	Properties hibernateProperties() {
		return new Properties() {
			{
				setProperty("hibernate.dialect",
						"org.hibernate.dialect.PostgreSQLDialect");
				setProperty("hibernate.show_sql", "true");
				setProperty("hibernate.default_schema", "negosys");
			}
		};
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "ec.com.redepronik" });
		sessionFactory.setHibernateProperties(hibernateProperties());

		return sessionFactory;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory().getObject());

		return txManager;
	}
}
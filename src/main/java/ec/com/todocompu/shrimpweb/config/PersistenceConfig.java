package ec.com.todocompu.shrimpweb.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
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
@ComponentScan("ec.com.todocompu")
@PropertySource("classpath:database.properties")
public class PersistenceConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		String server = env.getProperty("jdbc.server");
		String port = env.getProperty("jdbc.port");
		String database = env.getProperty("jdbc.database");
		String username = env.getProperty("jdbc.username");
		String password = env.getProperty("jdbc.password");

		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://" + server + ":" + port + "/"
				+ database);
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
			}
		};
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "ec.com.todocompu" });
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
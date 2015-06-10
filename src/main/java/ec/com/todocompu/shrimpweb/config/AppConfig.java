package ec.com.todocompu.shrimpweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ PersistenceConfig.class, SecurityConfig.class })
public class AppConfig {

}

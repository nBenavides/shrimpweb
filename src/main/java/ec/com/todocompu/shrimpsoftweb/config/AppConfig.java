package ec.com.todocompu.shrimpsoftweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ PersistenceConfig.class })
public class AppConfig {

}

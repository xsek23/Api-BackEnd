package Api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages = {"controller","daoContactos","daoAboutUs","daoUsuarios","daoEventos"})
@EntityScan(basePackages = {"model"})
@EnableJpaRepositories(basePackages = {"daoContactos","daoAboutUs","daoUsuarios","daoEventos"})

@SpringBootApplication
public class ApiBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBackEndApplication.class, args);

}
}
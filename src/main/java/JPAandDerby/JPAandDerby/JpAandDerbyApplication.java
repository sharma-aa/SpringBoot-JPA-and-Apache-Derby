package JPAandDerby.JPAandDerby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@ComponentScan(basePackages = "Players")
@EnableJpaRepositories("Players")
@EntityScan("Players")
@SpringBootApplication
public class JpAandDerbyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpAandDerbyApplication.class, args);
	}

}

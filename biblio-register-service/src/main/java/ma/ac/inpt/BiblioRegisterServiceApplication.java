package ma.ac.inpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BiblioRegisterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiblioRegisterServiceApplication.class, args);
	}

}

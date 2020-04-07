package ma.ac.inpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BiblioConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiblioConfigServiceApplication.class, args);
	}

}

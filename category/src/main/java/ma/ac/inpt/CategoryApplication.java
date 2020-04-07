package ma.ac.inpt;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import ma.ac.inpt.dao.CategoryRepository;
import ma.ac.inpt.entities.Category;

@EnableDiscoveryClient
@SpringBootApplication
public class CategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	CommandLineRunner start(CategoryRepository categoryRepository) {
		return args->{
			categoryRepository.deleteAll();
			Stream.of("C1 Roman","C2 Poesie","C3 Théatre","C4 Revue","C5 Journal").forEach(c->{
				categoryRepository.save(new Category(c.split(" ")[0],c.split(" ")[1]));
			});
			categoryRepository.findAll().forEach(System.out::println);
		};
	}

}

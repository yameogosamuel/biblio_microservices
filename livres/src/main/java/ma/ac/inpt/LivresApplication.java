package ma.ac.inpt;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import ma.ac.inpt.dao.LivreRepository;
import ma.ac.inpt.entities.Livre;

@EnableDiscoveryClient
@SpringBootApplication
public class LivresApplication implements CommandLineRunner{
	

	@Autowired
	LivreRepository livreRepository;
	public static void main(String[] args) {
		SpringApplication.run(LivresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		          
		/*
		 * livreRepository.save(new Livre(1L,"Tribal","Samuel",new Date(), 123,"C1"));
		 * livreRepository.save(new Livre(2L,"Rebelle","Yaméogo",new Date(), 321,
		 * "C1")); livreRepository.save(new Livre(3L,"La belle","Paul",new Date(),54,
		 * "C2")); livreRepository.save(new Livre(4L,"Ô temps","Yaméogo",new Date(),340,
		 * "C2")); livreRepository.save(new Livre(5L,"Oscar","Nathalie",new Date(),78,
		 * "C3")); livreRepository.save(new Livre(6L,"Guere Guerre","Augustin",new
		 * Date(),98, "C3")); livreRepository.save(new Livre(7L,"Mousso","FratMat",new
		 * Date(),74, "C4")); livreRepository.save(new Livre(8L,"Go mag","Sidwaya",new
		 * Date(),643, "C4")); livreRepository.save(new
		 * Livre(9L,"Ssport","Sport Mag",new Date(),48, "C5")); livreRepository.save(new
		 * Livre(10L,"Soir info","FPI",new Date(),32, "C5"));
		 */
		
	}

}

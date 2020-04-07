package ma.ac.inpt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.ac.inpt.entities.Livre;

@RepositoryRestResource
public interface LivreRepository extends JpaRepository<Livre, Long>{
	public List<Livre> getLivreByCategory(String category);

}

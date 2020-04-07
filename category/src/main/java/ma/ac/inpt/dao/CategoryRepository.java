package ma.ac.inpt.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.ac.inpt.entities.Category;

@RepositoryRestResource
public interface CategoryRepository extends MongoRepository<Category, String>{
	@Query("select id from Category c")
	public List<String> getId();

}

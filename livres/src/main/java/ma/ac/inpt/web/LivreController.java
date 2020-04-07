package ma.ac.inpt.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ac.inpt.dao.LivreRepository;
import ma.ac.inpt.entities.Livre;
import ma.ac.inpt.models.CatLivre;

@RestController
public class LivreController {
	
	@Autowired
	LivreRepository livreRepository;
	
	@RequestMapping(value = "/livres", method = RequestMethod.GET)
	public List<Livre> getLivres(){
		return livreRepository.findAll();
	}
	
	@RequestMapping(value = "/livres/{id}", method = RequestMethod.GET)
	public Livre getLivre(@PathVariable Long id){
		return livreRepository.findById(id).get();
	}
	
	@RequestMapping(value = "/livresByCat/{category}", method = RequestMethod.GET)
	public CatLivre getLivresByCat(@PathVariable String category){
		return new CatLivre(livreRepository.getLivreByCategory(category));
	}
	
}

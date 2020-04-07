package ma.ac.inpt.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ac.inpt.entities.Livre;

@Data @NoArgsConstructor @AllArgsConstructor
public class Categorie {
	private String id;
	private String name;
	private List<Livre> livres;

}

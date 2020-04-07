package ma.ac.inpt.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.ac.inpt.entities.Category;

@Data @NoArgsConstructor @AllArgsConstructor
public class ListCat {
	private List<Category> listcat;
}

package ma.ac.inpt.models;

import java.io.Serializable;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Category implements Serializable{
	private String id;
	private String name;
	
}

package com.dolsoft.dmm.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dolsoft.dmm.domain.Ingredient;

@CrossOrigin(origins="http://localhost:8080")
public interface IngredientRepository  
	extends CrudRepository<Ingredient, String> {

}

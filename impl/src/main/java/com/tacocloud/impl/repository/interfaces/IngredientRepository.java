package com.tacocloud.impl.repository.interfaces;

import com.tacocloud.impl.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}

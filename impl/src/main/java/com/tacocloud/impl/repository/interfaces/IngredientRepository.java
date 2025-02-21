package com.tacocloud.impl.repository.interfaces;

import com.tacocloud.impl.model.Ingredient;
import org.springframework.data.relational.core.sql.In;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}

package com.tacocloud.impl.repository.interfaces;

import com.tacocloud.impl.model.Ingredient;

import java.util.Optional;

public interface IngredientRepositoryInterface {
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}

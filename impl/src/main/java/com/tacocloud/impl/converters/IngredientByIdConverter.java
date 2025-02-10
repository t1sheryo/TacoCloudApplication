package com.tacocloud.impl.converters;

import java.util.HashMap;
import java.util.Map;

import com.tacocloud.impl.enums.Type;
import com.tacocloud.impl.model.Ingredient;
import com.tacocloud.impl.repository.JdbcIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private JdbcIngredientRepository ingredientRepository;

    @Autowired
    public IngredientByIdConverter(JdbcIngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }
    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id).orElse(null);
    }
}


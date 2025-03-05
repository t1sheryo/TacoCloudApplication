package com.tacocloud.impl.model.helper;

import com.tacocloud.impl.model.Ingredient;
import com.tacocloud.impl.model.Taco;
import jnr.ffi.annotations.In;

public class TacoUDRUtils {
    public static IngredientUDT toIngredientUDT(Ingredient ingredient){
        return new IngredientUDT(ingredient.getName(), ingredient.getType());
    }

    public static TacoUDT toTacoUDT(Taco taco){
        return new TacoUDT(taco.getName(), taco.getIngredients());
    }
}

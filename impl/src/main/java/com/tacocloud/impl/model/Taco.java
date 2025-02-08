package com.tacocloud.impl.model;

import lombok.Data;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min = 3, message = "Taco name must have at least 3 characters")
    private String name;

    @NotNull
    @Size(min = 1, message = "Taco must have at least 1 ingredient")
    private List<Ingredient> ingredients;
}

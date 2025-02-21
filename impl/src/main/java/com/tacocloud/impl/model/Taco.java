package com.tacocloud.impl.model;

import com.tacocloud.impl.model.helper.IngredientRef;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.List;

@Data
@Table
public class Taco {
    @Id
    private long id;
    private Date createdAt = new Date();
    @NotNull
    @Size(min = 3, message = "Taco name must have at least 3 characters")
    private String name;

    @NotNull
    @Size(min = 1, message = "Taco must have at least 1 ingredient")
    private List<IngredientRef> ingredients;
}

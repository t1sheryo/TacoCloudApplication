package com.tacocloud.impl.model;

import com.tacocloud.impl.enums.Type;
import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
}

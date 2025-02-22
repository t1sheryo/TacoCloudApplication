package com.tacocloud.impl.model;

import com.tacocloud.impl.enums.Type;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
public class Ingredient{
    @Id
    private final String id;

    private final String name;

    private final Type type;
}

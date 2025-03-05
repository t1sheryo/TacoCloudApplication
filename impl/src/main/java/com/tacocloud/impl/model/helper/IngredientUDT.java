package com.tacocloud.impl.model.helper;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;
 import lombok.AccessLevel;
 import lombok.Data;
 import lombok.NoArgsConstructor;
 import lombok.RequiredArgsConstructor;
 import com.tacocloud.impl.model.Ingredient;
 import com.tacocloud.impl.enums.Type;
 @Data
 @RequiredArgsConstructor
 @NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
 @UserDefinedType("ingredient")
 public class IngredientUDT {
  private final String name;
  private final Type type;
 }

package com.tacocloud.impl.repository;

import com.tacocloud.impl.enums.Type;
import com.tacocloud.impl.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcIngredientRepository implements IngredientRepositoryInterface {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcIngredientRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Iterable<Ingredient> findAll() {
        return jdbcTemplate.query(
                "SELECT id, name, type FROM Ingredient",
                this::mapRowToIngredient);
    }

    @Override
    public Optional<Ingredient> findById(String id) {
        List<Ingredient> results = jdbcTemplate.query(
                "SELECT id, name, type FROM Ingredient WHERE id=?",
                this::mapRowToIngredient, id);
        return results.isEmpty() ?
                Optional.empty() :
                Optional.of(results.getFirst());
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        jdbcTemplate.update(
                "INSERT INTO Ingredient (id, name, type) VALUES (?, ?, ?)",
                ingredient.getId(),
                ingredient.getName(),
                ingredient.getType().toString());
        return ingredient;
    }

    private Ingredient mapRowToIngredient(ResultSet row, int rowNum)
        throws SQLException {
        return new Ingredient(
                row.getString("id"),
                row.getString("name"),
                Type.valueOf(row.getString("type"))
        );
    }
}

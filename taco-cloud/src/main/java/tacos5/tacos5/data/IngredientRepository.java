package tacos5.tacos5.data;

import org.springframework.data.repository.CrudRepository;
import tacos5.tacos5.Ingredient;

import java.util.Optional;

public interface IngredientRepository{

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}

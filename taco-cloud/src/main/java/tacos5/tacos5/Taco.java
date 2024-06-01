package tacos5.tacos5;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Taco {

    private Long id;

    private Date createAt = new Date();

    @NotNull
    @Size(min = 3, message = "name must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "you must be choose at least 1 ingredient")

    private List<IngredientRef> ingredients = new ArrayList<>();

}
package tacos5.tacos5.data;

import org.springframework.data.repository.CrudRepository;
import tacos5.tacos5.Ingredient;
import tacos5.tacos5.Taco;
import tacos5.tacos5.TacoOrder;

public interface OrderRepository{

    TacoOrder save(TacoOrder order);
}

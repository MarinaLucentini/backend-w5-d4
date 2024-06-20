package marinalucentini.backend_w5_d4.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Entity
@Getter
@Setter

@ToString
public class Pizza extends ElementMenu{
private List<Topping> ingredients;

    public Pizza() {
    }

    public Pizza(String name, double price, int calories, List<Topping> ingredients) {
        super(name, price, calories);
        this.ingredients = ingredients;
    }
}

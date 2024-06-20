package marinalucentini.backend_w5_d4.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Entity
@Getter
@Setter
@DiscriminatorValue("pizza")
@ToString
public class Pizza extends ElementMenu{
    @ManyToMany
    @JoinTable(name = "pizzas_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> ingredients;



    public Pizza() {
    }

    public Pizza(String name, double price, int calories, List<Topping> ingredients) {
        super(name, price, calories);
        this.ingredients = ingredients;
    }
}

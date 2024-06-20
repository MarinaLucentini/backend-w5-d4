package marinalucentini.backend_w5_d4.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Setter
@Getter
@ToString

@DiscriminatorValue("topping")
public class Topping extends ElementMenu {
    @ManyToMany
            (mappedBy = "ingredients")
    List<Pizza> pizzas;
    public Topping() {
    }

    public Topping(String name, double price, int calories) {
        super(name, price, calories);
    }
}

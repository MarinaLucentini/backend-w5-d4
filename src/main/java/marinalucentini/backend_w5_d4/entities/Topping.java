package marinalucentini.backend_w5_d4.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString


public class Topping extends ElementMenu {
    public Topping() {
    }

    public Topping(String name, double price, int calories) {
        super(name, price, calories);
    }
}

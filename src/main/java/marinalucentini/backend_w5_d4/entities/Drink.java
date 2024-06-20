package marinalucentini.backend_w5_d4.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity

@Setter
@Getter
@ToString
@DiscriminatorValue("drink")
public class Drink extends ElementMenu{
    private double quantity;

    public Drink(String name, double price, int calories, double quantity) {
        super(name, price, calories);
        this.quantity = quantity;
    }

    public Drink() {
    }
}

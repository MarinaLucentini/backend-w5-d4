package marinalucentini.backend_w5_d4.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public abstract class ElementMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    private int calories;

    public ElementMenu() {
    }

    public ElementMenu(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}

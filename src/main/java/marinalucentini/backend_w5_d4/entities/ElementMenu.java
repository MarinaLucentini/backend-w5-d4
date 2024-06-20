package marinalucentini.backend_w5_d4.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "tipo_elemento")
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

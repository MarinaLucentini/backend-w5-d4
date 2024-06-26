package marinalucentini.backend_w5_d4.repositories;

import marinalucentini.backend_w5_d4.entities.Drink;
import marinalucentini.backend_w5_d4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {

}

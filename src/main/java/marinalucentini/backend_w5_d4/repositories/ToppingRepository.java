package marinalucentini.backend_w5_d4.repositories;

import marinalucentini.backend_w5_d4.entities.Pizza;
import marinalucentini.backend_w5_d4.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepository extends JpaRepository<Topping, Long> {
}

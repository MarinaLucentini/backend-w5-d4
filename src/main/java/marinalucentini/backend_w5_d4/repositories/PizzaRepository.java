package marinalucentini.backend_w5_d4.repositories;

import marinalucentini.backend_w5_d4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    @Query("SELECT p FROM Pizza p JOIN FETCH p.ingredients")
    List<Pizza> findAllWithIngredients();
    Pizza findByName (String name);
    boolean existsByName(String name);
    List<Pizza> findAll();

}

package marinalucentini.backend_w5_d4.services;

import marinalucentini.backend_w5_d4.entities.Pizza;
import marinalucentini.backend_w5_d4.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaServices {
    @Autowired
   private PizzaRepository pizzaRepository;
    public void savePizza(Pizza pizza) {

pizzaRepository.save(pizza);




        // 5. Log di avvenuto salvataggio
        System.out.println("Pizza " + pizza.getName() + "salvata con successo nel db");

    }
}
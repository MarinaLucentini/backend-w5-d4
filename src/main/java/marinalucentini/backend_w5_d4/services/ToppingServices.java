package marinalucentini.backend_w5_d4.services;

import marinalucentini.backend_w5_d4.entities.Pizza;
import marinalucentini.backend_w5_d4.entities.Topping;
import marinalucentini.backend_w5_d4.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingServices {
    @Autowired
   private ToppingRepository toppingRepository;
    public void saveTopping(Topping topping) {

       toppingRepository.save(topping);




        // 5. Log di avvenuto salvataggio
        System.out.println("Ingrediente " + topping.getName() + "salvata con successo nel db");

    }
}

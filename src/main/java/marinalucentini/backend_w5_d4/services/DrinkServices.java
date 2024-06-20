package marinalucentini.backend_w5_d4.services;

import marinalucentini.backend_w5_d4.entities.Drink;
import marinalucentini.backend_w5_d4.entities.Topping;
import marinalucentini.backend_w5_d4.repositories.DrinkRepository;
import marinalucentini.backend_w5_d4.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkServices {
    @Autowired
   private DrinkRepository drinkRepository;
    public void saveDrink(Drink drink) {

      drinkRepository.save(drink);



        // 5. Log di avvenuto salvataggio
        System.out.println("Bevanda" + drink.getName() + " salvata con successo nel db");

    }
}

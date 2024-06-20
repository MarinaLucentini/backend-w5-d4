package marinalucentini.backend_w5_d4.services;

import marinalucentini.backend_w5_d4.entities.Pizza;
import marinalucentini.backend_w5_d4.exception.NotFoundEx;
import marinalucentini.backend_w5_d4.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServices {
    @Autowired
   private PizzaRepository pizzaRepository;
    public void savePizza(Pizza pizza) {

pizzaRepository.save(pizza);

        System.out.println("Pizza " + pizza.getName() + "salvata con successo nel db");

    }
    public List<Pizza> findAll(){
        return pizzaRepository.findAll();
    }
    public Pizza findById(long id){
        return pizzaRepository.findById(id).orElseThrow(()-> new NotFoundEx(id));
    }
    public Pizza findByName(String name){
        return pizzaRepository.findByName(name);
    }
}

package marinalucentini.backend_w5_d4.services;

import marinalucentini.backend_w5_d4.entities.Pizza;
import marinalucentini.backend_w5_d4.entities.Topping;
import marinalucentini.backend_w5_d4.exception.ElementExist;
import marinalucentini.backend_w5_d4.exception.NotFoundEx;
import marinalucentini.backend_w5_d4.repositories.PizzaRepository;
import marinalucentini.backend_w5_d4.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PizzaServices {
    @Autowired
   private PizzaRepository pizzaRepository;
    @Autowired
    private ToppingRepository toppingRepository;
    public void savePizza(Pizza pizza) {
        if(pizzaRepository.existsByName(pizza.getName())){
            throw new ElementExist(pizza.getName());
        }
        List<Topping> toppings = pizza.getIngredients().stream()
                .map(ingredient -> toppingRepository.findByName(ingredient.getName()))
                .collect(Collectors.toList());

        pizza.setIngredients(toppings);

pizzaRepository.save(pizza);

        System.out.println("Pizza " + pizza.getName() + "salvata con successo nel db");

    }

    public List<Pizza> findAll(){
        return pizzaRepository.findAllWithIngredients();
    }
    public Pizza findById(long id){
        return pizzaRepository.findById(id).orElseThrow(()-> new NotFoundEx(id));
    }
    public Pizza findByName(String name){
        return pizzaRepository.findByName(name);
    }
}

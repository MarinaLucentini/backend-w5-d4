package marinalucentini.backend_w5_d4;

import marinalucentini.backend_w5_d4.entities.Drink;
import marinalucentini.backend_w5_d4.entities.Pizza;
import marinalucentini.backend_w5_d4.entities.Topping;
import marinalucentini.backend_w5_d4.services.DrinkServices;
import marinalucentini.backend_w5_d4.services.PizzaServices;
import marinalucentini.backend_w5_d4.services.ToppingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
   private PizzaServices pizzaServices;
    @Autowired
    private DrinkServices drinkServices;
    @Autowired
    private ToppingServices toppingServices;
    @Autowired
    private AnnotationConfigApplicationContext context;
    @Override
    public void run(String... args) throws Exception {

     Pizza pizza = context.getBean("pizzaHawaiana",Pizza.class);
     Pizza pizza2 = context.getBean("pizzaDoubleCheese",Pizza.class);
     Pizza pizza3 = context.getBean("pizzaOnion",Pizza.class);
     Pizza pizza1 = context.getBean(Pizza.class);
     Pizza pizza4 = context.getBean("pizzaSalami", Pizza.class);
        System.out.println(pizza.getName());
        Drink drink = context.getBean("water", Drink.class);
        Drink drink1 = context.getBean("wine", Drink.class);
        Drink drink2 = context.getBean("lemonade", Drink.class);
//       drinkServices.saveDrink(drink);
//       drinkServices.saveDrink(drink1);
//      drinkServices.saveDrink(drink2);
        Topping topping = context.getBean("getToppingCheese",Topping.class);
        Topping topping1 = context.getBean("getToppingTomato", Topping.class);
        Topping topping2 = context.getBean("getToppingHam", Topping.class);
        Topping topping3 = context.getBean("getToppingOnion", Topping.class);
        Topping topping4 = context.getBean("getToppingPineaple", Topping.class);
        Topping topping5 = context.getBean("getToppingSalami", Topping.class);
//       toppingServices.saveTopping(topping);
//        toppingServices.saveTopping(topping1);
//        toppingServices.saveTopping(topping2);
//        toppingServices.saveTopping(topping3);
//       toppingServices.saveTopping(topping4);
//       toppingServices.saveTopping(topping5);
////
//pizzaServices.savePizza(pizza);
//pizzaServices.savePizza(pizza2);
//pizzaServices.savePizza(pizza3);
//pizzaServices.savePizza(pizza1);
//       pizzaServices.savePizza(pizza4);
       System.out.println(pizzaServices.findAll().getFirst().getIngredients().getFirst().getName());

       // System.out.println(pizzaServices.findByName("Pizza Hawaiana").getIngredients());

    }
}

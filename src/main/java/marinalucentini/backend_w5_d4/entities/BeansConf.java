package marinalucentini.backend_w5_d4.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

@Configuration
public class BeansConf {
    // ***** Ingredienti
    @Bean
    @Primary
public Topping getToppingCheese (){
        return new Topping("Cheese", 0.69, 92);
    }
    @Bean
    public Topping getToppingTomato(){
return new Topping("Tomato", 0, 0);
    }
    @Bean
    public Topping getToppingHam(){
        return new Topping("Ham", 0.99, 35);
    }
    @Bean
    public Topping getToppingOnion(){
        return new Topping("Onions", 0.69,22);
    }
    @Bean
    public Topping getToppingPineaple(){
        return new Topping("Pineaple", 0.79, 24);
    }
    @Bean
    public Topping getToppingSalami(){
        return new Topping("Salami", 0.99, 86);
    }
    //******* Pizze ******
    @Bean
    @Primary
    public Pizza pizzaMargherita(){
        return new Pizza("Pizza Margherita", 4.99, 1104, Arrays.asList(getToppingTomato(), getToppingCheese()));
    }
    @Bean
    public Pizza pizzaHawaiana(){
        return new Pizza("Pizza Hawaiana", pizzaMargherita().getPrice() + getToppingHam().getPrice()+ getToppingPineaple().getPrice(), pizzaMargherita().getCalories()+ getToppingHam().getCalories() + getToppingPineaple().getCalories(), Arrays.asList(getToppingCheese(), getToppingTomato(), getToppingHam(), getToppingPineaple()) );
    }
    @Bean
    public Pizza pizzaSalami(){
        return new Pizza("Salami Pizza", pizzaMargherita().getPrice() + getToppingSalami().getPrice(), pizzaMargherita().getCalories() + getToppingSalami().getCalories(), Arrays.asList(getToppingSalami(), getToppingTomato(), getToppingCheese()));
    }
@Bean
    public Pizza pizzaDoubleCheese(){
        return new Pizza("Pizza double cheese", pizzaMargherita().getPrice() + getToppingCheese().getPrice(), pizzaMargherita().getCalories() + getToppingCheese().getCalories(), Arrays.asList(getToppingCheese(), getToppingCheese(), getToppingTomato()) );
}
@Bean
    public Pizza pizzaOnion (){
        return new Pizza("Pizza onion", pizzaMargherita().getPrice() + getToppingOnion().getPrice(), pizzaMargherita().getCalories() + getToppingOnion().getCalories(), Arrays.asList(getToppingOnion(), getToppingTomato(), getToppingCheese()) );

}
//***Drink ****
    @Bean
    @Primary
    public Drink water(){
        return new Drink("Water", 1.29, 0,0.5);
    }
    @Bean
    public Drink lemonade (){
        return new Drink("Lemonade", 1.29, 128, 0.33);
    }
    @Bean
    public Drink wine(){
        return new Drink("Wine", 7.49,607,0.75 );
    }

}

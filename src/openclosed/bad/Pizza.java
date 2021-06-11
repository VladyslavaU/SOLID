package openclosed.bad;

import java.util.ArrayList;

public class Pizza {
    private String pizza;

    public void  cookPizza(String pizza) {
        if (pizza.equals("Margherita")) {
            System.out.println("Tomatoes, mozzarella, basil, olive oil");
        } else if (pizza.equals("Marinara")) {
            System.out.println("Tomatoes, garlic, oregano, olive oil");
        } else {
            System.out.println("We have no such pizza");
        }
    }

}

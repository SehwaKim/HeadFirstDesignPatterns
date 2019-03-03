package headfirst.factory.pizzastore;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.ingredient.factory.impl.NYPizzaIngredientFactory;
import headfirst.factory.pizza.*;
import headfirst.factory.pizza.ny.NYStyleCheesePizza;
import headfirst.factory.pizza.ny.NYStyleClamPizza;
import headfirst.factory.pizza.ny.NYStylePepperoniPizza;
import headfirst.factory.pizza.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {

            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (type.equals("pepperoni")) {

            pizza = new NYStylePepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        } else if (type.equals("clam")) {

            pizza = new NYStyleClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (type.equals("veggie")) {

            pizza = new NYStyleVeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        }

        return pizza;
    }
}

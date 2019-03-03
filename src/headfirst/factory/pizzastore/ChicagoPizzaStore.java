package headfirst.factory.pizzastore;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.ingredient.factory.impl.ChicagoPizzaIngredientFactory;
import headfirst.factory.pizza.Pizza;
import headfirst.factory.pizza.chicago.ChicagoStyleCheesePizza;
import headfirst.factory.pizza.chicago.ChicagoStyleClamPizza;
import headfirst.factory.pizza.chicago.ChicagoStylePepperoniPizza;
import headfirst.factory.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {

            pizza = new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (type.equals("pepperoni")) {

            pizza = new ChicagoStylePepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        } else if (type.equals("clam")) {

            pizza = new ChicagoStyleClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (type.equals("veggie")) {

            pizza = new ChicagoStyleVeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        }

        return pizza;
    }
}

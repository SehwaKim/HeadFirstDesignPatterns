package headfirst.factory.pizzastore;

import headfirst.factory.pizza.*;
import headfirst.factory.pizza.ny.NYStyleCheesePizza;
import headfirst.factory.pizza.ny.NYStyleClamPizza;
import headfirst.factory.pizza.ny.NYStylePepperoniPizza;
import headfirst.factory.pizza.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}

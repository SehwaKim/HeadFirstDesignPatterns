package headfirst.factory.pizzastore;

import headfirst.factory.pizza.*;
import headfirst.factory.pizza.california.CaliforniaStyleCheesePizza;
import headfirst.factory.pizza.california.CaliforniaStyleClamPizza;
import headfirst.factory.pizza.california.CaliforniaStylePepperoniPizza;
import headfirst.factory.pizza.california.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        } else {
            return null;
        }
    }
}

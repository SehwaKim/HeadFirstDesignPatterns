package headfirst.factory.pizzastore;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.ingredient.factory.impl.CaliforniaPizzaIngredientFactory;
import headfirst.factory.pizza.*;
import headfirst.factory.pizza.california.CaliforniaStyleCheesePizza;
import headfirst.factory.pizza.california.CaliforniaStyleClamPizza;
import headfirst.factory.pizza.california.CaliforniaStylePepperoniPizza;
import headfirst.factory.pizza.california.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

        if (type.equals("cheese")) {

            pizza = new CaliforniaStyleCheesePizza(ingredientFactory);
            pizza.setName("Cali Style Cheese Pizza");

        } else if (type.equals("pepperoni")) {

            pizza = new CaliforniaStylePepperoniPizza(ingredientFactory);
            pizza.setName("Cali Style Cheese Pizza");

        } else if (type.equals("clam")) {

            pizza = new CaliforniaStyleClamPizza(ingredientFactory);
            pizza.setName("Cali Style Cheese Pizza");

        } else if (type.equals("veggie")) {

            pizza = new CaliforniaStyleVeggiePizza(ingredientFactory);
            pizza.setName("Cali Style Cheese Pizza");

        }

        return pizza;
    }
}

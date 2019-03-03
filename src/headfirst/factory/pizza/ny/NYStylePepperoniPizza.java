package headfirst.factory.pizza.ny;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    PizzaIngredientFactory factory;

    public NYStylePepperoniPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        pepperoni = factory.createPepperoni();
    }
}

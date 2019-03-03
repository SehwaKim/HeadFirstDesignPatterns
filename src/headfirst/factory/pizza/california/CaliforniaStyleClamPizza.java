package headfirst.factory.pizza.california;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.pizza.Pizza;

public class CaliforniaStyleClamPizza extends Pizza {
    PizzaIngredientFactory factory;

    public CaliforniaStyleClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        clam = factory.createClams();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}

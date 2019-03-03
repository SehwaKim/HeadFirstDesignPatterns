package headfirst.factory.pizza.chicago;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    PizzaIngredientFactory factory;

    public ChicagoStyleClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        clam = factory.createClams();
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}

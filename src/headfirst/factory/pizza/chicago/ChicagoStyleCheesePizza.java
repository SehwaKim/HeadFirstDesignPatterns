package headfirst.factory.pizza.chicago;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    PizzaIngredientFactory factory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}

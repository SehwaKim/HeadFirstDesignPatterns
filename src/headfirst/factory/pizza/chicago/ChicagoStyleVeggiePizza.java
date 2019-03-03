package headfirst.factory.pizza.chicago;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    PizzaIngredientFactory factory;

    public ChicagoStyleVeggiePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        veggies = factory.createVeggies();
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}

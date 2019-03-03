package headfirst.factory.pizza.california;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.pizza.Pizza;

public class CaliforniaStyleVeggiePizza extends Pizza {
    PizzaIngredientFactory factory;

    public CaliforniaStyleVeggiePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        veggies = factory.createVeggies();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}

package headfirst.factory.pizza.chicago;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    PizzaIngredientFactory factory;

    public ChicagoStylePepperoniPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        pepperoni = factory.createPepperoni();
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}

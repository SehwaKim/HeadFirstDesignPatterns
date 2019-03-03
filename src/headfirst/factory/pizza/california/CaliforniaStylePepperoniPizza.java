package headfirst.factory.pizza.california;

import headfirst.factory.ingredient.factory.PizzaIngredientFactory;
import headfirst.factory.pizza.Pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {
    PizzaIngredientFactory factory;

    public CaliforniaStylePepperoniPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        pepperoni = factory.createPepperoni();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}

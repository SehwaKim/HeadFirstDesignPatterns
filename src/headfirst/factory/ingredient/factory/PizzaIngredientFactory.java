package headfirst.factory.ingredient.factory;

import headfirst.factory.ingredient.*;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clam createClams();
}

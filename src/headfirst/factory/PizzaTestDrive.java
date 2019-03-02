package headfirst.factory;

import headfirst.factory.pizza.Pizza;
import headfirst.factory.pizzastore.ChicagoPizzaStore;
import headfirst.factory.pizzastore.NYPizzaStore;
import headfirst.factory.pizzastore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}

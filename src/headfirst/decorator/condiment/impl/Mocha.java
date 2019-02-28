package headfirst.decorator.condiment.impl;

import headfirst.decorator.beverage.Beverage;
import headfirst.decorator.condiment.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            cost += .15;
        } else if (getSize() == Beverage.GRANDE) {
            cost += .20;
        } else if (getSize() == Beverage.VENTI) {
            cost += .25;
        }
        return cost;
    }
}

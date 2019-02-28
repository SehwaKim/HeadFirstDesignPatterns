package headfirst.decorator.condiment.impl;

import headfirst.decorator.beverage.Beverage;
import headfirst.decorator.condiment.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 크림";
    }

    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            cost += .05;
        } else if (getSize() == Beverage.GRANDE) {
            cost += .10;
        } else if (getSize() == Beverage.VENTI) {
            cost += .20;
        }
        return cost;
    }
}

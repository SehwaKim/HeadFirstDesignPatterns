package headfirst.decorator.condiment.impl;

import headfirst.decorator.beverage.Beverage;
import headfirst.decorator.condiment.CondimentDecorator;

public class SteamMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀 우유";
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
            cost += .15;
        }
        return cost;
    }
}

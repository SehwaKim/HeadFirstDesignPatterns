package headfirst.decorator.condiment;

import headfirst.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}

package headfirst.simuduck.behavior.fly.impl;

import headfirst.simuduck.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}

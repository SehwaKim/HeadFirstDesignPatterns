package headfirst.simuduck.behavior.fly.impl;

import headfirst.simuduck.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly on little wings");
    }
}

package headfirst.simuduck.behavior.quack.impl;

import headfirst.simuduck.behavior.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak squeak");
    }
}

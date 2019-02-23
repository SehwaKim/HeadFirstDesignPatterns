package headfirst.simuduck.behavior.quack.impl;

import headfirst.simuduck.behavior.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}

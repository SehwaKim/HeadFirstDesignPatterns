package headfirst.simuduck.behavior.quack.impl;

import headfirst.simuduck.behavior.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("dose not sound at all");
    }
}

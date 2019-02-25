package headfirst.simuduck.duck;

import headfirst.simuduck.behavior.fly.impl.FlyWithWings;
import headfirst.simuduck.behavior.quack.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i am a mallard duck");
    }
}

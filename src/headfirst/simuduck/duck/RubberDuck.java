package headfirst.simuduck.duck;

import headfirst.simuduck.behavior.fly.impl.FlyNoWay;
import headfirst.simuduck.behavior.quack.impl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("i am a rubber duck");
    }
}

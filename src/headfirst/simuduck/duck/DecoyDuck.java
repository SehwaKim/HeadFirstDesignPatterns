package headfirst.simuduck.duck;

import headfirst.simuduck.behavior.fly.impl.FlyNoWay;
import headfirst.simuduck.behavior.quack.impl.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("i am a decoy duck");
    }
}

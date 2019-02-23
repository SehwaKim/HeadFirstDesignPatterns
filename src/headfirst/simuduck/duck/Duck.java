package headfirst.simuduck.duck;

import headfirst.simuduck.behavior.fly.FlyBehavior;
import headfirst.simuduck.behavior.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("swimming");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

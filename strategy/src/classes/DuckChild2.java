package classes;

import Interfaces.*;

public class DuckChild2 extends Duck{

    public DuckChild2() {
        flyable = new FlyBehaviorFlyImpl();
        quackable = new QuackBehavoirQuackImpl();
    }

    public void fly()
    {
        flyable.fly();
    }
    public void  quack()
    {
        quackable.quack();
    }

    @Override
    public void display() {
        System.out.println("im black");
    }
}

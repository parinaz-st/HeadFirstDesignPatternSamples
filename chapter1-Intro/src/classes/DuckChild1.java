package classes;

import Interfaces.FlyBehaviorCanNotFlyImpl;
import Interfaces.QuackBehavoirMuteImpl;

public class DuckChild1 extends Duck{

    public DuckChild1() {
        flyable = new FlyBehaviorCanNotFlyImpl();
        quackable = new QuackBehavoirMuteImpl();
    }

    public void quack()
    {
        quackable.quack();
    }
    public void fly()
    {
        flyable.fly();
    }
    @Override
    public void display() {
        System.out.println("im red!");
    }

}

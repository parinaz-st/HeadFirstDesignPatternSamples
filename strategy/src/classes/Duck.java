package classes;

import Interfaces.FlyBehavior;
import Interfaces.QuackBehavior;

public abstract class Duck {

    public FlyBehavior flyable ;
    public QuackBehavior quackable ;

    public FlyBehavior getFlyable() {
        return flyable;
    }

    public void setFlyable(FlyBehavior flyable) {
        this.flyable = flyable;
    }

    public QuackBehavior getQuackable() {
        return quackable;
    }

    public void setQuackable(QuackBehavior quackable) {
        this.quackable = quackable;
    }

    public void performFly()
    {
        flyable.fly();
    }
    public  void performQuack()
    {
        quackable.quack();
    }
    public void swim()
    {
        System.out.println("Im swimming");
    }
    public abstract void display();
}

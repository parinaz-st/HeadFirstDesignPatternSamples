package Interfaces;

public class FlyBehaviorCanNotFlyImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i cant fly");
    }
}

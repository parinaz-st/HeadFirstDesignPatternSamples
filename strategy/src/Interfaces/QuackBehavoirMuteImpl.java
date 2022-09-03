package Interfaces;

public class QuackBehavoirMuteImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I cant Quack!");
    }
}

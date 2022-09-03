import Interfaces.QuackBehavoirMuteImpl;
import classes.Duck;
import classes.DuckChild1;
import classes.DuckChild2;

public class Main {
    public static void main(String[] args) {
    Duck duckChild1 = new DuckChild1();
    System.out.println("Duck1:");
    duckChild1.performFly();
    duckChild1.performQuack();

    System.out.println("Duck2:");
    Duck duckChild2 = new DuckChild2();
    duckChild2.performFly();
    duckChild2.performQuack();
    //run time change of behavior
    duckChild2.setQuackable(new QuackBehavoirMuteImpl());
    duckChild2.performQuack();
    }
}

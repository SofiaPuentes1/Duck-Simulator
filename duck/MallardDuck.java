package duck;

import flybehavior.FlyWithWings;
import quackbehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Soy un pato Mallard");
    }
}
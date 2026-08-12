package duck;

import flybehavior.FlyNoWay;
import quackbehavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("Soy un pato de goma");
    }
}
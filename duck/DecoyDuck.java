package duck;

import flybehavior.FlyNoWay;
import quackbehavior.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("Soy un pato señuelo");
    }
}
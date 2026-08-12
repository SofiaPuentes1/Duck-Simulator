package duck;

import flybehavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck rubberDuckie = new RubberDuck();
        rubberDuckie.display();
        rubberDuckie.performQuack();
        rubberDuckie.performFly();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();

        decoy.setFlyBehavior(new FlyRocketPowered());
        decoy.performFly();
    }
}
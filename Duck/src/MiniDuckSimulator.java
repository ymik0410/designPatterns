public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        QuackBehavior qc = new Squeak();
        Squeak s = new Squeak(); 

        Hunter hunter = new Hunter(new Squeak());
        hunter.hunt();
        Hunter h2 = new Hunter(s);
        h2.hunt();
    }
}

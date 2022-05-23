public class Hunter {
    private QuackBehavior quacker;
    
    // Constructor
    public Hunter(QuackBehavior newQuacker) {
        this.quacker = newQuacker;
    }

    public void hunt() {
        quacker.quack();
        System.out.println("Hunter shoots");
    }

}

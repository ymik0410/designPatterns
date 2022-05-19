public class App {
    public static void main(String[] args) {
        User user = new User( "Yulia", 33);
        user.sayHello();
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}

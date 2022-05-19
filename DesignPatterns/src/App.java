public class App {
    public static void main(String[] args) {
        User user = new User( "Yulia", 33);
        user.sayHello();
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}

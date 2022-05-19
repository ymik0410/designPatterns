public class App {
    public static void main(String[] args) {
        // Getting started with Java
        User user = new User( "Yulia", 33);
        user.sayHello();

        // Interfaces
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        
        // Encapsulation
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
        
        // Abstraction
        MailService mailService = new MailService();
        mailService.sendEmail(); // we added a parameter to connect method, but do not need any changes here

    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}

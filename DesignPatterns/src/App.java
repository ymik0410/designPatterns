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

        // Inheritance

        // TextBox
        TextBox textBox = new TextBox();
        textBox.enable();
        // Button
        // CheckBox 
        // enable()
        // focus()
        // setPosition()
        
        // Polymorphism
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    // Polymorphism
    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}

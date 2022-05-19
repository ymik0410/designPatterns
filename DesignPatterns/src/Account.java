public class Account {
    private float balance;

    public void deposit(float amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0)
            balance -= amount;
    }

    //Setter! --> instead of this method we use deposit and withdraw methods
    /*
    public void setBalance(float balance) {
        if (balance > 0)
            this.balance = balance;
    }
    */

    //Getter!
    public float getBalance() {
        return balance;
    }
    // Encapsulation principle - bundling the data and methods that operate on the data 
    // within 1 unit or 1 class and hiding the values or state of an object inside the class
    // to prevent the objects from going in invalid state
}

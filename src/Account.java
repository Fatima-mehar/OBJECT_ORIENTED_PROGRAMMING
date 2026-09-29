class AccountDemo {
    public double balance;

    public AccountDemo() {
        balance = 0.0;
    }

    public AccountDemo(double b, double initialBonus) {
        balance = b + initialBonus;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Account {
    public static void main(String[] args) {
        AccountDemo acc1 = new AccountDemo();
        acc1.deposit(500);
        acc1.displayBalance();

        AccountDemo acc2 = new AccountDemo(1000, 50);
        acc2.withdraw(200);
        acc2.displayBalance();
    }
}
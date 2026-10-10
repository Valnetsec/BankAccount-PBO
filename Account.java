public class Account{
    private double balance;

    public Account(double initBalance){
        balance = initBalance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amount){
        if (amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount){
        if (amount <= 0 || amount > balance){
            return false;
        }

        balance -= amount;
        return true;
    }
}

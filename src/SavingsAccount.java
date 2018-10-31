public class SavingsAccount extends BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  SavingsAccount(){
        this("Unknown", 0, 0);
    }

    public SavingsAccount(String name, int accnum, double balance){
        super(name, accnum);
        setBalance(balance);
    }



    @Override
    public String toString() {
        return super.toString()+"\nBalance" +getBalance();
    }

    public double calcTax(){
        double tax = 0.2;
        return getBalance() * tax;
    }

    public void lodge(double amount){
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount){
        setBalance(getBalance() - amount);
    }
}

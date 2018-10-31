public abstract class BankAccount implements Transactable, Taxable {
    protected String name;
    protected int accnum;


    public String getName() {
        return name;
    }

    public int getAccnum() {
        return accnum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public BankAccount(String name,int accnum){
        setName(name);
        setAccnum(accnum);
    }

    public BankAccount(){
        this("Unknown", 0);
    }

    public String toString(){
        return "Name " +getName()+ "\n Account Number: " +getAccnum();
    }

    public  abstract double calcTax();

    public abstract void lodge(double amount);

    public abstract void withdraw(double amount);


}

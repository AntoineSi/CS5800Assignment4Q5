public class Account {
    private AccountHolder holder;
    private double balance = 0.0;

    public Account (double amount, AccountHolder holder){
        this.balance = amount;
        this.holder = holder;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
    public AccountHolder getHolder(){
        return holder;
    }
    public void setBalance(double amount){
        balance = amount;
    }
    public void setHolder(AccountHolder holder){
        this.holder = holder;

    }
}

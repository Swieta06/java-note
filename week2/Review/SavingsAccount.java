package week2.Review;

import com.sun.jmx.mbeanserver.NamedObject;

public class SavingsAccount extends Account{
    private double balance;
//const
    public SavingsAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber);
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        //this.balance=this.balance+balance
    }
    public void withDraw(double amount){
        this.balance += amount;
    }
//getter setter

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return accountNumber+"\n"+name+"\n"+"$"+balance;
    }
}

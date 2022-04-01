package week2.H2_4;

public abstract class SavingAccount {
    double deposit;

    public double getDeposit() {
        return deposit;
    }

    public SavingAccount(double deposit) {
        this.deposit = deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + deposit +
                '}';
    }
}

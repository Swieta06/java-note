package week2.H2_4;

public abstract class Account {
    public String name;
    public String accountNumber;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    //const
    public Account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;


    }


    //toString

    @Override
    public String toString() {
        System.out.println("Hasil dari toString untuk Account adalah");
        return accountNumber+" "+name;
    }

}

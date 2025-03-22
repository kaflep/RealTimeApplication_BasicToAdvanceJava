package assignmentTwo.encapsulation;

public class BankAccount {
    // private variables
    private int accountNumber;
    private String accountHolderNAme;
    private double balance;

    public BankAccount() {
    }
     // initialization an object when it is created and also sets initial values
    //for the object's attributes

    public BankAccount(int accountNumber, String accountHolderNAme, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderNAme = accountHolderNAme;
        this.balance = balance;
    }

    // getter method

    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderNAme(){
        return accountHolderNAme;
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Account Number: "+ getAccountNumber()+ "\nAccount Holder Name: "+ getAccountHolderNAme()
                + "\nBalance after deposit: " + balance);
    }
    public void withdraw(double amount){
        if(balance >= amount){
           balance = balance -amount;
            System.out.println("Balance after withdrawn: " + balance
            +"\nAccount Number : "+ getAccountNumber() + "\nAccount Holder Name: "+ getAccountHolderNAme());
        }
        else {
            System.out.println("Invalid, the amount you are trying to withdraw is more than balance left.");
        }

    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2314, "pratik", 1000);

        bankAccount.deposit(1000);

        bankAccount.withdraw(2000);
    }


}

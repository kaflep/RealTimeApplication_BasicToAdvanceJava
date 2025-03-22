package assignmentThree;

public class PaymentTransaction {
    private static int transactionCounter = 10000;
    private  int transactionId; // unique for each transaction
    private String payerName;
    private double amount;
    private String paymentMode;


    // constructor
    public PaymentTransaction(String payerName, double amount, String paymentMode){
        this.transactionId = ++transactionCounter; // it will generate transaction  unique
        this.payerName =payerName;
        this.amount =amount;
        this.paymentMode = paymentMode;
    }

    // this method is for displaying transaction details.
    public void displayDetails() {
        System.out.println("TransactionID:" + transactionId + ",Payer:"
                + payerName + ",Amount:$"+ amount + ",Mode:"+ paymentMode);
    }

}
class TestPaymentTransaction {
    public static void main(String[] args) {
        PaymentTransaction paymentTransaction = new PaymentTransaction("Pratik",5000,"Credit Card");
        PaymentTransaction paymentTransaction1 = new PaymentTransaction("Sana",2000,"Pay Pal");
        PaymentTransaction paymentTransaction2 = new PaymentTransaction("Arpan",750.50,"NetBanking");
        paymentTransaction.displayDetails();
        paymentTransaction1.displayDetails();
        paymentTransaction2.displayDetails();


    }
}

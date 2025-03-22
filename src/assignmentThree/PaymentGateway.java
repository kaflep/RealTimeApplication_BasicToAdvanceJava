package assignmentThree;

public class PaymentGateway {

    static{
        System.out.println("Initializing Payment Gateway ...Loading API Keys...");
    }
    public static void processPayment(String payer, double amount){
        System.out.println("Processing payment of $"+ amount + " for " +payer);
    }
}
class TestPaymentGateway {
    public static void main(String[] args) {
        PaymentGateway.processPayment("pratik",250);
        PaymentGateway.processPayment("Arpan",120.50);
    }
}

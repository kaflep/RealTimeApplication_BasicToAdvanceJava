package assignmentTwo.polymorphism;

public class Payment {

    public void processPayment(double amount){
        System.out.println("provided the payment: $ " +  amount);
    }
}
class CreditCardPayment extends Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("please processed your payment through credit card : $ "+ amount);
    }
}
class PayPalPayment extends Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("please processed your payment through pay pal : $ "+ amount);
    }
}
class UPIPayment extends Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("please processed your payment through UPI : $ "+ amount);
    }
}
class PaymentDetails {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.processPayment(5000);
        payment = new CreditCardPayment();
        payment.processPayment(2000);
        payment = new UPIPayment();
        payment.processPayment(3000);
    }
}

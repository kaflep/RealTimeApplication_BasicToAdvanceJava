package assignmentThree;

public class CardProcessor {

    static class CardValidation {

        public static boolean  isValidCard(String cardNumber) {

            if(cardNumber.startsWith("5")){
                System.out.println("Card " + cardNumber + " is valid (Mastercard)");
                return true;
            }
            else if(cardNumber.startsWith("4")){
                System.out.println("Card " + cardNumber + "is valid (Visa)");
                return true;
            }
             else {
                System.out.println("Card "+ cardNumber + "is invalid");
                 return false;
            }

        }

    }
}
 class TestCardProcessing {
     public static void main(String[] args) {
         String cardNumber1 = "5432190876";
         String cardNumber2= "321456789";
          CardProcessor.CardValidation.isValidCard(cardNumber1);


         CardProcessor.CardValidation.isValidCard(cardNumber2);


     }
 }

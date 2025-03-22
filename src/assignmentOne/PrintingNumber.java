package assignmentOne;

public class PrintingNumber {
    public static void main(String[] args) {

        displayNumber();
        // providing a sum of given number
        System.out.println("----------------------------");
        System.out.println("Sum : " + sumOfNaturalNumber(10));

        System.out.println("---------------------------------------");
        System.out.println("Even number  from 1  to 20");
        System.out.println("-------------------------------------------");

        displayEvenNumber();

        System.out.println("-------------------------------------------");
        System.out.println("Odd number for 1 to 20");
        System.out.println("-------------------------------------------");
        displayOddNumber();
        System.out.println("-------------------------------------------");
        System.out.println("calculated factorial number ");
        System.out.println("-------------------------------------------");
        System.out.println("total factorial number is : " + factorialCalculation(5));
        System.out.println("-------------------------------------------");

        System.out.println("Reverse number from 10 to 1 ");
        displayReverse();
        System.out.println("-------------------------------------------");

    }

    public static void displayNumber() {
        //print number from 1 to 10
        System.out.println("printing the value from 1 to 10 using for loop: ");
        System.out.println("-------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // using while loop for printing 1 to 10
        System.out.println("-------------------------------------------------------");
        System.out.println("printing the number from 1 to 10 using while loop: ");
        System.out.println("----------------------------------------------------");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }
        // using do while loop for printing 1 to 10
        System.out.println("-------------------------------------------------------");
        System.out.println("printing the number from 1 to 10 using do while loop: ");
        int k = 1;
        do {

            System.out.println(k);
            k++;
        }
        while (k <= 10);

    }

    //sum of the natural number :
    public static int sumOfNaturalNumber(int naturalNumber) {
        int sum = 0;
        for (int i = 1; i <= naturalNumber; i++) {
            sum += i;
        }
        return sum;
    }

    // display the even number form 1 to 20
    public static void displayEvenNumber() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    // display the odd number form 1 to 20
    public static void displayOddNumber() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    // finding the factorial
    public static int factorialCalculation(int number) {
        int totalFactorialNumber = 1;
        for (int i = number; i >= 1; i--) {
            totalFactorialNumber *= i;
        }
        return totalFactorialNumber;

    }

    public static void displayReverse() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}


package Com.Basic_Core_Programmes;

import java.util.Scanner;

public class Quotientandremainder {
     public static void main(String[] args) {
        // This statement will capture the user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        //Captured input would be stored in inputValue
        double dividend = scan.nextInt();
        double divisor = scan.nextInt();

        double Quotient = dividend / divisor;
        double remainder = dividend % divisor;

        System.out.println("Quotient: " + Quotient);
        System.out.println("remainder: " + remainder);

    }
}

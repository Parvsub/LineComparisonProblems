package Com.Basic_Core_Programmes;

import java.util.Scanner;

public class PrimeFactorization {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // This statement will capture the user input
        System.out.println("Enter the number");
        int number = scan.nextInt();            //Captured input would be stored in inputValue
        int i;
        for (i = 2; i < number; i++) {          // Logic to increment and execute the block of code
            while (number % 2 == 0) {
                System.out.println(i);
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }
}

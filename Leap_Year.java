package Com.Basic_Core_Programmes;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scan = new Scanner(System.in);   // This statement will capture the user input
        int year = scan.nextInt();               //Captured input would be stored in inputValue
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {  // Logic To check the condition
            System.out.println("Displayed number is a leap year");
        } else {
            System.out.println("Displayed number is not a leap year");
        }

    }
}
package Com.Basic_Core_Programmes;

import java.util.Scanner;

public class Largestamongthreenumbers {
    public static void main(String[] args) {
        int first;
        int second;
        int third;
        Scanner number = new Scanner(System.in);         // This statement will capture the user input
        System.out.println("Enter the first number");
        first = number.nextInt();                      //Captured input would be stored in inputValue
        System.out.println("Enter the second number ");
        second = number.nextInt();
        System.out.println("Enter the third number");
        third = number.nextInt();

        if ((first > second) && (first > third)) {   // Logic To get the output
            System.out.println("first number is largest");
        } else if (second > third) {
            System.out.println("Second number is largest");
        } else {
            System.out.println("third number is largest");
        }

    }
}


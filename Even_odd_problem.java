package Com.Basic_Core_Programmes;

import java.util.Scanner;

public class Even_odd_problem {
    public static void main(String[] args) {
        Scanner inputvalue = new Scanner(System.in);  //This statement will capture the user input
        System.out.println("Enter the number");
        int number = inputvalue.nextInt();            //Captured input would be stored in inputValue
        if (number % 2 == 0)                         // Logic To check the condition
        {
            System.out.println(" number is even ");
        } else {
            System.out.println(" number is odd ");
        }
    }
}

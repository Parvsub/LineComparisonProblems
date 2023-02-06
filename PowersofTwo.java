package Com.Basic_Core_Programmes;

import java.util.Scanner;

public class PowersofTwo {
    public static void main(String[] args) {
        int power, sum = 1;
        Scanner scan = new Scanner(System.in);    // This statement will capture the user input
        System.out.println("Enter the power");
        power = scan.nextInt();                   //Captured input would be stored in inputValue

        if (power > 31) {                        // Logic to print the powers of two
            System.out.println("Value of number should be less then 31");
            return;
        } else {
            System.out.println(sum);
            for (int i = 1; i <= power; i++) {
                sum = sum * 2;
                System.out.println(sum);

            }
        }
    }
}


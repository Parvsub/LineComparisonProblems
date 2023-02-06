package Com.Basic_Core_Programmes;

import java.util.Scanner;

public class Swaptwonumber {
    public static void main(String[] args) {
        int a;
        int b;
        int temp = 0;
        Scanner swap = new Scanner(System.in);    // This statement will capture the user input
        System.out.println("Enter the number");
        a = swap.nextInt();                       //Captured input would be stored in inputValue
        b = swap.nextInt();

        System.out.println(a + " " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}

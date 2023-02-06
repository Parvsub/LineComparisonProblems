package Com.Basic_Core_Programmes;

import java.util.Scanner;

public class Harmonic {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    //This statement will capture the user input
        System.out.println("Enter the number");
        int n = scan.nextInt();                  //Captured input would be stored in inputValue
        int i;

        double sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + (double) 1 / i;
            System.out.println("The sum of " + i + " th term harmonic series :" + sum);
        }
        System.out.println("The sum of " + n + " th term harmonic series :" + sum);
    }
}


package Com.Basic_Core_Programmes;

import java.util.Scanner;

public class percentage_flipcoin {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int count = 1;
        double random = 0.0;
        System.out.println(" Enter the number:");           //This statement will capture the user input
        Scanner positiveNumber = new Scanner(System.in);    //Captured input would be stored in inputValue
        int flip_coin = positiveNumber.nextInt();
        while (count <= flip_coin) {                        // To check the condition
            random = Math.random();                         // To get the random numbers
            System.out.println(random);
            if (random < 0.5) {                             // To check the result based on condition
                heads++;
                System.out.println("result: " + heads);
            } else {
                tails++;
                System.out.println("result: " + tails);
            }
            count++;                                         // To increment the count value
        }
        System.out.println("Number of heads :" + heads);
        System.out.println("Number of tails :" + tails);
        double headPercentage = (double) heads / flip_coin * 100;
        double tailPercentage = (double) tails / flip_coin * 100;

        System.out.println(" headpercentage :" + headPercentage);
        System.out.println(" tailpercentage :" + tailPercentage);

    }
}


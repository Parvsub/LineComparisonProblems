package Com.Basic_Core_Programmes;
import java.io.*;
import java.util.*;
public class Triples {
    // Prints all triplets in arr[] with 0 sum
    static void Triplets(int[] arr, int n) {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        found = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (found == false) System.out.println(" not exist ");
    }

    public static void main(String[] args) {
        {
            int arr[] = {0, -1, 2, -3, 1};
            int n = arr.length;
            Triplets(arr, n);
        }
    }
}

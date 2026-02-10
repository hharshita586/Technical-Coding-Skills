/// GIVEN AN ARRAY OF INTEGER A. FIND AND RETURN THE PRODUCT ARRAY OF THE SAME SIZE WHERE THE ith ELEMENT OF THE PRODUCT ARRAY WILL BE EQUALS TO THE PRODUCTS OF ALL ELEMENTS DIVIDED BY THE ith ELEMENT OF THR ARRAY

// OBSERVATION:
//The product of all elements of the array is first calculated.
//For each index i, the value of the product array is obtained by dividing the total product by A[i].

import java.util.Scanner;

public class Product_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] P = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int product = 1;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == 0)
                zeroCount++;
            else
                product *= A[i];
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1)
                P[i] = 0;
            else if (zeroCount == 1)
                P[i] = (A[i] == 0) ? product : 0;
            else
                P[i] = product / A[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(P[i] + " ");
        }
    }
}
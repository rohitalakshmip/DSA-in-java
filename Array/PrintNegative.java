package Array;

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input the size of array
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array");
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        // printing -ve values
        for (int i = 0; i < n; i++) {
            if (arr[i]<0) System.out.print(arr[i]+" ");
        }

    }

}

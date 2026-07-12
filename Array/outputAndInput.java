package Array;

import java.util.Scanner;

public class outputAndInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // initialization
        int[] arr = {5, 7, 2, 67, 43, -97};
        System.out.println(arr.length);// length of array
        int n = arr.length;
        for (int i = 0; i < n; i++) {  // n or <=5 if we don't use int n
            System.out.println(arr[i] + " ");
        }
        // while loop
        int i = 0;
        while (i < n) {  // 6 is the length of array
            System.out.println(arr[i] + " ");
            i++;
        }

        int[] ar = new int[7];
        //default
//        for (int j = 0; j <= 6 ; j++) {
//            System.out.println(ar[i]);
//        }
        //input
        for (int j = 0; j <= 6 ; j++) {
            ar[j] = sc.nextInt();
        }
        for (int j = 0; j <= 6 ; j++) {
            System.out.print(ar[j]+" ");
        }
    }
}
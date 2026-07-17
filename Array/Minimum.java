package Array;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.print("least element of array (min) = ");
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]<min) min=arr[i];
        }
        System.out.print(min);
    }
}

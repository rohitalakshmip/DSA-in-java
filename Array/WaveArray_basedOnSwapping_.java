package Array;

import java.util.Scanner;
import java.util.Arrays;
public class WaveArray_basedOnSwapping_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i += 2) {
            if (i == arr.length - 1) break;
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        //return arr;
        System.out.println(Arrays.toString(arr));
    }
}
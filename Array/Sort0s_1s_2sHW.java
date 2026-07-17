package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0s_1s_2sHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter o's , 1's ,2's in array");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int NumIs0 = 0;
        for(int ele : arr) {
            if(ele==0) NumIs0++;
        }
        int NumIs1 = 0;
        for(int ele : arr) {
            if(ele==1) NumIs1++;
        }
        for (int i = 0; i < NumIs0 ; i++) {
            arr[i] = 0;
        }
        for (int i = NumIs0; i < (NumIs1+NumIs0); i++) {
            arr[i] = 1;
        }
        for (int i =  (NumIs1+NumIs0); i < arr.length; i++) {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}

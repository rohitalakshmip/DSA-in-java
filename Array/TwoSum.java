package Array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // normal method but u can use boolean also
        int[] arr = {-1,2,3,4,-5,6,7};
        int target = sc.nextInt();
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.print(arr[i] + " at index "+i +" & "+arr[j]+" at index "+j+" give two sum" );
                }
            } System.out.println();
        }
    }
}

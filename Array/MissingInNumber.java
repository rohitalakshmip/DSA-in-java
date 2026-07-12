package Array;

import java.util.Scanner;

public class MissingInNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        Scanner sc = new Scanner(System.in);
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int arraysum=0;
        for(int ele : arr){
            arraysum += ele;
        }
        System.out.println(sum - arraysum);
    }
}
//class Solution {
//    int missingNum(int arr[]) {
//        long n = arr.length + 1;              // total numbers including missing one
//        long expectedSum = n * (n + 1) / 2;   // sum of 1..n
//        long arraysum = 0;
//        for (int ele : arr) {
//            arraysum += ele;
//        }
//        return (int)(expectedSum - arraysum);
//    }
//}

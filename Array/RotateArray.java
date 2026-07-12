package Array;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={2,3,4,6,7,8,0} ;
        int n = arr.length;
        int d = sc.nextInt();
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println(arr); // array’s memory address, not the contents.
        // so we use Arrays.toString(arr) address to readable string
        System.out.println(Arrays.toString(arr));  // System.out.println(Arrays.toString(arr)); to display the rotated array.
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
    }
}

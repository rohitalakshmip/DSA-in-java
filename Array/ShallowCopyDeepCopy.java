package Array;
import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int a = 4;// it will take 4 bytes
        int[] arr = {10,20,30,40}; // 16 bytes
        int[] x = arr; // x is shallow copy of arr
        x[0] = 100;
        System.out.println(arr[0]);// it will change 10 to 100

        //   Deep copy
        int[] brr = {50,60,70,80};
        int[] deep = Arrays.copyOf(brr,brr.length);
        deep[0]=100;
        System.out.println(brr[0]);// this won't change 50 to 100
    }
}

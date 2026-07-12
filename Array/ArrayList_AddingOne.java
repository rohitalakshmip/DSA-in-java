package Array;

import java.util.Vector;
import java.util.Collections;

public class ArrayList_AddingOne {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Test Case: [0, 3, 9] (which means 39 + 1 = 40)
        int[] arr = {9,9,9};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        // Calling the method
        Vector<Integer> result = sol.addOne(arr);
        System.out.println("Result after adding one: " + result);
    }
}

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]+carry <= 9){
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else{ // arr[i]+carry = 10
                ans.add(0);
                carry = 1;
            }
        }
        if(carry==1) ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}
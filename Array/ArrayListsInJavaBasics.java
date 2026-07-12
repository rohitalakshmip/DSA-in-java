package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsInJavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // capasity is 10 ,Size is 0
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);
        // output
        // doesn't work [System.out.println(arr[0]);]
        System.out.println(arr.get(2)); // arr[2]

        // to change element's value in index
        /* doesn't work
           arr[3] = 50; or
           arr.get(3) = 50 */
        arr.set(3,50);   // arr[3] = 50

        // output
        System.out.println(arr); // not treversing // or

        int n = arr.size();
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();// or

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();


        // 25 21 18 50 10
        arr.add(1,100);
        // now 25 100 21 18 50 10
        System.out.println(arr);


        //Remove
        //arr.remove(n-1);
        /* if u directly print the array
        size will be the first array size*/
        arr.remove(arr.size()-1);//this takes the altered array
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);

        // reverse
        Collections.reverse(arr); // import java.util.Collections;
        System.out.println(arr);
        //code
        int i =0,j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));     // in i index put arr[i]
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.print(arr);

        ArrayList<Character> arr2 = new ArrayList<>();//<____> u can put diff data type

    }
}

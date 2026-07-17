package Array;

import java.util.Scanner;
import java.util.Arrays;
public class segrigate0And1_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter o's and 1's");
         // input of array
        int[] arr = new int[7];

        for (int i = 0; i <= 6 ; i++) {
            arr[i] = sc.nextInt();
        }
        // output of same array
        for (int i = 0; i < 7 ; i++) {
            System.out.print(arr[i]+" ");
        }
        // two pass solution two time traverse
        int numof0 = 0;
        for(int ele : arr){
            if(ele==0)numof0++;
        }
        for(int i = 0;i<numof0;i++){
            arr[i]=0;
        }
        for(int i = numof0;i<arr.length;i++ ){
            arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));


        //or two pointer techinique
        int n = arr.length;
        int i = 0, j=n-1;
        while(i<j){
            if(arr[i]==0)i++;
            if(arr[j]==i)j--;
            if(i>j) break;
            if(arr[i]==1&&arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        } System.out.println(Arrays.toString(arr));

    }
}

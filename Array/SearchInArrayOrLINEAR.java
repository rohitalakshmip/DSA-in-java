package Array;

import java.util.Scanner;

public class SearchInArrayOrLINEAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 4, -5, 6, 78, 83};
        int x = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {  // i is index
            if (arr[i] == x) {
                flag = true;
                System.out.println("Found in Array at index "+i);
                break;      // break is used to give the first appearance but if u remove brake every appearance
            }
        }
        if ( flag == false) System.out.println("Not found");

        // or 2nd method using int found = -1

        int found = -1;  // any no. except -1 means target array me hai
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                found = i;  // i is index
                break;
            }
        }
        if (found != -1) System.out.println("Found in Array at index "+found);
        else System.out.println("Not found");
    }
}

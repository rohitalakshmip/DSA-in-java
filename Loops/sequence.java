package Loops;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
            System.out.println(n-i+1); // ✅ compute on the fly, never modify n
            //n=n-i; n=5 i=1  1,5 5-1 = 4   2<= 4 ✅  n=4 i=2 2,4   4-2 = 2   3 <= 2 ❌ STOPS
            // if we use n=n-i+1 i=2 2,4   (4-2)+1 = 3   3 <= 3✅

        }
    }
}


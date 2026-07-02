package Loops;

import java.util.Scanner;

public class FL1APtoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n to display AP upto n : ");
        int n = sc.nextInt();
        //2,5,8,11,.... an=a+(n-1)d
//        for (int i = 2; i <= 3 * n - 1; i += 3) {
//            System.out.println(i);
//        }
//                    or
        int a = 2 , d = 3;
        for (int i = 1; i <= n ; i++) {
            System.out.println(a);
            a+=d;
        }
        // Homework
        //99,95,91,87,,... upto all terms are +ve
        int A = 99 , D = -4 ;
//        for (int i = A; i > 0; i+=D) {
//            System.out.println(A);
//            A+=D;
//        }
//                       or
        for (int i = 99; A > 0; i--) {  // or for (int i = 0; A > 0; i++) {
            System.out.println(A);
            A += D;
        }
    }
}
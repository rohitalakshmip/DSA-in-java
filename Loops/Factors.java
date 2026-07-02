package Loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
    int n = sc.nextInt();
        for (int i = 1; i <= Math.sqrt(n); i++) {//as the sq root of the num is the mid and the num of numbers are equal before and after the sqrt
             if(n%i==0){
                 System.out.print(i+" ");
                 System.out.println(n/i+" ");
             }
        }

    }
}

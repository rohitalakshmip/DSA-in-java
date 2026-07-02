package Loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean flag = true;//true means prime    // or  int x = 0;  // 0 means prime
        for (int i = 2; i <= n - 1; i++) {//or (int i = 2; i <= Math.sqrt(n); i++) as the sq root of the num is the mid and the num of numbers are equal before and after the sqrt
            System.out.println(i);
            System.out.println(n/i);
            if (n % i == 0) {// 'i' to 'n' a factor is there
                flag = false; //false means composite      // or   x = 1 ;     //1 means composite
                break;
            }
        }
        if(n==1) System.out.println("Not Composite number or Prime number ");
        else if(flag==false)System.out.println(n + " is Composite number");
        else  System.out.println(n+ " is Prime number");
    }
}
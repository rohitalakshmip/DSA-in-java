package Loops;

import java.util.Scanner;

public class AraiseB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the power");
        int b = sc.nextInt();
        int p = 1;
        for (int i = 1; i <= b; i++) {
            p *= a;
        }
        System.out.println(a+" raised to the power "+b+" is "+p);
    }
}

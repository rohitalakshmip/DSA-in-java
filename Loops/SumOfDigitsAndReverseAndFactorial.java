package Loops;

import java.util.Scanner;

public class SumOfDigitsAndReverseAndFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println((sum > 0) ? sum : -sum);

        // REVERSER
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int r = 0;
        while (x != 0) {
            r*=10;
            r+=(x%10);
            x/=10;
        }
        System.out.println(r);

        //Factorial 0f  5=5*4*3*2*1
        System.out.println("Enter the number");
        int y = sc.nextInt();
        int f=1;
        while (y>0) {       //or for(int i =1;i<=y:i++){
            f*=y;           //       f*=i; }
            y--;
           // System.out.println(f);
        }
        System.out.println(f);
    }
}

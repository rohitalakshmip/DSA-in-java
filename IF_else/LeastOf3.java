package IF_else;

import java.util.Scanner;

public class LeastOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers : ");
        System.out.print("A = ");
        int A = sc.nextInt();
        System.out.print("B = ");
        int B = sc.nextInt();
        System.out.print("C = ");
        int C = sc.nextInt();
        // using nested if
        if (A <= B){
            if(A <= C) System.out.println("A is least number");
            else System.out.println("C is least number");
        } else{
            if (B <= C) System.out.println("B is least number");
            else System.out.println("C is least number");
        }
    }
}

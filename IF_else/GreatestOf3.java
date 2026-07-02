package IF_else;

import java.util.Scanner;

public class GreatestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers : ");
        System.out.print("A = ");
        int A = sc.nextInt();
        System.out.print("B = ");
        int B = sc.nextInt();
        System.out.print("C = ");
        int C = sc.nextInt();
//        if(A == B && B == C) System.out.println("All are same");// or u can use
//        else if(A>=B && B>=C) System.out.println("A is greater");// if(A>B && A>C)
//        else if (B>=C && C>=A) System.out.println("B is greatest");// else if(B>C && B>A)
//        else if (C>=B && B>=A) System.out.println("C is greatest");// else if(C>B && C>A)
//        else  System.out.println("No greater number");
//        Or
//        if(A>=B && A>=C) System.out.println("A is greater");
//        else if (B>=C && B>=A) System.out.println("B is greatest");
//        else System.out.println(C);
//        Or
        if (A > B){
                if(A > C) System.out.println("A is greater");
                else System.out.println("C is greater");
        } else{
            if (B > C) System.out.println("B is greatest");
            else System.out.println("C is greater");
        }

    }
}

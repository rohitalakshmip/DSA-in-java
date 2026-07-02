package IF_else;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Co-ordination X and Y");
        System.out.println("X Co-ordination : ");
        int X = sc.nextInt();
        System.out.println("Y Co-ordination : ");
        int Y = sc.nextInt();
        if(X==0 && Y==0) System.out.println(" lies in origin");
        else if(X>0 && Y>0) System.out.println(" Lies in 1st Quadrant");
        else if(X<0 && Y>0) System.out.println("Lies in 2nd Quadrant");
        else if(X<0 && Y<0) System.out.println("Lies in 3rd Quadrent");
        else if(X>0 && Y<0) System.out.println("Lies in 4th Quadrent");
    }
}

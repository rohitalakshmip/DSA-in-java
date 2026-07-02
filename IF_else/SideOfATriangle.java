package IF_else;

import java.util.Scanner;

public class SideOfATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third number : ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b) System.out.println("Valid sides of triangle");
        else System.out.println("invalid sides ");
    }
}

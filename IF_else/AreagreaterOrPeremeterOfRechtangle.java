package IF_else;

import java.util.Scanner;

public class AreagreaterOrPeremeterOfRechtangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a Rechtangle");
        int L = sc.nextInt();
        System.out.print("Enter the breadth of a Rechtangle");
        int b = sc.nextInt();
        int area = L*b;
        System.out.println("Area = "+area);
        int Perimeter = 2*(L+b);
        System.out.println("Perimeter = "+Perimeter);
        if(area>Perimeter) System.out.println("Area is greater than Perimeter");
        else System.out.println("Perimeter is greater than Area");
    }
}

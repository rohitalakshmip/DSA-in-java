package Basic;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        // are of circle=pi*r*r
       // double r = 9;
       // double a = 3.141592 * r * r ;
       // System.out.println(a);
        //HW WRITE YOUR HW HEAR


        Scanner sc =new Scanner(System.in);  //taking input from user
        System.out.println("Enter Radius");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r ;
        System.out.print("Area is:");
        System.out.println(a);





    }
}

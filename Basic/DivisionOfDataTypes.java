package Basic;

import java.util.Scanner;

public class DivisionOfDataTypes {
    public static void main(String[] args) {
//        double x = 5.0/2;                   //   5/2=2.0
//        System.out.println(x);              //   5.0/2.0=2.5
                                              //   5.0/2  =2.5
                                              //   5/2.0  =2.5

        Scanner sc = new Scanner(System.in);
        // simple intrest

        int p=69,r=5,t=8;
        double si=p*r*t/100.0; //27.6
        System.out.println(si);
    }
}
package Loops;
// print all odd b/w 1 to 100 num divisible by 3
public class OddDivisibleBy3 {
    public static void main(String[] args) {
        for (int i = 3; i <=100 ; i++) {
            if(i%2!=0 && i%3==0) System.out.println(i);
        }
    }
}

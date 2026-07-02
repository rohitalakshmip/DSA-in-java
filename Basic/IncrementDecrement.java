package Basic;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a+=1;
        System.out.println(a);
        a*=4;
        System.out.println(a);
        a++;                     //post increment
        System.out.println(a++);//45
        System.out.println(a);  //46
        a--;                     //post decrement
        System.out.println(a--);//45
        System.out.println(a);  //44

        int b=10;
        System.out.println(++b);
        System.out.println(b);

        int c=34;
        System.out.println(--c);
        System.out.println(c);

        int x= 10;
        int y=x++;
        System.out.println(x+" "+y);

    }

}

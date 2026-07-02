package Methods;

public class Syntax {
    public static void another(){
        System.out.println("Function");
    }
    public static void main(String[] args) {
        another1();
        System.out.println("1st");
        another();
        System.out.println("2nd");
        another1();
    }
    public static void another1(){
        System.out.println("Function1");
    }
}

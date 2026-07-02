package Loops;

public class FLASCII {
    public static void main(String[] args) {
        System.out.println("Uppercase");
        for(char c ='A';c<='Z';c++){
            System.out.println(c+" "+(int)c);
        }
        System.out.println("Lowercase");
        for(char c ='a';c<='z';c++){
            System.out.println(c+" "+(int)c);
        }
    }
}

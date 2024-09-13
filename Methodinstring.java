import java.util.Scanner;
public class Methodinstring {
    public static void main(String[] args) {
        String a = Greet("Bhanu");
        System.out.println(a);
    }
    static String Greet(String name){
        String message = "Hello " + name;
        return message;
    }
    
}

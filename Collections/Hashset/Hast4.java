import java.util.*;
public class Hast4 {
    public static void main(String[] args) {
        HashSet s1 = new HashSet<>();
        HashSet s2 = new HashSet<>();
          
        s1.add(4693);
        s1.add("food");
        s1.add(74.012);

        s2.add(4692);
        s2.add(673.0568);
        s2.add("hello");
       
        s1.remove("food");
        s2.remove("hello");

        System.out.println(s1);
        System.out.println(s2);
    }
}

import java.util.*;

public class Linset {
    public static void main(String[] args) {
        LinkedHashSet s1 = new LinkedHashSet<>();
        LinkedHashSet s2 = new LinkedHashSet<>();
          
        s1.add(4693);
        s1.add("food");
        s1.add(74.012);
        

        s2.add(4692);
        s2.add(673.0568);
        s2.add("hello");
       
    

        System.out.println(s1);
        System.out.println(s2);

    }
}

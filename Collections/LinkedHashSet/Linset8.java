import java.util.*;

public class Linset8 {
    public static void main(String[] args) {
        LinkedHashSet s1 = new LinkedHashSet<>();

        
        s1.add(4693);
        s1.add("food");
        s1.add(74.012);
        s1.add(4692);

        Iterator i = s1.iterator();

        while(i.hasNext()){
        System.out.println(i.next());
        i.remove();
        }
        System.out.println(s1);
    }
}

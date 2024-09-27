import java.util.*;
public class HasM{
    public static void main(String[] args) {
        Map<String, Integer> m = new LinkedHashMap<>();
        Map<String, Integer> m1 = new LinkedHashMap<>();
        m.put("Appu",26);
        m.put("Kundhu",9);
        
        m1.put("Bhanu",24);
        m1.put("Appu",26);
        m1.put("lucky",7);
         
        
        // m1.putAll(m);
        // System.out.println(m1);


        // m1.remove(m);
        // System.out.println(m1);


        //generic:
        // for(Map.Entry m2: m1.entrySet()){
        //     System.out.println(m2.getKey()+ " " + m2.getValue());
        // }
 
        //non generic:
       
        Set s = m.entrySet();
        Set s1 = m1.entrySet();
        Iterator i = s.iterator();
        while(i.hasNext()){
            Map.Entry m2 = (Map.Entry) i.next();
            System.out.println(m2.getKey() + " " + m2.getValue());
        }
        Iterator i1 = s1.iterator();
        while(i1.hasNext()){
            Map.Entry m3 = (Map.Entry) i1.next();
            System.out.println(m3.getKey()+ " "+ m3.getValue());
        }

        System.out.println(m.size());
        System.out.println(m.values());
        System.out.println();
        m.clear();
        System.out.println(m+ " " +m);
        System.out.println(m.size());
    }
}
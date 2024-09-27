
//trim():

public class Stringm {
    public static void main(String[] args) {
        trim():
        String s = "      Hello Bhanu";
        System.out.println(s);
        System.out.println(s.trim());


        replace():
        String v = "abjgiucbv niahfw abc sjiv";
        System.out.println(v.replace("a","h"));



        replaceFirst():
        String q = "This is not gud..";
        String a1 = "is";
        System.out.println(q.replaceFirst(a1,"at"));


        //substring():
         String n = "Hello Bhanu...";
         System.out.println(n.substring(4,11));


        toCharArray():
        String st = "GHUHD";
        char [] Array = st.toCharArray();
        System.out.println(Array[2]);


        toUppercase,toLowercase:
        String k = "nbcifnwiujfhw";
        System.out.println(k.toLowerCase());
        System.out.println(k.toUpperCase());


        valueof():
        char [] Array = {'a', 'h', 'h','i', 'o'};
        System.out.println(String.valueOf(Array));
    }
    
}

public class Alternatestring {
    public static void main(String[] args) {
        String s = "abcdef";
        for (int i=0; i<s.length();i++){
            if(i%2 == 0)
            System.out.println(s.charAt(i));
        }
    }
}

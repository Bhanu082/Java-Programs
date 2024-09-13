public class Ques1 {
    public static void main(String[] args) {
        String s = "Bhavani";
        String n = "";
        char ch;

        System.out.print("Original word : ");
        System.out.println(s);

        for (int i =0; i<s.length(); i++){
            ch = s.charAt(i);
            n = ch+n;
        }
        System.out.println("reverse word : " + n);
    }
}

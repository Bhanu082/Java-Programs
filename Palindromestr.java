public class Palindromestr {
    public static void main(String[] args) {
        String s = "abaaba";
        String temp = "";
        for(int i=s.length()-1; i>=0; i--){
             temp = temp + s.charAt(i);
        }
        if (s.equals(temp))
        System.out.println("Palindrome name: " + temp);
        else
        System.out.println("Not a palindrome name.");
    }
}

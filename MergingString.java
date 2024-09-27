public class MergingString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "";
        String temp = "";
        for (int i=0; i<=s1.length()-1; i++){
              temp= s1.charAt(i)+""+s2.charAt(i);
              s3=s3+temp;         
        }
        System.out.println(s3);
    }
}

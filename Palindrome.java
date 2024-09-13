public class Palindrome {
    public static void main(String[] args) {
        int num = 535;
        int j = num;
        int rem = 0;
        String temp = ""; 
        String pal = Integer.toString(j);

        while (num>0){
            rem = num % 10;
            temp = temp + Integer.toString(rem);
            num = num/10;
        }
        if (pal.equals(temp)){
           System.out.println("Palindrome number :" + temp);
        }
        else{
        System.out.println("Not a palindrome.");
        }
    }
}

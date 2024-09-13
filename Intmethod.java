import java.util.Scanner;
public class Intmethod {
    public static void main(String[] args) {
        int ans = sum1();
        System.out.println(ans);
    }
    static int sum1(){
        Scanner in = new Scanner (System.in);
        int num1=in.nextInt();
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
    }
}

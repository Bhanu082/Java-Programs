import java.util.Scanner;
public class Multiplymethod {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("please enter a value : ");
        int a = in.nextInt();
        System.out.println("please enter b value : ");
        int b= in.nextInt();
        System.out.println("please enter c value: ");
        int c = in.nextInt();
        int ans = mul(a,b,c);
        int ans1 = add (a,b,c);
        System.out.println(ans);
        System.out.println(ans1);

    }
    static int mul(int a,int b , int c){
        
        int mul1 = a * b * c;
        return mul1;

    }
    static int add (int a, int b, int c){
        int add = a +b +c;
        return add;
    }

}

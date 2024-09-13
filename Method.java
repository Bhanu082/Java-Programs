import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        int ans = sum2(20 ,30);
        System.out.println(ans);
    }
    static int sum2(int a, int b){ //the sum2 stores the values in above sum2.
        int sum = a + b;
        return sum;  // the sum value is stored into the sum2 value.
    }
}

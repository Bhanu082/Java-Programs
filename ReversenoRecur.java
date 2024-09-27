public class ReversenoRecur {
    public static void main(String[] args) {
        Rev1(5612);
        System.out.println(sum);
    }

    static int sum =0;
    static void Rev1(int n){
        if(n == 0){
            return;
        }
        int rem = n %10;
        sum = sum * 10 + rem;
        Rev1(n/10);
    }
}

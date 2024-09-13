public class Addfrstlast {
    public static void main(String[] args) {
        int num = 455984316;
        int sum = 0;
        int i = 1;
        int rem= 0;
        while (num>0){
            rem = num % 10;
            if (i == 1){
                sum = sum +rem;
                i++;
            }
            num = num / 10;
        }
        sum = sum +rem;
        System.out.println(sum);
    }
}

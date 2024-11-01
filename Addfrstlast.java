public class Addfrstlast {
    public static void main(String[] args) {
        int num = 355984316;
        // int sum = 0;
        // int i = 1;
        // int rem= 0;
        // while (num>0){
        //     rem = num % 10;
        //     if (i == 1){
        //         sum = sum +rem;
        //         i++;
        //     }
        //     num = num / 10;
        // }
        // sum = sum +rem;
        // System.out.println(sum);
        int lastDigit = num % 10;
        int firstDigit = 0;
        while(num>0){
            firstDigit = num % 10;
            num /= 10;
        }
        int sum = firstDigit+lastDigit;
        System.out.println(sum);
    }
}

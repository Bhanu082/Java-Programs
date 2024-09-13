public class countnums {
    public static void main(String[] args) {
        int n= 134363;
        int count = 0;
        while(n>0){
           int rem = n%10; //it gives last digit of a number
            if (rem == 3){
                count++;
            }
            n=n/10;  // n /= 10 (it is the another form)
        }
        System.out.println(count);
    }
}

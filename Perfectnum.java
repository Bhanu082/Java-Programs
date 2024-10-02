import java.util.Scanner;
public class Perfectnum {
    public static void main(String[] args) {
        
        int n=2;
        int sum;
        int count = 0;
        while(count<=10){
                sum = 0;
            for(int i=1; i<n; i++){
                if (n % i == 0)
                    sum = sum + i;
                }
                if (sum == n){
                    System.out.println(sum);
                    count++;
                }
                n++; 
        }
    }
}
    
    

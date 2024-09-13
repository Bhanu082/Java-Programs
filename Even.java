import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        
        for ( int i= 1; i<=n; i++){
            if(i%2 == 0){           // for even == 0, for odd != 0.
                System.out.println(i + " ");
            }
        }
    }
    
}

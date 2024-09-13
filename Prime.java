import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=2; i<=n; i++){
            int count = 0;
        for (int j=1; j<=i; j++){
            if (i%j == 0){
                count++;
            }
        }
                if (count == 2)
                System.out.println(i + " ");
            }
        }
    }

        
    


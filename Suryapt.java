public class Suryapt {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for (int j=1; j<=4; j++){
                System.out.print("*");
            }
            for (int k=i; k==i; k++){
                System.out.print("|");
            }
            for (int j=1; j<=4; j++){
                System.out.print(" ");
            }
            for (int k=i; k==i; k++){
                System.out.print("|");
            }
            for (int j=1; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

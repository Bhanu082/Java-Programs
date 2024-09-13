public class Diamond {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            if(i != 1){
            for (int b=1; b<i; b++){
                System.out.print("*");
            }
        }
            System.out.println();
    }
    for (int i=2; i<=5; i++){
        for (int j=2; j<=i; j++){
            System.out.print(" ");
        }
        for (int k=5; k>=i; k--){
            System.out.print("*");
        }
        for (int b=5; b>i; b--){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

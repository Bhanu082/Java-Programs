public class Patt {
    public static void main(String[] args) {
        int k=1;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                if(i%2 != 0){
                    System.out.print(k+" ");
                }
                else{System.out.print("* ");}
                k++;
            }
            System.out.println();
        }
    }
}

public class Alternateprime {
    public static void main(String[] args) {
        int flag = 2;
        for (int i=0; i<=150; i++){
            int count =0;
            
            for (int j=1; j<=i; j++){
                if (i%j == 0){
               count++;
                }
            }
            if (count == 2){
                if (flag % 2 == 0){
                    System.out.println(i);
                }
                flag++;
            }
        }
    }
}

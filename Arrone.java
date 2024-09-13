public class Arrone {
    public static void main(String[] args) {
        // int a[] = new int[5];
        // a[0] = 35;
        // a[1] = 41;
        // a[2] = 48;
        // a[3] = 52;
        // a[4] = 87;
        
        // for (int i=0; i<a.length; i++){
        //     System.out.println(a[i]);
        // }



        // int a[] = {23,56,78,64,93};

        //   for (int i=0; i<a.length; i++){
        //      System.out.println(a[i]);
        //  }


        //foreachloop:
        // int a[] = {12,36,25,45,15,26,52,33};

        // for (int i:a){
        //     System.out.println(i);
        // }



//sum of array elements:
        int a[] ={12,42,56,326,4578,41,74,63};
        int sum = 0;
        for (int i=a.length-1; i>=0; i--){
            sum = a[i] + sum;
        }
        System.out.println(sum);
        }
    }




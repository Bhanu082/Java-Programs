public class Recursion {
    public static void main(String[] args) {
    //     print(1);
    // }

    // static void print(int n){
    //  if (n == 5){                // we can write n == 6 you need to remove sout.
    //     System.out.println(5);
    //     return;
    //  }

    //     System.out.println(n);
    //     print(n+1);        //it is the last call function so this is tail recursion.
    // }
    
    System.out.println(fibo(6));
}

static int fibo(int n){
    //base condition:
    if (n<2){
    return n;
   }
    return fibo(n-1) + fibo (n-2);  //this is not a last call function(not ending function).
}
}
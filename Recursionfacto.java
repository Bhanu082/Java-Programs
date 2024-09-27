public class Recursionfacto {
    public static void main(String[] args) {
       int ans = fact(5);
       System.out.println(ans); 
    }

    static int fact(int n){
        if (n == 1){         // or we can write if(n<=1);
            return 1;
        }
        return n * fact(n-1);
    }
}
    

 // sum of n numbers:

//     int ans = sum(5);
//        System.out.println(ans); 
//     }

//     static int sum(int n){
//         if (n == 1){         // or we can write if(n<=1);
//             return 1;
//         }
//         return n + sum(n-1);
//     }
// }

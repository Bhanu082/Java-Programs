import java.util.Scanner;
class Conditional{

    public static void main(String args[]){
         Scanner s = new Scanner(System.in);
         System.out.println("please enter 1st person marks : ");
         int a,b,c,d;
         System.out.println(" Sub A Marks :");

         a = s.nextInt();
         System.out.println(" Sub B Marks :");
         b = s.nextInt();
         System.out.println("Please enter 2nd person marks: ");
         System.out.println(" Sub C Marks : ");
         c = s.nextInt();
         System.out.println(" Sub D Marks :");
         d = s.nextInt();
        int sum1 = (a+b);
        int sum2 = (c+d);
        if(sum1>sum2)
        System.out.println("Person1 got 1st rank ");
        
        else
        System.out.println("Person2 got 1st rank ");
    }
}
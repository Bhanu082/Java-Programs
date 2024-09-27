
abstract class Abss {
   void add(int c , int d){}
     void sub(int a,int b){
      System.out.println(a-b);
    }}
 public class Abs extends Abss{
      public void  add(int c,int d){
        System.out.println(c+d);
    }
    public static void main (String args[]){
        Abs obj = new Abs();
        obj.add(2,6);
        obj.sub(3,2);
    }
 }



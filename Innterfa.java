interface interfa {
 void add(int a, int b);
 void sub(int c, int d);
    
}
public class Innterfa implements interfa{
   public void add(int a, int b){
    System.out.println(a+b);
   }
   public void sub (int c, int d){
    System.out.println(c-d);
   }
public static void main(String[] args) {
    Innterfa obj = new Innterfa();
    obj.add(9, 2);
    obj.sub(7, 5);
}
}
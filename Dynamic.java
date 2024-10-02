 class St{
        void add(int a, int b){
           System.out.println(a+b);
       }
   }
   class A extends St{
       @Override
       void add(int a, int b){
           System.out.println(a-b);
       }
   }
   
   public class Dynamic {
       public static void main(String[] args) {
           St obj = new A();
           obj.add(54,23);
           
       }
       
   }


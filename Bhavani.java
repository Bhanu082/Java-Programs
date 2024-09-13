public class Bhavani extends Throwable
{
   Bhavani(String s)
{
   super(s);
}
   public static void main(String[] args){
        int a = 23;
        int b = 45;
        try{
        if (a<b)
        {
         throw new Bhavani("There is an exception.");
        }
    }
        catch(Bhavani e){
            System.out.println(e.getMessage());
        }
    }
}

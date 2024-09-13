public class ThrowsException {
    public static void main(String[] args) throws ArithmeticException

    {
        int a=10;
        int b=3;
        int res=0;
        res=a+b;
        try{
       if(res<18){
        throw new ArithmeticException("you are not eligible");
       }
    }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
}

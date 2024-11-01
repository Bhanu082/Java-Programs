public class Exception {
    public static void main(String[] args) {

       // ArithmeticException:

        int a = 10;
        int b=0;
        System.out.println(" you are ok with the flow no need to worry about it.");
        try{
        int c = a/b;
        } 
        catch(ArithmeticException e) //(e.getMessage();
        {
            e.printStackTrace();
        }
        System.out.println(" hi ");



       // StringOutOfBound exception:

        String s = "BHavani";
        String a1 = new String ("Pydipala");
        System.out.println(" you are ok with the flow no need to worry about it.");
        
            System.out.println(s.charAt(7));



       // Null pointer Exception:
        String s1 = null;
        String a2 = new String ("Pydipala");
        System.out.println(" you are ok with the flow no need to worry about it.");
        System.out.println(a2.charAt(3));
            System.out.println(s.length());
            
        }
        
    }


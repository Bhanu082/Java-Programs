public class Bhavaniexcep extends Throwable{
    Bhavaniexcep (String a){
        super(a);
    }

    public static void main(String[] args) {
        int a = 56;
        int b = 45;
        int c = a + b;
        try{
            if (a>b){
                throw new Bhavaniexcep("there is an exception occured.");
            }
        }catch(Bhavaniexcep e){
          e.printStackTrace();
        }
        System.out.println(c);
      }
    }

    


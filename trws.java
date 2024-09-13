public class trws extends Throwable{
    trws(String s){
        super(s);
    }
    public static void main(String[] args) {
        try{
            if(2<4){
                throw new trws("an exception occured");
            }

        }
        catch(trws e){
            System.out.println(e.getMessage());
        }
    }
}

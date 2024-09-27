
interface Inrfc {
 void bhavani();
 void sravan();
   
}

public class Inner implements Inrfc {
 public void bhavani(){
    System.out.println("hello sravan");
 }
 public void sravan(){
    System.out.println("hello amma");
 }
 public static void main(String[] args) {
    Inner obj= new Inner();
    obj.bhavani();
    obj.sravan();
 }
    
}

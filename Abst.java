abstract class Abst {
    void bhavani(){}
    void sravan(){
        System.out.println("hello amma");
    }

}
class a extends Abst{
    void bhavani(){
        System.out.println("hello sravan");
    }
public static void main(String[] args) {
        a obj = new a();
        obj.bhavani();
        obj.sravan();
    }
}

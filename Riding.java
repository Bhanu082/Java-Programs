class St{
    static void add(int a, int b){
        System.out.println(a+b);
    }
}
class A extends St{
    static void sub(int a, int b){
        System.out.println(a-b);
    }
}

public class Riding {
    public static void main(String[] args) {
        A obj = new A();
        obj.add(54,23);
        obj.sub(74,16);
    }
    
}

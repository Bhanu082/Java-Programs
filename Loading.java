class Samp{
    void disp(){
        System.out.println("Hello Deer");
    }
    void disp(int a, int b){
     System.out.println(a+b);
    }
    void disp(int c, int d, int e){
        System.out.println(c-d+e);
    }
}
public class Loading {
    public static void main(String[] args) {
        Samp obj = new Samp();
        obj.disp();
        obj.disp(66,23);
        obj.disp(12,3,5);
    }
    
}

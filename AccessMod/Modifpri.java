// class A{
//     private int data = 25;
//     private int data1 = 41;
//     int sum = data+data1;
// }
public class Modifpri{
    private void privatemethod(){
        int a = 12;
        int b = 15;
        int sum = a+b;
        System.out.println(sum);
        System.out.println("private method");
    }
    public void publicmethod(){
        privatemethod();
    }
    public static void main(String[] args) {
        Modifpri obj = new Modifpri();
        obj.publicmethod();
    }
}


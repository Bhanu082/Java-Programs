//  class Inheritance{

//     void display(String a){
//         System.out.println(a);        
//     }
// }
// class demo2 extends Inheritance{
//     void sub(int a , int b){
//         System.out.println("sub of a and b is " + (a-b) );

//     }
// }
// public class Demo extends demo2
// {
//    void add(int a , int b){
//     System.out.println("sum of a and b is " +  (a+b));
//    }
//    public static void main(String[] args) {
//     Demo obj= new Demo();
//     obj.add(2,5);
//     obj.display("hello");
//     obj.sub(6,4);
//    }
// }



class Demo{
    void display(){
        System.out.println("Hi");
    }
}
class Demo2 extends Demo{
    void display2(){
        System.out.println("BSJHOFHWEF WE");
    }
}
public class Demo1 extends Demo2{
        void display1(){
            System.out.println("Hello");
        }
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.display();
        obj.display2();
        obj.display1();

    }
}


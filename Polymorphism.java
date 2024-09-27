//Method Overriding : occurs in different classes

class d1{
    int i=0;
    void disp(){
        System.out.println("im in d1");
    }
}
class d2 extends d1{
    void disp(){
        super.disp();
        System.out.println(super.i);
        System.out.println("im in d2");
    }
}

public class Polymorphism extends d2 {
    public static void main(String[] args) {
        Polymorphism obj= new Polymorphism();
        obj.disp();
    }
}


//overriding:
// class Sum{
//     int sub(int a, int b){
//         return a+b;
//     }
// }

// class Sub extends Sum{
//     int sub(int a, int b){
//        System.out.println(super.sub(a,b)); 
//         return a-b;
//     }

// }


// public class Poly extends Sub{
//     public static void main(String[] args) {
//         Poly obj = new Poly();
//         System.out.println(obj.sub(5, 2));
//     }
// }




//overloading:
// public class overloading{
//     void disp(int a, int b){
//       System.out.println(a+b);
//     }
//     int disp(int a, int b, int c){
//          return a*b*c;
//     }

//         public static void main(String[] args) {
//             overloading obj = new overloading();
//             obj.disp(1,2);
//             System.out.println(obj.disp(1, 2, 3));
//         }
//     }





// method over loading : occurs in same class

// class overloading{
//     void disp(){
//         System.out.println("hello im in first methods");
//     }

//     void disp(int a ){
//         System.out.println(a);
//     }
//     int disp(int a ,int b){
//         return a+b;

//     }
//     public static void main(String[] args) {
//         overloading obj= new overloading();
//         obj.disp();
//         obj.disp(2);
//         System.out.println(obj.disp(2,5));
//     }
// }
//  class Heir {
//     void disp(){
//         System.out.println("im in parent");
//     }
// }
// class child1 extends Heir{
//     void disp1(){
//         System.out.println("im in child 1");
//     }
// }

// class child2 extends Heir{
//     void disp2(){
//         System.out.println("im in child 2");
//     }
// }
// public class main{
//     public static void main(String[] args) {
//         child1 obj= new child1();
//         child2 obj2= new child2();
//         obj.disp1();
//         obj.disp();
//         obj2.disp2();
//         obj2.disp();
//     }
// }




class Arch{
    void display(){
        System.out.println("Hi");
    }
}

class Arrow extends Arch{
    void display1(){
        System.out.println("Im ready to shoot.......");
    }
}
class Arrow2 extends Arrow{
    void disp(){
        System.out.println("Im new here....");
    }
}

class Arrow1 extends Arch{
    void display2(){
        System.out.println("Im not ready...");
    }
}

public class Hier{
    public static void main(String[] args) {
        Arrow2 obj = new Arrow2();
        Arrow1 obj1 = new Arrow1();

        obj.display();
        obj.display1();
        obj.disp();
        obj1.display();
        obj1.display2();
    }
}
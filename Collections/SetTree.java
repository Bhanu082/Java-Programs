import java.util.*;
public class SetTree1 {
    public static void main(String[] args) {
        TreeSet list1 = new TreeSet<>();
        TreeSet list2 = new TreeSet<>();


      
       //   add():

       list1.add(5.9);
       list1.add("Hello World");
       list1.add(93);
                                          //output:
       System.out.println(list1);   //[5.9, Hello World, 93]


    //        //Iterator:
    //    Iterator it = list1.iterator();
    //    while(it.hasNext()){
    //        System.out.println(it.next());
    //    }

//Iterator Output:
// 5.9
// Hello World
// 93

//           list2.add(5982);
//           list2.add("java");
//           list2.add(5.9516);
//           list2.add(5.9);

//        System.out.println(list1);      //output:
//        System.out.println(list2);   //[5.9, 4795, Hello World, 93]
//                                           //[5982, java, 5.9516, 5.9]
        

//          //addAll():
//          list1.addAll(list2);                      //output:
//        System.out.println(list1);          // [5.9, Hello World, 93, 5982, java, 5.9516, 5.9]

        
//           //size():
//        System.out.println(list1.size());    //3
       



//          //remove():
//          list1.remove("Hello World");         //output:
//        System.out.println(list1);          //[5.9, 93]


//          //removeAll():
//           list1.removeAll(list2);           //output:
//        System.out.println(list1);    //[Hello World, 93, 5982, 5.9516, java]


//           //retainAll():
//           list1.retainAll(list2);
//         System.out.println(list1);     //5.9
     
  
//        //clear():
      
//         list1.clear();
//        System.out.println(list1);      //[]
       
   }
}



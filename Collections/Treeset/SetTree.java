import java.util.*;
public class SetTree {
    public static void main(String[] args) {
        TreeSet list1 = new TreeSet<>();
        TreeSet list2 = new TreeSet<>();


      
       //   add():

       list1.add(23);
       list1.add(76);
       list1.add(93);
                                          //output:
       System.out.println(list1);   //[23, 76, 93]


           //Iterator:
       Iterator it = list1.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
           /*Iterator Output:
            23
            76
            93
            */
          list2.add(5982);
          list2.add(46);
          list2.add(58);
        

       System.out.println(list1);      //output:
       System.out.println(list2);   //[23, 76, 93]
                                    // [46, 58, 5982]
        

         //addAll():
         list1.addAll(list2);                      //output:
       System.out.println(list1);          
        
          //size():
       System.out.println(list1.size());    //3
       



         //remove():
         list1.remove(76);                   //output:
       System.out.println(list1);          //[23, 93]


         //removeAll():
          list1.removeAll(list2);           //output:
       System.out.println(list1);    

          //retainAll():
          list1.retainAll(list2);
        System.out.println(list1);     //
     
  
       //clear():
      
        list1.clear();
       System.out.println(list1);      //[]
       
   }
}



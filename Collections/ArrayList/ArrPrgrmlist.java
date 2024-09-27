import java.util.*;
public class ArrPrgrmlist {
    public static void main(String[] args) {
         ArrayList list1 = new ArrayList<>();
         ArrayList list2 = new ArrayList<>();


       
        //   add():

        list1.add(5.9);
        list1.add("Hello World");
        list1.add(93);
                                           //output:
        System.out.println(list1);   //[5.9, Hello World, 93]


            //Iterator:
        Iterator it = list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
                     
        

          //get():
        for(int i=0; i<list1.size();i++ ){
            System.out.println(list1.get(i));
         }

//Iterator Output:
// 5.9
// Hello World
// 93

       //ListIterator:

     ListIterator i = list1.listIterator();

     while(i.hasNext()){
        System.out.println(i.next());
    }
    System.out.println(" ");
    
    while(i.hasPrevious()){
        System.out.println(i.previous());
    }


             //add(index,obj):
           list2.add(5982);
           list2.add("java");
           list2.add(5.9516);
           list2.add(5.9);
           list1.add(1,4795);

        System.out.println(list1);      //output:
        System.out.println(list2);   //[5.9, 4795, Hello World, 93]
                                           //[5982, java, 5.9516, 5.9]
         

          //addAll():
          list1.addAll(list2);                      //output:
        System.out.println(list1);          // [5.9, 4795, Hello World, 93, 5982, java, 5.9516, 5.9]

         
           //size():
        System.out.println(list1.size());    //4
        



          //remove():
          list1.remove(1);                       //output:
        System.out.println(list1);          //[5.9, Hello World, 93, 5982]


          //removeAll():
           list1.removeAll(list2);           //output:
        System.out.println(list1);    //[4795, Hello World, 93]


           //retainAll():
           list1.retainAll(list2);
         System.out.println(list1);     //5.9
      
   
        //clear():
       
         list1.clear();
        System.out.println(list1);      //[]
        
       

    }
}

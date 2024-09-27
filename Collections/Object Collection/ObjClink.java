import java.util.*;
class Student{
    int id;
    String name;
    int age;

Student(int id, String name, int age){
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
public class ObjClink {
    public static void main(String[] args) {
   
    LinkedHashSet<Student> stu = new LinkedHashSet<>();
      Student s = new Student(1,"Bhanu",12);
      Student s1= new Student(2,"Bhavani",13);
        stu.add(s);
        stu.add(s1);
        Iterator i = stu.iterator();
        while(i.hasNext()){
        Student s2 = (Student)i.next();
        System.out.println(s2.id+ " " + s2.name+ " "+s2.age);
        }
        
    }

}
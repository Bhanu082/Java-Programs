import java.io.*;
class Employee implements Serializable{
    int id;
    String name;
    int age;

Employee (int id, String name, int age){
    this.id = id;
    this.name = name;
    this.age = age;
}
}
public class SeDelization {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee(1, "Appu", 26);
       // Employee emp1 = new Employee(2, "Bhanu", 24);
        FileOutputStream fos = new FileOutputStream("series.txt");
        ObjectOutputStream obs = new ObjectOutputStream(fos);
        obs.writeObject(emp);
       // obs.writeObject(emp1);
        FileInputStream fis = new FileInputStream("series.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee e= (Employee)ois.readObject();
        //Employee e1= (Employee)ois.readObject();
        System.out.println(e.id+ " "+ e.name+ " "+e.age);
        //System.out.println(e1.id+ " "+ e1.name+ " "+e1.age);
    }
    
}

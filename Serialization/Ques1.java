
//write a program to serialize and deserializable collection classs objects
import java.io.*;
import java.util.*;

// public class Ques1 {
//     public static void main(String[] args) throws IOException {
//         FileOutputStream fos = new FileOutputStream("obs.txt");
//         ObjectOutputStream os = new ObjectOutputStream(fos);
//         ArrayList al = new ArrayList<>();
//         al.add("BHanu");
//         al.add("Bhavani");
//         os.writeObject(al);
//     }
// }
        

public class Ques1{
    public static void main(String[] args)throws ClassNotFoundException{
        try{
            FileInputStream fis = new FileInputStream("obs.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList al = (ArrayList) ois.readObject();
            System.out.println(al.get(0));
        }catch (IOException e){
           e.printStackTrace();
        }

    }

}
    


import java.io.*;

public class Fileot{
    public static void main(String[] args) throws IOException {
    //     byte[] byteArray = {65, 66, 67, 68, 69};

    //     //fileOutputStream:
    //     try(FileOutputStream fos = new FileOutputStream("outputBytes.txt")){
    //         fos.write(byteArray);
    //         System.out.println("Miracle");

    //     }catch(IOException e){
    //       e.printStackTrace();
    //     }

    //     //FileInputStream:
    //     int i;
    //    try(FileInputStream fis = new FileInputStream("outputBytes.txt")){
    //         while( (i=fis.read()) != -1){
    //             System.out.print((char)i);
    //         }   
    //        } catch(IOException e){
    //             e.printStackTrace();
    //         }
    
    

      //FileOutputSTream:
      FileOutputStream fos = new FileOutputStream("outputBytes.txt");
      String s = "Hello";
      fos.write(s.getBytes());
     


      //FileInputStream:
      int i;
      FileInputStream fis = new FileInputStream("outputBytes.txt");
      while ((i=fis.read()) != -1){
        System.out.print((int)i);
      }
      System.out.println(" ");

    }

}
import java.io.*;

public class Buffered{
    public static void main(String[] args)throws IOException{
    //     byte[] byteArray = {65, 66, 67, 68, 69, 70, 71};

    //     //BUfferedOutputStream:
    //     try(FileOutputStream fos = new FileOutputStream("outputBytes.txt")){
    //         BufferedOutputStream bo = new BufferedOutputStream(fos);
    //         bo.write(byteArray);
    //         bo.flush();
            
    //         System.out.println("Miracle");

    //     }catch(IOException e){
    //       e.printStackTrace();
    //     }

    //     //BufferedInputStream:
    //     int i;
    //    try(FileInputStream fis = new FileInputStream("outputBytes.txt")){
    //     BufferedInputStream bi = new BufferedInputStream(fis);
    //         while( (i=bi.read()) != -1){
    //             System.out.print((char)i);
    //         }   
    //        } catch(IOException e){
    //             e.printStackTrace();
    //         }

    //BufferedoutputStream:
    FileOutputStream f = new FileOutputStream("out.txt");
    BufferedOutputStream bos = new BufferedOutputStream(f);        
       String s = "Hellooo bhanu";
    //    byte[] b = s.getBytes();
       bos.write(s.getBytes());
       bos.flush();

       

       //BUfferedInputStream:
       FileInputStream fis = new FileInputStream("out.txt");
       BufferedInputStream bis = new BufferedInputStream(fis);
       int i;
       while((i=bis.read()) != -1){
        System.out.print((char)i);
       }
       System.out.println(" ");

    }

}
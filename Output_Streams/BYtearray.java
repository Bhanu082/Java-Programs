import java.io.*;

public class BYtearray {
   
    public static void main(String[] args) throws IOException{
     FileOutputStream f1=new FileOutputStream("./a.txt");
     FileOutputStream f2=new FileOutputStream("./b.txt");
     ByteArrayOutputStream B=new ByteArrayOutputStream();
     String s="welcome to bhavani college";
     B.write(s.getBytes());
     B.writeTo(f1);
    B.writeTo(f2);
    f1.flush();
    BufferedReader br=new BufferedReader(new FileReader("./a.txt"));
    BufferedReader br1=new BufferedReader(new FileReader("./b.txt"));
    int i;
    while((i=br.read())!=-1)
    {
        System.out.println((char)i);
    }
    while ((i=br1.read())!=-1) {
        System.out.print((char)i);
    }
    System.out.println(" ");
    }
}

       
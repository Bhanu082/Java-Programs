import java.io.*;
import java.util.Properties;
public class Property {
    public static void main(String[] args) throws Exception {
        FileInputStream fr = new FileInputStream("Credentials.properties");
        Properties p = new Properties();
    p.load(fr);
    System.out.println(p);
    // System.out.println(p.getProperty("user"));
    // System.out.println(p.getProperty("password"));
    String property = p.getProperty("user");
    System.out.println(property); 

    p.setProperty("Language","Java");
    FileOutputStream fos = new FileOutputStream("Credentials.properties");
    p.store(fos,"Adding another property name into the existing file");
    

    }
    
}

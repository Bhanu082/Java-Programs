package LibraryManagement;
import java.util.*;
import java.sql.*;

public class AddBooks {
    public static void addBooks(){
    	
    	System.out.println("Select option 1 for Insert data:");
    	Scanner sc = new Scanner(System.in);
    	String name,Author,title;
    	int published_year;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","M1racle@123");
    		System.out.println("Please enter the Book name : ");
    		name = sc.nextLine();
    		System.out.println("Please enter the Book Author : ");
    		Author = sc.nextLine();
    		System.out.println("Please enter the Book Title : ");
    		title = sc.nextLine();
    		System.out.println("Please enter the Book Publishe Year : ");
    		published_year = sc.nextInt();
    		PreparedStatement ps = con.prepareStatement("INSERT INTO Library values(?,?,?,?)");
    		ps.setString(1, name);
    		ps.setString(2, Author);
    		ps.setString(3,title);
    		ps.setInt(4, published_year);
    		int i = ps.executeUpdate();
    		if(i>0) {
    			System.out.println("Book details inserted successfully..");}
    		else {System.out.println("Please insert properly.");
    		}
    	}catch(Exception e) {
    		e.printStackTrace();}
    	}
    	}


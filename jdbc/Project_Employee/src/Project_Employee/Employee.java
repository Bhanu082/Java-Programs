package Project_Employee;
import java.sql.*;
import java.util.*;
public class Employee {
   public static void employees(){
	System.out.println("Welcome to the Employee LOgin Page..");
	Scanner sc = new Scanner(System.in);
	String username,password;
	System.out.println("Please enter User Name to get the details : ");
	String name = sc.nextLine();
	String Query = "SELECT * FROM EMPLOYEES WHERE username = ?";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PROJECT","root","M1racle@123");
		System.out.println("Please enter the User name : ");
		username = sc.nextLine();
		System.out.println("Please enter the Password : ");
		password = sc.nextLine();
		PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLOYEES Values(?,?)");
        ps.setString(1, username);
        ps.setString(2, password);
        int i = ps.executeUpdate();
        
        
        if (i>0) {
            System.out.println("Login successfully.");
            
        }else {
       	 System.out.println("Logain failed, Please try agin later..");
        }
        PreparedStatement ps1 = con.prepareStatement(Query);
        ps1.setString(1, name);
		
		ResultSet rs1 = ps1.executeQuery();
		rs1.next();
		System.out.println(rs1.getInt(1)+ " " + rs1.getString(2)+ " " + rs1.getString(3)+ " "+rs1.getInt(4));
        
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}

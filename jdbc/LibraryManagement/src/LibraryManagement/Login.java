package LibraryManagement;
import java.sql.*;
import java.util.*;

public class Login {

	public static void login(){
		System.out.println("Welcome to Library Management ");
		Scanner sc = new Scanner(System.in);
		String username,password;
		try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","M1racle@123");
    		System.out.println("Please enter the User name : ");
    		username = sc.nextLine();
    		System.out.println("Please enter the Password : ");
    		password = sc.nextLine();
    		 PreparedStatement ps = con.prepareStatement("INSERT INTO Library_user Values(?,?)");
             ps.setString(1, username);
             ps.setString(2, password);
             ResultSet rs = ps.executeQuery();
             
             if (rs.next()) {
                 System.out.println("Login successfully.");
                 
             }else {
            	 System.out.println("Logain failed, Please try agin later..");
             }
//             ResultSet rs = ps.executeQuery();
//             
//             if (rs.next()) {
//                 System.out.println("Login successfully.");
//                 
//                 System.out.println("Select option 1 for Insert data:");
//                 System.out.println("Select option 2 for Update data:");
//                 System.out.println("Select option 3 for Delete data:");
//                 System.out.println("Select option 4 for get all details in the table:");
//                 
//	}else {
//		System.out.println("Login failure, Please try again later..");
//	}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

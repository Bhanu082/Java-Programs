package java_sql;
import java.sql.*;
import java.util.Scanner;

public class miracleempl {
	public static void main(String[] args) throws Exception {
	authentication();


}
	public static void authentication() throws Exception {
		String username = "Adam";
		String password= "Miracle";
	Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter username : ");
		String userName = sc.nextLine();
		System.out.println("Please Enter password : ");
		String passWord = sc.nextLine();
		if(username.equals(userName) && password.equals(passWord)) {
			System.out.println("Login Successfully");
		}
		else {
			System.out.println("Invalid Data.. Please enter valid username & password ... ");
		}		
		System.out.println("Enter Your choice : ");
		System.out.println("1 Insert New User : ");
		System.out.println("2 Update Existing User : ");
        System.out.println("3 Delete User : ");
        System.out.println("4 Get User Details : ");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				addNewUser();
				break;
			case 2:
				updateUser();
				break;
			case 3 :
				deleteUser();
				break;
			case 4 :
				getUser();
				break;
				
		}
	}
	
	public static void addNewUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user_id : ");
	     int user_id = sc.nextInt();
	     sc.nextLine();
	     System.out.println("Enter user name : ");
	     String user_name = sc.nextLine();
	     System.out.println("Enter user age : ");
	     int user_age = sc.nextInt();
	     System.out.println("Enter user salary : ");
	     int user_salary = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MIRACLE","root","M1racle@123");
		PreparedStatement ps = con.prepareStatement("INSERT INTO User_info values(?,?,?,?)");
		ps.setInt(1,user_id);
		ps.setString(2,user_name);
		ps.setInt(3,user_age);
		ps.setInt(4,user_salary);
		int i = ps.executeUpdate();
        if (i>0) {
		System.out.println("Inserted Successfully....");}
        else {System.out.println("Insertion Failed..");}
		}catch (Exception e) {
			e.printStackTrace();
		}
				
	
		
	}
	private static void updateUser() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter User Name to Update : ");
		String nName = sc.nextLine();
		System.out.println("Please enter  User age to Update : ");
		int age = sc.nextInt();
		System.out.println("Please enter  User salary to Update : ");
		int salary = sc.nextInt();
		String Query = "UPDATE User_info SET user_age = ?, user_salary = ? WHERE user_name = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MIRACLE","root","M1racle@123");
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setInt(1,age);
		ps.setInt(2, salary);
		ps.setString(3, nName);
		
		int i = ps.executeUpdate();
		if (i>=0) {
		System.out.println("Record updated successfully..");}
		else {System.out.println("Failed updation..");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		}
	private static void deleteUser() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter User Name to delete : ");
		String nName = sc.nextLine();
		
		String Query = "DELETE FROM User_info WHERE user_name = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MIRACLE","root","M1racle@123");
		PreparedStatement ps = con.prepareStatement(Query);
		
		ps.setString(1, nName);
		
		int i = ps.executeUpdate();
		if (i>=0) {
		System.out.println("Record deleted successfully..");}
		else {System.out.println("Failed deletion..");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		}
		
	private static void getUser() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter User Name to get the details : ");
		String nName = sc.nextLine();
//		String Query = "SELECT * FROM User_info WHERE user_name = ?";
		String user_name ="%A";
		String Query = "SELECT * FROM User_info WHERE user_name like?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MIRACLE","root","M1racle@123");
//		PreparedStatement ps = con.prepareStatement(Query);
		PreparedStatement s = con.prepareStatement(Query);
		s.setString(1, user_name+"%");
		ResultSet rs = s.executeQuery();
		ResultSetMetaData rsm = rs.getMetaData(); 
		System.out.println(rsm.getColumnCount());
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println(dbmd.getDatabaseProductName());

		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " ");
		}
//		ps.setString(1, nName);
//		
//		ResultSet rs = ps.executeQuery();
//		rs.next();
//		System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getInt(3)+ " "+rs.getInt(4));
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		}
		
	}


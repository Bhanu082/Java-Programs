package java_sql;
import java.sql.*;
import java.util.Scanner;

public class Registration_login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MIRACLE", "root", "M1racle@123");
            System.out.println("Enter 1 for login or 2 for registration");
            int n = sc.nextInt();
            sc.nextLine(); 
            
            switch (n) {
            
//            Login:
            
                case 1:
                    System.out.println("Welcome to login page. Please provide the details:");
                    System.out.println("Enter your username:");
                    String name = sc.nextLine();
                    System.out.println("Enter your password:");
                    String password = sc.nextLine();
                    
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM Users WHERE username = ? AND password = ?");
                    ps.setString(1, name);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();
                    
                    if (rs.next()) {
                        System.out.println("Login successfully.");
                        
                        System.out.println("Select option 1 for Insert data:");
                        System.out.println("Select option 2 for Update data:");
                        System.out.println("Select option 3 for Delete data:");
                        System.out.println("Select option 4 for get all details in the table:");
                        
                        int choice = sc.nextInt();
                        sc.nextLine(); 
                        
                        switch (choice) {
                        
//                        Insert:
                        
                            case 1:
                                System.out.println("Please enter ID for the given user:");
                                int user_id = sc.nextInt();
                                System.out.println("Please enter name for the given user:");
                                sc.nextLine(); 
                                String user_name = sc.nextLine();
                                System.out.println("Please enter age:");
                                int user_age = sc.nextInt();
                                System.out.println("Please enter the salary:");
                                int user_salary = sc.nextInt();
                                
                                PreparedStatement ps3 = con.prepareStatement("INSERT INTO User_info VALUES (?, ?, ?, ?)");
                                ps3.setInt(1, user_id);
                                ps3.setString(2, user_name);
                                ps3.setInt(3, user_age);
                                ps3.setInt(4, user_salary);
                                
                                int i = ps3.executeUpdate();
                                if (i > 0) {
                                    System.out.println("Inserted Successfully.");
                                } else {
                                    System.out.println("Insertion Failed.");
                                }
                                break;
                                
//                                Update:
                                
                            case 2:
                                System.out.println("Please enter username for the update:");
                                user_name = sc.nextLine();
                                System.out.println("Please enter age:");
                                user_age = sc.nextInt();
                                System.out.println("Please enter the salary:");
                                user_salary = sc.nextInt();
                                
                                String query = "UPDATE User_info SET user_age = ?, user_salary = ? WHERE user_name = ?";
                                PreparedStatement ps4 = con.prepareStatement(query);
                                ps4.setInt(1, user_age);
                                ps4.setInt(2, user_salary);
                                ps4.setString(3, user_name);
                                
                                int j = ps4.executeUpdate();
                                if (j > 0) {
                                    System.out.println("Record updated successfully.");
                                } else {
                                    System.out.println("Failed to update record.");
                                }
                                break;
                                
//                                Delete:
                                
                            case 3:
                            	System.out.println("Please enter User Name to delete : ");
                        		user_name = sc.nextLine();
                        		
                        		String Query = "DELETE FROM User_info WHERE user_name = ?";
                        		
                        		PreparedStatement p = con.prepareStatement(Query);
                        		
                        		p.setString(1, user_name);
                        		
                        		int a = ps.executeUpdate();
                        		if (a>=0) {
                        		System.out.println("Record deleted successfully..");}
                        		else {System.out.println("Failed deletion..");
                        }
                        		break;
                        }
                    } else {
                        System.out.println("Login failed.");
                    }
                    break;
                    
//                    Registration:
                    
                case 2:
                    System.out.println("Please provide details for the registration:");
                    System.out.println("Enter your username:");
                    name = sc.nextLine();
                    System.out.println("Enter your password:");
                    password = sc.nextLine();
                    
                    PreparedStatement ps1 = con.prepareStatement("INSERT INTO Users VALUES (?, ?)");
                    ps1.setString(1, name);
                    ps1.setString(2, password);
                    _
                    int k = ps1.executeUpdate();
                    if (k > 0) {
                        System.out.println("Registration Successful.");
                    } else {
                        System.out.println("Registration Failed.");
                    }
                    break;
                    
              

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close(); 
        }
    }
}

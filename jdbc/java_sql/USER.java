import java.util.Scanner;
import java.sql.*;
package java_sql;

public class USER {

	public static void main(String[] args){
		String username;
		String password;
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
		
	}

}

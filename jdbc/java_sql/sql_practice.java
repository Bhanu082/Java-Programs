package java_sql;

import java.sql.*;

public class sql_practice {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BHAVANI","root","M1racle@123");
//		DatabaseMetaData dbm= c.getMetaData();
//		System.out.println(dbm.getJDBCMajorVersion());
		Statement st = c.createStatement();
		ResultSet rs =st.executeQuery("SELECT * FROM Miracle_emp");
//		ResultSetMetaData rsmeta= rs.getMetaData();
//
//		System.out.println(rsmeta.getColumnLabel(3));

		int i = st.executeUpdate("INSERT INTO Miracle_emp values(501,'Bhanu','HR',56789,15000)");
//		PreparedStatement ps=c.prepareStatement("DELETE FROM Miracle_emp WHERE emp_id =?");
//		rs.next();
//		System.out.println(rs.getString(2));
//		ps.setInt(1, 501);
//		int i=ps.executeUpdate();
//		System.out.println(i);
		System.out.println(i);
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("Succesfully registered");
	
}
}

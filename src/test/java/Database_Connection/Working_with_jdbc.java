package Database_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Working_with_jdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub	

		/** 
		 * Syntax for jdbc connection
		 * 
		 * "jdbc:mysql://"+host+"+port+"+"/Database_Name"

		Connection conn=DriverManager.getConnection("jdbc:mysql://"+"localhost"+"3306"+"/qabdt"+"root"+"root@123");
		Statement statement=conn.createStatement();
		ResultSet rSet=statement.executeQuery("Query that needs to be executed");
		 * 
		 */
		Connection con = DriverManager.getConnection("jdbc:mysql://" + "localhost" + ":" + "3306" + "/qadbt", "root",
				"root@123");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo");
		while (rs.next()) {
			System.out.println("//**************************//");
			System.out.println("Name: " + rs.getString("name"));
			System.out.println("ID: " + rs.getInt("id"));
			System.out.println("Location: " + rs.getString("location"));
			System.out.println("Age: " + rs.getInt("age"));
			System.out.println("****************************");
		}
		rs.close();
		s.close();
		con.close();
		System.out.println("End of program code execution");

	}

}


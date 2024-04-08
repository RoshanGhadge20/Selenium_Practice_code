package Database_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Working_with_jdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con = DriverManager.getConnection("jdbc:mysql://" + "localhost" + ":" + "3306" + "/qadbt", "root",
				"root@123");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo");
		  while (rs.next()) {
              System.out.println("Name: " + rs.getString("name"));
              System.out.println("ID: " + rs.getInt("id"));
              System.out.println("Location: " + rs.getString("location"));
              System.out.println("Age: " + rs.getInt("age")); 
              System.out.println("****************************");
          } 
		  rs.close();
          s.close();
          con.close();

}

}



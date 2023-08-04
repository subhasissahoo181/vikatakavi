package Database;
import java.sql.*;
public class Database {

	public static void main(String[] args) {
		try {
			//Step-1 load the class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Step 2 connection database
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			if(con!=null) {
				System.out.println("Connection sucessfully");
				
			}
			//step-3 connection close
			con.close();
			
		}
		catch(ClassNotFoundException ce) {
			System.out.print("Class Not Found");
		}
		catch(SQLException se) {
			System.out.println("Sql exception");
		}

	}

}

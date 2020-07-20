// Deletion of record
import java.sql.*;
import java.util.Scanner;
public class Jdbc_Agg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in=new Scanner(System.in);
			System.out.println("enter the st id");
			int id=in.nextInt();
		// Load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		// Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
		// Create the Statement object
		Statement st=con.createStatement();
		//Execute the sql query
		int result=st.executeUpdate("delete from student where roll="+id);
		
		if(result==0)
			System.out.println("Record not found");
		else
			System.out.println("Deleted successfully");
		// Close the connection 
		st.close();
		con.close();
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

import java.sql.*;
import java.util.Scanner;

// Update Record
public class Jdbc_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in =new Scanner(System.in);
			String name=in.next();
			// Load the Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
			// Create Statement object
			Statement st=con.createStatement();
			// execute the sql query
			int result=st.executeUpdate("update student set name='"+name+"' where roll=9");
			if(result==0)
				System.out.println("Updation Failed");
			else
				System.out.println("Updation successfully");
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

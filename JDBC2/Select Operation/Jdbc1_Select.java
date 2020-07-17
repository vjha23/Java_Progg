import java.sql.*;
public class Jdbc1_Select {
	public static void main(String[] args) {
		try {
			// Load the Driver class
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
			// Create Statement Object
			Statement st=con.createStatement();
			// Execute the command for select query return type result set (object) form
			ResultSet rst=st.executeQuery("select * from student");
			// print the result (here we use the non scroablle (forward cursor)
			while(rst.next()) {
				System.out.println(rst.getString(1)+ "\t"+rst.getString(2)+"\t"+rst.getString(3));
			}
			// now closing the connections,rst and st
			rst.close();
			st.close();
			con.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

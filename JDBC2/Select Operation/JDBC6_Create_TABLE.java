import java.sql.*;
public class JDBC6_Create_TABLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		// load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		// Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
		// Create the Statement object
		Statement st=con.createStatement();
		// execute the sql query 
		
		int result=st.executeUpdate("create table demo(name varchar(45))");
		if(result==0)
			System.out.println("Failed");
		else
			System.out.println("Created Successfully");
		// close the connection 
		st.close();
		con.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

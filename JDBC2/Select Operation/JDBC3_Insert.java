import java.sql.*;
import java.util.Scanner;

// Insertion of record
public class JDBC3_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter roll");
			int roll=in.nextInt();
			System.out.println("Enter name");
			String name=in.next();
			System.out.println("Enter per");
			double per=in.nextDouble();
			// Load the class
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
			// Create Statement object
			Statement st=con.createStatement();
			// Execute the sql query
			int result=st.executeUpdate("insert into student values("+roll+",'"+name+"',"+per+")");
			if(result==0)
				System.out.println("Insertion failed");
			else
				System.out.println("Inserted Sucessfully");
			// closing the connection
			st.close();
			con.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

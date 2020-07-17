import java.sql.*;
import java.util.Scanner;
public class Jdbc2_Select2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter the name");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			name="'"+name+"'";
			boolean flag=false;
			// Load the Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
			// Create the Statement object
			Statement st=con.createStatement();
			// Execute the statement now
			ResultSet rst=st.executeQuery("select * from student where name="+name);
			// Print the Statement
			while(rst.next()!=false) {
				System.out.print(rst.getString(1)+"\t"+rst.getString(2)+"\t"+rst.getString(3));
				flag=true;
			}
			if(flag==false)
				System.out.println("No records found");
			// Closing the connection
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

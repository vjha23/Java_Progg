import java.sql.*;
import java.util.Scanner;
public class Jdbc3_Select3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start range");
		int sid=sc.nextInt();
		System.out.println("Enter the end range");
		int eid=sc.nextInt();
		// Load the DriverClass
		Class.forName("com.mysql.jdbc.Driver");
		// Established the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
		// Create the Statement object
		Statement st=con.createStatement();
		// Execute the sql query
		ResultSet rst=st.executeQuery("select * from student where roll>="+sid+" and roll<="+eid);
		// Print the result
		boolean flag=false;
		while(rst.next()!=false) {
			System.out.println(rst.getString(1)+"\t"+rst.getString(2)+"\t"+rst.getString(3));
			flag=true;
		}
		if(flag==false)
			System.out.println("Record Not Found");
		// Close the Connection
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

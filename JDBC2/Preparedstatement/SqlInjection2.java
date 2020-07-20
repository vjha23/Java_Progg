package Preparedstatement;
import java.sql.*;
import java.util.Scanner;

// solving sql injection problem by preparedStatement
public class SqlInjection2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("enter name");
		String name=in.next();
		System.out.println("enter pass");
		String pass=in.next();
		// Load the Driver class
		Class.forName("com.mysql.jdbc.Driver");
		// Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","vijay");
		// create prepared statement object
		PreparedStatement pst=con.prepareStatement("select count(*) from login where name=? and pass=?");
		//set the values
		pst.setString(1,name);
		pst.setString(2, pass);
		ResultSet rst=pst.executeQuery();
		int cnt=0;
		if(rst.next()) {
			cnt=rst.getInt(1);
		}
		if(cnt==0)
			System.out.println("Invalid crediantials");
		else
			System.out.println("Valid Crediantials");
		// close the connection
		rst.close();
		pst.close();
		con.close();
	}

}

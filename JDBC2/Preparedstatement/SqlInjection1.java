package Preparedstatement;
// showing sql injection
import java.sql.*;
import java.util.Scanner;
public class SqlInjection1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("enter name");
		String name=in.next();
		System.out.println("enter pass");
		String pass=in.next();
		// Load the Driver class
		Class.forName("com.mysql.jdbc.Driver");
		// establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","vijay");
		// Create Statement object
		Statement st=con.createStatement();
		// Now exceute the sql queries
		ResultSet rst=st.executeQuery("select count(*) from login where name='"+name+"' and pass="+pass+"");
		int cnt=0;
		if(rst.next()) {
			cnt=rst.getInt(1);
		}
		System.out.println("cnt value is "+cnt);
		if(cnt==0) {
			System.out.println("Invalid Credentials");
		}else {
			System.out.println("Valid Credentials");
		}
		// close the connection
		rst.close();
		st.close();
		con.close();
	}

}

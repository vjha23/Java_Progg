package Preparedstatement;
import java.sql.*;
import java.text.SimpleDateFormat;
public class DateRetrieve {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// Load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		// Establish the conn
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
		//Create Statement object
		Statement st=con.createStatement();
		// execute the query
		ResultSet rst=st.executeQuery("select * from student");
		// process the resultset
		while(rst.next()) {
			int no=rst.getInt(1);
			String name=rst.getString(2);
			java.sql.Date sqdob=rst.getDate(3);
			java.sql.Date sqdoj=rst.getDate(4);
			
			// convert java.sql.Date class objs into java.util.Date class objs
			java.util.Date udob=(java.util.Date)sqdob;
			
			java.util.Date udoj=(java.util.Date)sqdoj;
			SimpleDateFormat sdf1=new SimpleDateFormat("MMM-yy-dd");
			String sdob=sdf1.format(udob);
			
			SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-dd-MMM");
			String sdoj=sdf2.format(udoj);
			
			System.out.println(no+"  "+name+"  "+sdob+"  "+sdoj);
		}
		// close the connection
		rst.close();
		st.close();
		con.close();
	}

}

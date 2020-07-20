package Preparedstatement;
// program on inserting date
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class DateInsert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter person no");
		int no=in.nextInt();
		System.out.println("enter person no");
		String name=in.next();
		System.out.println("enter person dob(dd-mm-yy)");
		String sdob=in.next();
		System.out.println("Enter DOJ(yyyy-mm-dd)");
		String sdoj=in.next();
		
		// converting String values to java.sql.Date class objs
		// FOR DOB
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yy");
		java.util.Date udob=sdf1.parse(sdob);
		java.sql.Date sqdob=new java.sql.Date(udob.getTime());
		
		// for DOJ (yyyy-MM-dd)
		java.sql.Date sqdoj=java.sql.Date.valueOf(sdoj);
		
		// Load the DriverClass
		Class.forName("com.mysql.jdbc.Driver");
		// Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
		//Create preparedStatement object
		PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?,?)");
		// set the values 
		pst.setInt(1, no);
		pst.setString(2, name);
		pst.setDate(2, sqdob);
		pst.setDate(4, sqdoj);
		// execute the query
		int res=pst.executeUpdate();
		// process the res
		if(res==0)
			System.out.println("not inserted");
		else
			System.out.println("inserted sucessdfully");
		// close the connection
		pst.close();
		con.close();
		
	}

}

package Preparedstatement;
import java.sql.*;
import java.io.*;
public class Blob_ImageInsert {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// Load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		// establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
		// Create preparedStatement object
		PreparedStatement pst=con.prepareStatement("insert into image values(?,?)");
		// set the values
		pst.setString(1, "vijay");
		System.out.println(new File(".").getAbsolutePath());
		File f=new File("hello.jpg");
		FileInputStream fis=new FileInputStream(f);
		pst.setBinaryStream(2, fis);
		
		// execute the query
		pst.executeUpdate();
		System.out.println("photo inserted");
		// close the conn
		fis.close();
		pst.close();
		con.close();
	}

}

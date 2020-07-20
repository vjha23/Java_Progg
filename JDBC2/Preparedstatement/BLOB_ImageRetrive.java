package Preparedstatement;
import java.sql.*;
import java.io.*;
public class BLOB_ImageRetrive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Load the class
		Class.forName("com.mysql.jdbc.Driver");
		// Establish the conn
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
		// create statement object
		Statement st=con.createStatement();
		// execute the sql query
		ResultSet rst=st.executeQuery("select  * from image");
		if(rst.next()) {
			// getInputStream
			InputStream in=rst.getBinaryStream("image");
			// create destination file
			FileOutputStream fos=new FileOutputStream("vijay.jpeg");
			
			// Buffering based logic to complete photo retrivieng
			int bytesRead=0;
			byte[] buffer=new byte[4096];
			
			while((bytesRead=in.read(buffer))!=-1) {
				fos.write(buffer,0,bytesRead);
			}
			System.out.println("photo is stored is vijay.jpeg");
			
		}
	}

}

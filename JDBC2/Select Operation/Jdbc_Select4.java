import java.sql.*;
import java.util.Scanner;
public class Jdbc_Select4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in=new Scanner(System.in);
			String des1=in.next();
			des1="'"+des1.toUpperCase()+"'";
			String des2=in.next();
			des2="'"+des2.toUpperCase()+"'";
			
			// Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","vijay");
			// Create the Statement object
			Statement st=con.createStatement();
			//execute the sql query
			ResultSet rst=st.executeQuery("select * from employee where job in('"+des1+"' ,'"+des2+"')");
			//print the result
			boolean flag=false;
			while(rst.next()!=false) {
				System.out.println(rst.getString(1)+"\t"+rst.getString(2)+"\t"+rst.getString(3)+"\t"+rst.getString(4));
				flag=true;
			}
			if(flag==false)
				System.out.println("Not found");
			// closing the connection
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

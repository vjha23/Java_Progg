package Preparedstatement;
import java.sql.*;
import java.util.Scanner;
public class JDBC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		try {
			Scanner in =new Scanner(System.in);
			System.out.println("Enter the no of student");
			int n=in.nextInt();
			// Load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
			// Create the Preparedstatement object
			if(con!=null)
				ps=con.prepareStatement("insert into student values(?,?,?)");
			// execute the sql query 
			if(ps!=null)
			{
				for(int i=1;i<=n;i++) {
					System.out.println("enter the stud roll");
					int roll=in.nextInt();
					System.out.println("enter the stud name");
					String name=in.next();
					System.out.println("enter the stu per");
					double per=in.nextDouble();
					// set these values query place holder
					ps.setInt(1, roll);
					ps.setString(2, name);
					ps.setDouble(3, per);
					int result=ps.executeUpdate();
					if(result==0)
						System.out.println("Not inserted");
					else
						System.out.println("inserted successfully");
					
				}
			}
			ps.close();
			con.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

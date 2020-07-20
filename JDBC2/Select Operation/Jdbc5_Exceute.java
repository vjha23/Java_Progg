// program to execute both select and non select queries
import java.sql.*;
import java.util.Scanner;
public class Jdbc5_Exceute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the query");
			String query=in.nextLine();
			// load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","vijay");
			// Create the Statement object
			Statement st=con.createStatement();
			// execute the query
			boolean flag=st.execute(query);
			if(flag==true) {
				ResultSet rst=st.getResultSet();
				while(rst.next()) {
					System.out.println(rst.getString(1)+"\t"+rst.getString(2)+"\t"+rst.getString(3));
				}
				rst.close();
			}
			else { // when non select query excuted
				int rowcount=st.getUpdateCount();
				System.out.println("the no of records that effected "+rowcount);
				
			}
			st.close();
			con.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

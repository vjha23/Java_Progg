// SQL CRUD method Create,read,update,delete
package jdbc;
import jdbc.Jdbc_Util;
import java.sql.*;
public class Jdbc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createEmployee();
		//updateEmployee();
		//deleteEmployee();
		
	}

	private static void deleteEmployee() {
		// TODO Auto-generated method stub
		try(Connection connection=Jdbc_Util.getConnection();Statement st=connection.createStatement();){
			// if we want to insert all the data into columns then we dont have to write the columns names
			String SQLDELETE="DELETE FROM stud012 WHERE roll=299";
			int cnt=st.executeUpdate(SQLDELETE);
			if(cnt==1) {
				System.out.println("Table is Deleted");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void updateEmployee() {
		// TODO Auto-generated method stub
		try(Connection connection=Jdbc_Util.getConnection();Statement st=connection.createStatement();){
			// if we want to insert all the data into columns then we dont have to write the columns names
			String SQLUPDATE="UPDATE stud012 set name='saurabh' WHERE roll=299";
			int cnt=st.executeUpdate(SQLUPDATE);
			if(cnt==1) {
				System.out.println("Table is Updated");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void createEmployee() {
		// TODO Auto-generated method stub
		// this try line will automatically close the connection we dont need here the close the connection
		try(Connection connection=Jdbc_Util.getConnection();Statement st=connection.createStatement();){
			// if we want to insert all the data into columns then we dont have to write the columns names
			String SQLINSERT="INSERT INTO stud012(roll,name,per) VALUES(299,'Mohit',94.2)";
			int cnt=st.executeUpdate(SQLINSERT);
			if(cnt==1) {
				System.out.println("1 Row Affected");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
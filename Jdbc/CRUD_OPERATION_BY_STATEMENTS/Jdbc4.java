// Reading data from Database
package jdbc;
import jdbc.Jdbc_Util;
import java.sql.*;
public class Jdbc4 {

	public static void main(String[] args) {
	ReadDatbase();
		
	}

	private static void ReadDatbase() {
		// TODO Auto-generated method stub
		try(Connection connection=Jdbc_Util.getConnection();Statement st=connection.createStatement();){
			// if we want to insert all the data into columns then we dont have to write the columns names
			String SQLRead="SELECT * FROM stud012";
			ResultSet rst=st.executeQuery(SQLRead);
			while(rst.next()) {
				System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+"\t"+rst.getFloat(3));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}


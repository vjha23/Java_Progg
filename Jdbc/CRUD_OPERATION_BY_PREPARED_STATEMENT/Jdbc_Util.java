package jdbc;
import java.sql.*;
import java.sql.DriverManager;
public class Jdbc_Util {
	private static final String DB_DRIVER_CLASS="com.mysql.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="vijay";
	private static final String DB_URL="jdbc:mysql://localhost:3306/employee";
	
	private static Connection connection=null;
	static {
		try {
			Class.forName(DB_DRIVER_CLASS);
			connection=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
	}
}

package jdbc;
import java.sql.*;
public class JDBC_demo {
	public static void main(String[] args){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay","root","vijay");
		Statement stmt=conn.createStatement();
		ResultSet rst=stmt.executeQuery("select * from customer");
		while(rst.next()){
			System.out.println(rst.getString(1)+"\t"+rst.getString(2)+"\t"+rst.getString(3)+"\t"+rst.getString(4)+"\t"+rst.getInt(5)+"\t"+rst.getString(6));
		}
		stmt.close();
		conn.close();
	}
	catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	catch(SQLException e){
		e.printStackTrace();
	}

}
}
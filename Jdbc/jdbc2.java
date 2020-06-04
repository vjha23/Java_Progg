package jdbc;
import java.sql.*;
import java.io.Console;
import java.util.*;
public class jdbc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay","root","vijay");
			Statement stmt=conn.createStatement();
			stmt.executeUpdate("create table stud012(roll int,name varchar(20),per float)");
			int roll;
			String name;
			float per;
			Scanner in=new Scanner(System.in);
			//Console con=System.console();
			while(true){
				System.out.println("Enter roll or type -1 to exit:");
				roll=in.nextInt();
				//roll=Integer.parseInt(con.readLine());
				if(roll==-1){
					break;
				}
				System.out.println("Enter name:");
				//name=con.readLine();
				name=in.nextLine();
				System.out.println("Enter per:");
				per=in.nextFloat();
			//	per=Float.parseFloat(con.readLine());
				int cnt=stmt.executeUpdate("insert into stud012 values("+roll+",'"+name+"',"+per+")");
				if(cnt==1)
					System.out.println("Record inserted Successfully");
				
			}
			ResultSet rst=stmt.executeQuery("select * from stud012");
			while(rst.next()){
				System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+"\t"+rst.getFloat(3));
			}
			stmt.close();
			conn.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}

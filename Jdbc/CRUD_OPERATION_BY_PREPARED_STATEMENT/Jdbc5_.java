package jdbc;

import java.util.ArrayList;
/*
 * 1-Created a prepareStatement
 * String sql="select * from employee_table where employee_id=?"
 * here-? is used for runtime input and passed as parameter.
 * PreparedStatement pst=con.prepareStatement(sql);
 * ------------------------------------------------------------------------------------------------
 * 
 * 2-Inserting parameter into a Prepared Statement
 * String sql="select * from employee_table where employee_id=?"
 * preparedStatement.setLong(1,123);
 * the first number(1) is the index of the parameter to insert value for
 * --------------------------------------------------------------------------------------------
 * ex-String sql="select from employee_table where fname=? and lname=?";
 *   * PreparedStatement pst=con.prepareStatement(sql);
 *   preparedStatement.setString(1,"John");
 *   preparedStatement..getString(2,"Smith");
 *   ------------------------------------------------------------------------------------------
 *   
 *   
 * 3-Executing the Prepared Statement
 * Result rst=preparedStatement.executeQuery();
 * for execute upadte
 * String sql="select from employee_table where fname=? and lname=? where id=?";
 *   * PreparedStatement pst=con.prepareStatement(sql);
 *   preparedStatement.setString(1,"John");
 *   preparedStatement..getString(2,"Smith");
 *   preparedStatement.setLong(3,123);
 *   int rowAffected=preparedStatement.executeUpdate();
 *   --------------------------------------------------------------------------------------------
 *   4-Reusing a preparedStatement
 *   String sql="select from employee_table where fname=? and lname=? where id=?";
 *   * PreparedStatement pst=con.prepareStatement(sql);
 *   preparedStatement.setString(1,"John");
 *   preparedStatement..getString(2,"Smith");
 *   preparedStatement.setLong(3,123);
 *   int rowAffected=preparedStatement.executeUpdate();
 *   
 *   preparedStatement.setString(1,"Stan");
 *   preparedStatement..getString(2,"Lee");
 *   preparedStatement.setLong(3,456);
 *   int rowAffected=preparedStatement.executeUpdate();
 */
import java.util.List;
import jdbc.Jdbc_Util;

import java.math.BigDecimal;
import java.sql.*;
public class Jdbc5_ implements EmployeeDATA{

	@Override
	public void createEmployee(Employee employee) {
		String SQLINSERT="INSERT INTO employee VALUES(?,?,?,?,?,?) ";
		try(Connection con=Jdbc_Util.getConnection();PreparedStatement pst=con.prepareStatement(SQLINSERT)) {
			pst.setInt(1, employee.getEmployee_id());
			pst.setString(2,employee.getEmployeeName());
			pst.setDouble(3,employee.getSalary());
			pst.setString(4,employee.getEmail());
			pst.setDate(5,new Date(employee.getDate().getTime()));
			pst.setBigDecimal(6,employee.getBonus());
			
			int ExecuteUpdate=pst.executeUpdate();
			if(ExecuteUpdate==1) {
				System.out.println("Employees Created");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public Employee getEmployeebyId(Integer employeeId) {
		Employee employee=null;
		String SQLISELECT="SELECT * FROM employee WHERE employee_id=?";
		try(Connection con=Jdbc_Util.getConnection();PreparedStatement pst=con.prepareStatement(SQLISELECT)) {
			pst.setInt(1,employeeId);
		ResultSet rst=pst.executeQuery();
		while(rst.next()) {
			int empID=rst.getInt("employee_id");
			String eName=rst.getString("employeeName");
			Double salary=rst.getDouble("salary");
			String email=rst.getString("email");
			Date doj=rst.getDate("date");
			BigDecimal bonus=rst.getBigDecimal("bonus");
			employee=new Employee();
			employee.setBonus(bonus);
			employee.setDate(doj);
			employee.setEmail(email);
			employee.setEmployeeName(eName);
			employee.setEmployee_id(empID);
			System.out.println(empID+"\t"+eName+"\t"+salary+"\t"+email+"\t"+doj+"\t"+bonus);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
	@Override 
	public void updateEmployeebyId(String newEmail,Integer employeeId) {
		String SQLUPDATE="UPDATE employee set email=? WHERE employee_id=?";
		try(Connection con=Jdbc_Util.getConnection();PreparedStatement pst=con.prepareStatement(SQLUPDATE)) {
			pst.setString(1, newEmail);
			pst.setInt(2,employeeId);
			int executeUpdate=pst.executeUpdate();
			if(executeUpdate==1) {
				System.out.println("Employee email is updated");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void deleteEmployeebyId(Integer employeeId) {
		String SQLDELETE="DELETE FROM employee WHERE employee_id=?";
		try(Connection con=Jdbc_Util.getConnection();PreparedStatement pst=con.prepareStatement(SQLDELETE)) {
			pst.setInt(1,employeeId);
			int executeUpdate=pst.executeUpdate();
			if(executeUpdate==1) {
				System.out.println("Employee id is Deleted with id="+employeeId);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Employee> getAllEmployeeInfo(){
		List<Employee> empList=new ArrayList<>();
		String SQLISELECT="Select * From employee";
		try(Connection con=Jdbc_Util.getConnection();PreparedStatement pst=con.prepareStatement(SQLISELECT)) {
		ResultSet rst=pst.executeQuery();
		while(rst.next()) {
			int empID=rst.getInt("employee_id");
			String eName=rst.getString("employeeName");
			Double salary=rst.getDouble("salary");
			String email=rst.getString("email");
			Date doj=rst.getDate("date");
			BigDecimal bonus=rst.getBigDecimal("bonus");
			Employee employee=new Employee();
			employee.setBonus(bonus);
			employee.setDate(doj);
			employee.setEmail(email);
			employee.setEmployeeName(eName);
			employee.setEmployee_id(empID);
			empList.add(employee);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	return empList;
	}
}

package jdbc;
import java.util.List;
import java.math.BigDecimal;
import java.util.Date;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDATA emp=new Jdbc5_();
		Employee employee=getEmployee();
	//	emp.createEmployee(employee);
		//getEmployeebyID(emp);
		//emp.updateEmployeebyId("Vijayjha@gmail.com", 1);
		//emp.deleteEmployeebyId(1);
		getAllEmployeeInfo(emp);
		
	}
	private static void getEmployeebyID(EmployeeDATA emp) {
		Employee employee2=emp.getEmployeebyId(1);
		if(employee2!=null) {
			System.out.println(employee2);
		}else {
			System.out.println("Employee does not exits");
		}
	}
	private static Employee getEmployee() {
		Employee employee=new Employee();
		employee.setBonus(new BigDecimal(290));
		employee.setDate(new Date());
		employee.setEmployeeName("VijayKant");
		employee.setEmail("vjha23@gmail.com");
		employee.setSalary(20000.00);
		employee.setEmployee_id(1);
		return employee;
	}
	private static void getAllEmployeeInfo(EmployeeDATA emp) {
		List<Employee>empList=emp.getAllEmployeeInfo();
		empList.forEach(System.out::println);
	}

}

package jdbc;
import java.util.List;
public interface EmployeeDATA {

	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeebyId(Integer employeeId);
	public abstract void updateEmployeebyId(String newEmail,Integer employeeId);
	public abstract void deleteEmployeebyId(Integer employeeId);
	public abstract List<Employee> getAllEmployeeInfo();
}

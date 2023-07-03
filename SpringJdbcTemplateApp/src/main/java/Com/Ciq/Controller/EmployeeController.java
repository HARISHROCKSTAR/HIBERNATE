package Com.Ciq.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Com.Ciq.Dao.EmployeeDaoImpl;
import Com.Ciq.Pojo.Employee;

//@Component("cts")
@Controller("cts")
public class EmployeeController {
	
//	EmployeeController employeeController=new EmployeeController();

	@Autowired
	private EmployeeDaoImpl employeeServiceImpl;

//	
//
//	public void setEmployeeServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
//		this.employeeServiceImpl = employeeServiceImpl;
//	}

	public void save(Employee employee) {
		employeeServiceImpl.save(employee);
	}

	public List<Employee> getEmployees() {
		return employeeServiceImpl.getEmployees();
	}

}


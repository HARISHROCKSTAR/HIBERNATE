package Com.Ciq.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Com.Ciq.Pojo.Employee;
import Service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	
@Autowired
	private EmployeeServiceImpl employeeServiceImpl;


	public void save(Employee employee) {
		employeeServiceImpl.save(employee);
	}


}



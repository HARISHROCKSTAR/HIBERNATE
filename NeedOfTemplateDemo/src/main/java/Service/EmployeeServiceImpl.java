package Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Ciq.Dao.EmployeeDaoImpl;
import Com.Ciq.Pojo.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;
	

	public void save(Employee employee) {
		
		employeeDaoImpl.save(employee);
		
		System.out.println("Employee service layer");
	}
	

}

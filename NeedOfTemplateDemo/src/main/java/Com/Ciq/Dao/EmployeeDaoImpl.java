package Com.Ciq.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.Ciq.Pojo.Employee;
import Com.Ciq.Template.CiqTemplate;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private CiqTemplate ciqTemplate;
	
	public void save(Employee employee) {

		int result = ciqTemplate.update("insert into employee values(?,?,?)",
				new Object[] { employee.getId(), employee.getName(), employee.getSalary() });
		System.out.println(result +" inserted");
	}
	
	
	

}

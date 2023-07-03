package Com.Ciq.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Ciq.Controller.EmployeeController;
import Com.Ciq.Dao.EmployeeDaoImpl;
import Com.Ciq.Pojo.Employee;

public class EmployeeClient {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee(999, "Harish", 55000);
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//EmployeeController cont = (EmployeeController) context.getBean("cts");
		EmployeeDaoImpl im=context.getBean(EmployeeDaoImpl.class);
		
		//cont.save(employee);  
		im.save(employee);
	}

}

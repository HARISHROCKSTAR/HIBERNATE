package Com.Ciq.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Ciq.Controller.EmployeeController;
import Com.Ciq.Pojo.Employee;

public class EmployeeClient {
	
	public static void main(String[] args) {
		Employee employee = new Employee(402, "Harish", 30000);
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeController cont = (EmployeeController) context.getBean("employeeServiceImpl");
		cont.save(employee);

}
}
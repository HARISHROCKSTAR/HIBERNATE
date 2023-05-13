package Com.Ciq.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Ciq.Dao.EmpJdbcTemplate;

public class StudentTest {
	public static void main(String[] args) {
		
	ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		
		EmpJdbcTemplate jdbctemp=(EmpJdbcTemplate) ap.getBean("empJDBCTemplate");
		
		jdbctemp.update(1, "REMO");
		
//		jdbctemp.delete(1);
		
	}
	
  
	
	
}

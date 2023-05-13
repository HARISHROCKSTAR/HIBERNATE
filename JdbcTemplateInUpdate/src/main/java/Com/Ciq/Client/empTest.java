package Com.Ciq.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Ciq.Dao.EmpJdbcTemplate;

public class empTest {

	public static void main(String[] args) {

		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		
		EmpJdbcTemplate jdbctemp=(EmpJdbcTemplate) ap.getBean("empJDBCTemplate");
		
//		jdbctemp.update(101, "Harish");
		
				jdbctemp.delete(1);
		
	}

}

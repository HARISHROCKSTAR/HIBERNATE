package Com.Ciq.Dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import Com.Ciq.Pojo.Employee;

public class EmpJdbcTemplate implements EmpDao{
	
	private DataSource datasource;
	
	private JdbcTemplate jdbctempobj;
	

	public void setDataSource(DataSource ds) {
		datasource = ds;
		this.jdbctempobj=new JdbcTemplate(datasource);		
	}

	public void update(Integer id, String name) {

		String sql="update employee set name=? where id=?";
		jdbctempobj.update(sql, name,id);
		System.out.println("update the record......"+id);
	}

	public Employee getEmployees(Integer id) {
		//String sql1="select * from employee where id=?";
		
		return null;
	}

	public void delete(int id) {
		String dlt="delete from employee where id=?";
		jdbctempobj.update(dlt, id);
		System.out.println("deleted.....");
		
	}

}

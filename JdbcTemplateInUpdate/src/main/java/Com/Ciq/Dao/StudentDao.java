package Com.Ciq.Dao;

import javax.sql.DataSource;

import Com.Ciq.Pojo.Employee;

public interface StudentDao {

	//initialize a db connection
	public void setDataSource(DataSource ds);
	
	//used to update the value
	public void update(Integer id,String name);
	
	//used to fetch the data
	public Employee getstudents(Integer id);
	
	//used to delete
	public void delete(int id);

}

	
	
	

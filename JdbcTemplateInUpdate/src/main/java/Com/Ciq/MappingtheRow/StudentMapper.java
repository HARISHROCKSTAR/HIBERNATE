package Com.Ciq.MappingtheRow;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Com.Ciq.Pojo.Student;

public class StudentMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

package Com.Ciq.Template;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;


public class CiqTemplate {
//@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int update(String query, Object[] param) {
		Connection connection = null;
		PreparedStatement ps = null;
		System.out.println("connectionTemplate");
		try {
			connection = dataSource.getConnection();
			ps = connection.prepareStatement(query);
			int i = 1;
			for (Object object : param) {
				ps.setObject(i, object);
				i++;
			}
			System.out.println("inserted");
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;

	}
}



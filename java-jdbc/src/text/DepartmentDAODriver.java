package text;

import java.sql.SQLException;

import practice08.ConnectionManager;

public class DepartmentDAODriver {
	public static void main(String[] args) throws SQLException {
		ConnectionManager connectionManager = new ConnectionManager();
		DepartmentDAO departmentDAO = new DepartmentDAO(connectionManager.getConnection());
		departmentDAO.selectAll().forEach(department -> System.out.println(department) );
	}
}

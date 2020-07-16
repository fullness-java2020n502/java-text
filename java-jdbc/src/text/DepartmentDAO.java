package text;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
	private Connection connection;

	public DepartmentDAO(Connection connection) {
		this.connection = connection;
	}

	public List<Department> selectAll() throws SQLException{
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		statement = connection.prepareStatement(
			"select * from department d inner join employee e on d.dept_no = e.dept_no"
		);
		resultSet = statement.executeQuery();
		List<Department> departments = new ArrayList<>();
		// resultSetのループ
		roop: while(resultSet.next()) {
			// すでにインスタンス化してArrayListに入れたコレクションでループ
			for (Department d : departments) {
				if(d.getDeptNo() == resultSet.getInt("dept_no")) {
					Employee employee = new Employee();
					employee.setEmpNo(resultSet.getInt("emp_no"));
					employee.setEmpName(resultSet.getString("emp_name"));
					employee.setBirthday(resultSet.getDate("birthday"));
					employee.setDeptNo(resultSet.getInt("dept_no"));
					d.getEmployees().add(employee);
					continue roop;
				}
			}
			Department department = new Department();
			department.setDeptNo(resultSet.getInt("dept_no"));
			department.setDeptName(resultSet.getString("dept_name"));
			department.setEmployees(new ArrayList<Employee>());
			departments.add(department);
			Employee employee = new Employee();
			employee.setEmpNo(resultSet.getInt("emp_no"));
			employee.setEmpName(resultSet.getString("emp_name"));
			employee.setBirthday(resultSet.getDate("birthday"));
			employee.setDeptNo(resultSet.getInt("dept_no"));
			department.getEmployees().add(employee);
		}
		if(resultSet != null) resultSet.close();
		if(statement != null) statement.close();
		return departments;
	}
}

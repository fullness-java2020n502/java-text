package text;

import java.util.List;

import practice01.Employee;

public class EmployeeRepositoryMySQL implements EmployeeRepository{

	@Override
	public void insert(Employee employee) {
		// MySQLのSQLでINSERT文を使ったDB操作
	}

	@Override
	public void update(Employee employee) {
		// MySQLのSQLでUPDATE文を使ったDB操作
	}

	@Override
	public void delete(Employee employee) {
		// MySQLのSQLでDELETE文を使ったDB操作
	}

	@Override
	public List<Employee> findAll() {
		// MySQLを使ったSELECT文（全件）の処理
		return null;
	}

	@Override
	public Employee findById(int id) {
		return null;
	}


}

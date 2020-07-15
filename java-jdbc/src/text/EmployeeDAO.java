package text;
/**
 * 社員テーブルDAOクラス
 * @author imagepit
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 社員テーブルDAOクラス
 * @author imagepit
 */
public class EmployeeDAO {

	/** コネクション */
	Connection connection;

	/**
	 * コンストラクタ
	 * @param connection コネクション
	 */
	public EmployeeDAO(Connection connection) {
		this.connection = connection;
	}

	/**
	 * データ追加処理
	 * @param employee 社員インスタンス
	 * @return 更新件数
	 * @throws SQLException DB関連例外
	 */
	public int insert(Employee employee) throws SQLException {
		PreparedStatement statement = null;
		int result = 0;
		try {
			statement = connection.prepareStatement("insert into employee values(?,?,?,?)");
			statement.setInt(1, employee.getEmpNo());
			statement.setString(2, employee.getEmpName());
			statement.setDate(3, employee.getBirthday());
			statement.setInt(4, employee.getDeptNo());
			result = statement.executeUpdate();
		} catch (SQLException e) {
			throw new SQLException("SQLエラー",e);
		} finally {
			try {
				if(statement != null) statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * データ更新処理
	 * @param employee 社員インスタンス
	 * @return 更新件数
	 * @throws SQLException DB関連例外
	 */
	public int update(Employee employee) throws SQLException {
		PreparedStatement statement = null;
		int result = 0;
		try {
			statement = connection.prepareStatement("update employee set emp_name = ?, birthday = ?, dept_no = ? where emp_no = ?");
			statement.setInt(4, employee.getEmpNo());
			statement.setString(1, employee.getEmpName());
			statement.setDate(2, employee.getBirthday());
			statement.setInt(3, employee.getDeptNo());
			result = statement.executeUpdate();
		} catch (SQLException e) {
			throw new SQLException("SQLエラー",e);
		} finally {
			try {
				if(statement != null) statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * データ削除処理
	 * @param employee 社員インスタンス
	 * @return 更新件数
	 * @throws SQLException DB関連例外
	 */
	public int delete(Employee employee) throws SQLException {
		PreparedStatement statement = null;
		int result = 0;
		try {
			statement = connection.prepareStatement("delte from employee where emp_no = ?");
			statement.setInt(1, employee.getEmpNo());
			result = statement.executeUpdate();
		} catch (SQLException e) {
			throw new SQLException("SQLエラー",e);
		} finally {
			try {
				if(statement != null) statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * データ全件取得処理
	 * @return 社員リスト
	 * @throws SQLException DB関連例外
	 */
	public List<Employee> selectAll() throws SQLException{
		PreparedStatement statement = null;
		int result = 0;
		ResultSet resultSet = null;
		List<Employee> employees = new ArrayList<Employee>();
		try {
			statement = connection.prepareStatement("select * from employee");
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setEmpNo(resultSet.getInt("emp_no"));
				employee.setEmpName(resultSet.getString("emp_name"));
				employee.setBirthday(resultSet.getDate("birthday"));
				employee.setDeptNo(resultSet.getInt("dept_no"));
				employees.add(employee);
			}
		} catch (SQLException e) {
			throw new SQLException("SQLエラー",e);
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(statement != null) statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return employees;
	}

	/**
	 * データ1件取得処理（社員番号を条件）
	 * @return 社員
	 * @throws SQLException DB関連例外
	 */
	public Employee selectByEmpNo(int empNo) throws SQLException {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Employee employee = null;
		try {
			statement = connection.prepareStatement("select * from employee");
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				employee = new Employee();
				employee.setEmpNo(resultSet.getInt("emp_no"));
				employee.setEmpName(resultSet.getString("emp_name"));
				employee.setBirthday(resultSet.getDate("birthday"));
				employee.setDeptNo(resultSet.getInt("dept_no"));
			}
		} catch (SQLException e) {
			throw new SQLException("SQLエラー",e);
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(statement != null) statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return employee;
	}
}

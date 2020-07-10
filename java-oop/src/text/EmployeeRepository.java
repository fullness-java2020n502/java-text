package text;


import java.util.List;

import practice01.Employee;
/**
 * DBを何を使うかわからないけど、とりあえず更新・削除・追加・取得ができる
 * 入出力規格のインターフェース
 * @author imagepit
 */
public interface EmployeeRepository {
	void insert(Employee employee); // 追加
	void update(Employee employee);
	void delete(Employee employee);
	List<Employee> findAll();
	// デフォルトメソッドは実装をかかないといけない
	Employee findById(int id);
}

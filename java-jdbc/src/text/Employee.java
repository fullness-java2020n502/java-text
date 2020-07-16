package text;

import java.sql.Date;

/**
 * 社員テーブルValueクラス
 * @author imagepit
 */
public class Employee {
	private int empNo;
	private String empName;
	private Date birthday;
	private int deptNo;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	// Sytem.out.printlnするときにアドレスの参照値でなく
	// 自分がみやすい値になるように再定義する
	@Override
	public String toString() {
		// PreparedStatementのバインド変数のように文字列を生成できる
		// %dは何かしらの数字が代入されるもの
		// %sは何かしらの文字列or日付が代入されるもの
		return String.format("社員[%d,%s,%s,%d]",empNo,empName,birthday,deptNo);
	}

}

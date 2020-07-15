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

	@Override
	public String toString() {
		return String.format("Employee[%d,%s,%s,%d]",empNo,empName,birthday,deptNo);
	}

}

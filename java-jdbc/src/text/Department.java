package text;

import java.util.List;

public class Department {
	private int deptNo;
	private String deptName;
	private List<Employee> employees;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return String.format("Department[%d,%s,%s]", deptNo, deptName, employees);
	}
}

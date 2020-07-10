package text;

import practice01.Employee;

public class AuthenticateDummy implements Authenticate{

	@Override
	public Employee authenticate(String username, String password) {
		if(username.equals("takahashi") && password.equals("taka123")) {
			Employee employee = new Employee();
			employee.empNo = 1;
			employee.empName = username;
			return employee;

		} else {
			throw new IllegalArgumentException("不正な認証");
		}
		//return null;
	}

}

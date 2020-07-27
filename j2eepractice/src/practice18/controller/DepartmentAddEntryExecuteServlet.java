package practice18.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import practice18.dataaccess.value.Department;

@WebServlet("/departmentAddEntryExecute")
public class DepartmentAddEntryExecuteServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// パラメータ取得
		String deptNo = req.getParameter("deptNo");
		String deptName = req.getParameter("deptName");
		// Departmentインスタンス生成
		Department department = new Department();
		department.setDeptNo(Integer.parseInt(deptNo));
		department.setDeptName(deptName);
		// セッションに格納
		HttpSession session = req.getSession(true);
		session.setAttribute("department", department);
		// フォワード
		req.getRequestDispatcher("WEB-INF/jsp/departmentAddConfirm.jsp").forward(req, resp);
	}
}

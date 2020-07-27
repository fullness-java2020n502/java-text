package practice18.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import practice18.dataaccess.value.Department;
import practice18.service.DepartmentService;

@WebServlet("/departmentAddRegistExecute")
public class DepartmentAddRegistExecuteServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// セッションからインスタンスを取得
		HttpSession session = req.getSession(false);
		if(session != null) {
			Department department = (Department)session.getAttribute("department");
			// サービスを呼び出し登録処理
			DepartmentService service = new DepartmentService();
			service.addDepartment(department);
			req.getRequestDispatcher("WEB-INF/jsp/departmentAddComplete.jsp")
				.forward(req, resp);
			// セッションの削除
			session.removeAttribute("department");
			// リクエストにセット
			req.setAttribute("department", department);
		}
	}
}

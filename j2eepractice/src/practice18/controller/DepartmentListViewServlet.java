package practice18.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice18.service.DepartmentService;

@WebServlet("/departmentListView")
public class DepartmentListViewServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DepartmentService departmentService = new DepartmentService();
		req.setAttribute("dlist", departmentService.getDepartmentList());
		req.getRequestDispatcher("WEB-INF/jsp/departmentListView.jsp").forward(req, resp);
	}
}

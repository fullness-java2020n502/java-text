package practice07;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practice07_2")
public class Practice07Servlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// req.setCharacterEncoding("UTF-8"); // パラメータの文字化け対応
		String sei = req.getParameter("sei");
		String mei = req.getParameter("mei");
		req.setAttribute("fullName", sei + mei);
		req.getRequestDispatcher("WEB-INF/jsp/practice07_2.jsp").forward(req, resp);
	}
}

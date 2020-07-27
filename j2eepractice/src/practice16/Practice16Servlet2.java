package practice16;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practice16_2")
public class Practice16Servlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// パラメータ取得
		int param1 = Integer.parseInt(req.getParameter("param1"));
		int param2 = Integer.parseInt(req.getParameter("param2"));
		String selectOperator = req.getParameter("operator");
		int result = 0;
		switch(selectOperator) {
		case "+":
			result = param1 + param2;
			break;
		case "-":
			result = param1 - param2;
			break;
		case "x":
			result = param1 * param2;
			break;
		case "÷":
			result = param1 / param2;
			break;
		}
		req.setAttribute("result", result);
		req.getRequestDispatcher("WEB-INF/jsp/practice16_2.jsp").forward(req, resp);
	}
}

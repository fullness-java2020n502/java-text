package practice16;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practice16_1")
public class Practice16Servlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 列挙型を使わずに算術演算子の文字列の配列を用意
		String[] operators = {"+","-","x","÷"};
		req.setAttribute("operators", operators);
		req.getRequestDispatcher("WEB-INF/jsp/practice16_1.jsp")
			.forward(req, resp);
	}
}

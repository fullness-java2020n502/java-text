package practice11;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practice11_1")
public class Practice11Servlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// セッション開始
		req.getSession(true);
		// フォワード
		req.getRequestDispatcher("WEB-INF/jsp/practice11_1.jsp").forward(req, resp);
	}
}

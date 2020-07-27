package practice15;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practice15_2")
public class Practice15Servlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// パラメータ取得
		String sei = req.getParameter("sei");
		String mei = req.getParameter("mei");
		// リクエストオブジェクトに値をセット
		req.setAttribute("fullName", sei + mei);
		// フォワード
		req.getRequestDispatcher("WEB-INF/jsp/practice15_2.jsp")
			.forward(req, resp);
	}
}

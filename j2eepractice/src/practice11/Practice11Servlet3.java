package practice11;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/practice11_3")
public class Practice11Servlet3 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// パラメータの取得
		String param1 = req.getParameter("param1");
		String param2 = req.getParameter("param2");
		// 計算
		Integer result = Integer.parseInt(param1) + Integer.parseInt(param2);
		// リクエストオブジェクトにセット
		req.setAttribute("result", result);
		// セッションを呼び出し
		HttpSession session = req.getSession(false);
		if(session != null) {
			session.invalidate(); // セッションの破棄
			//session.setAttribute("param1", param1);
			//session.setAttribute("param2", param2);
		}
		// フォワード
		req.getRequestDispatcher("WEB-INF/jsp/practice11_3.jsp").forward(req, resp);
	}
}

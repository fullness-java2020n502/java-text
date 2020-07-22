package practice04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practice04_2")
public class Practice04Servlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 文字化け対策
		req.setCharacterEncoding("UTF-8");

		// パラメータの取得
		String param1 = req.getParameter("param1");
		String param2 = req.getParameter("param2");

		// バリデート（入力チェック）
		// 入力値が空文字だった場合はエラー画面へリダイレクト
		if(param1.equals("") || param2.equals("")) {
			// http://localhost:8080/j2eepractice/errorへ
			// resp.sendRedirect("error");
			// return;
			// 入力画面にエラーメッセージを出すなら
			req.setAttribute("errorMsg", "入力値が不正です");
			// JSPにフォワード
			req.getRequestDispatcher("WEB-INF/jsp/practice04_1.jsp")
			.forward(req, resp);
		} else {
			// 足し算
			Integer result = Integer.parseInt(param1) + Integer.parseInt(param2);
			// リクエストオブジェクトに結果をセット
			req.setAttribute("result", result);
			// JSPにフォワード
			req.getRequestDispatcher("WEB-INF/jsp/practice04_2.jsp")
				.forward(req, resp);
		}

	}
}

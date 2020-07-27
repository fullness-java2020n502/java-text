package practice14;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/practice14_2")
public class Practice14Servlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// パラメータ取得
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		// 未入力時は入力画面にフォワード
		if(userId.equals("") || password.equals("")) {
			req.getRequestDispatcher("WEB-INF/jsp/practice14_1.jsp").forward(req, resp);
			return;
		}
		// Userクラスをインスタンス化
		User user = new User();
		user.setUserId(userId);
		user.setPassword(password);
		// セッションにUserインスタンスをセット
		HttpSession session = req.getSession(true);
		session.setAttribute("user", user);
		// TODO DBに登録処理
		System.out.println("DB登録:UserID" + user.getUserId());
		// リダイレクト
		// PRGパターン（Post-Redirect-Get）
			// 二重投稿防止機能
		resp.sendRedirect("practice14_3");
		// req.getRequestDispatcher("WEB-INF/jsp/practice14_2.jsp").forward(req, resp);
	}
}

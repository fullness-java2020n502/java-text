package text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/question") // http://localhost:8080/web/question
public class QuestionServlet extends HttpServlet{
	// POSTで受け取るメソッド
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 文字化け対策
		req.setCharacterEncoding("UTF-8");
		// パラメータを取得
		String customer = req.getParameter("customer");
		String interest = req.getParameter("interest");
		// デバッグ
		System.out.println("customer:" + customer);
		System.out.println("interest:" + interest);
		// HTTPレスポンスを返却
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		// 文字化け対策
		out.print("<!DOCTYPE html>");
		out.print("<html lang=\"ja\">");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("<title>自己紹介ページ</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h2>名前:" + customer + "</h2>");
		if(interest.equals("yes")) {
			out.print("<p>山登りに興味あるんですね</p>");
		}else {
			out.print("<p>山登りに興味ないんですね</p>");
		}
		out.print("</body>");
		out.print("</html>");
	}
}

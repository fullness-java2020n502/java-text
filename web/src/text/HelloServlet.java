package text;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello") // http://localhost:8080/web/hello POST
public class HelloServlet extends HttpServlet{
	// POSTメソッドの通信を受け取りたい場合はdoPost
	@Override
	protected void doPost(
			HttpServletRequest req, // HTTPリクエスト
			HttpServletResponse resp // HTTPレスポンス
	) throws ServletException, IOException {
		// パラメーターを受け取る
		String username = req.getParameter("username");
		System.out.println("username:" + username);
		String color = req.getParameter("color");
		System.out.println("color:" + color);
		// DAOクラスを呼び出す
			// 更新系
			// 参照系

		// HTTPレスポンスとしてHTMLを返す
		resp.getWriter().print("<h1>名前:"+ username +"</h1>");
	}
}

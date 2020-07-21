package practice03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 必ず@WebServletを指定!!
@WebServlet("/practice03") // URLパターンの指定
public class Practice03Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ディスパッチ JSPファイルの指定をWebContentからの相対パスで指定
		req.getRequestDispatcher("WEB-INF/jsp/practice03.jsp")
			.forward(req, resp);
	}
}

package text;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/post")
public class PostServlet extends HttpServlet{
	@Override
	protected void doPost(
			HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		// パラメータ取得
		String param1 = req.getParameter("param1");
		String param2 = req.getParameter("param2");
		System.out.println("param1:"+param1);
		System.out.println("param2:"+param2 );
		// パラメーターをJSPに渡す
		req.setAttribute("param1", param1);
		req.setAttribute("param2", param2);
		req.getRequestDispatcher("WEB-INF/post.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// パラメータ取得
		String param1 = req.getParameter("param1");
		String param2 = req.getParameter("param2");
		System.out.println("param1:"+param1);
		System.out.println("param2:"+param2 );
	}
}

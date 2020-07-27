package practice17;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practice17")
public class Practice17Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("date", new Date());
		req.setAttribute("val", "12345");
		req.getRequestDispatcher("WEB-INF/jsp/practice17.jsp")
			.forward(req, resp);
	}
}

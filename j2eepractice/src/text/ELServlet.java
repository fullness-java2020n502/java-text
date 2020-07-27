package text;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/el")
public class ELServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee employee = new Employee();
		employee.setEmail("takahashi@hoge.com");
		HttpSession session = req.getSession(true);
		session.setAttribute("emp", employee);
		//req.setAttribute("emp", employee);
		req.getRequestDispatcher("WEB-INF/jsp/el.jsp").forward(req, resp);
	}
}

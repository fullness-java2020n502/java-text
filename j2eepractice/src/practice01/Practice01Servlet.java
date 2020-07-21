package practice01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



// 【メモ】8080ポートが使用中のエラーが発生した場合
// 1. コマンドプロンプトを起動
// 2. 「netstat -nao | find "8080"」のコマンドを実行
// 3. 8080ポートを利用しているプロセスIDをコピー
// 4. 「taskkill /f /pid プロセスID」のコマンド実行



/**
 * 演習1
 * @author imagepit
 */

// 【注意】@WebServletのUrlを同じ値にすると
// Tomcatが動かないです
@WebServlet("/practice01_1")
public class Practice01Servlet extends HttpServlet{
	@Override
	protected void doGet(
			HttpServletRequest req,
			HttpServletResponse resp
	) throws ServletException, IOException {
		// コンテンツタイプの指定
		// getWriter()する前
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<title>はじめてのサーブレット</title>");
		out.println("<body>");
		out.println("はじめてのServlet!!");
		out.println("</body>");
		out.println("</html>");
	}
}

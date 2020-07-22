package practice07;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// ↓すべてのURLパターンのリクエストに対してこのクラスのフィルターを通す
@WebFilter("/practice07_2") // *はワイルドカードであらゆる文字のパターン
public class ServletFilter implements Filter{
	@Override
	public void doFilter(
			ServletRequest request,
			ServletResponse response,
			FilterChain chain
	)throws IOException, ServletException {
		// 前処理
		System.out.println("前処理");
		request.setCharacterEncoding("UTF-8");
		// Servletのメイン処理が実行される
		chain.doFilter(request, response);
		// 後処理
		System.out.println("後処理");
	}

}

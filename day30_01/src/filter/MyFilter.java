package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	//过滤器对象销毁前执行，
	public void destroy() {
		System.out.println("destory....");

	}
	//拦截用户的请求，如果请求资源路径和当前过滤器的拦截路径匹配时，就执行本方法
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("myFilter....");
		//放行（将请求交给下一个过滤器或者交给目标资源）
		chain.doFilter(req, res);
		System.out.println("myfilter back...");
	}
	//创建过滤器对象后，立即执行本方法
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init()....");

	}

}

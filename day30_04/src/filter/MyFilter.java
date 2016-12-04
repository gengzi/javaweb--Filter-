package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub

	}

	public void init(FilterConfig config) throws ServletException {
		// 获取过滤器名字
		String name = config.getFilterName();
		System.out.println(name);
		//获取SerletContext对象
		ServletContext sc = config.getServletContext();
		System.out.println(sc);
		//获取初始化参数根据参数名
		String value = config.getInitParameter("school");
		System.out.println(value);
	}

}

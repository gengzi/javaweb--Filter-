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
		// ��ȡ����������
		String name = config.getFilterName();
		System.out.println(name);
		//��ȡSerletContext����
		ServletContext sc = config.getServletContext();
		System.out.println(sc);
		//��ȡ��ʼ���������ݲ�����
		String value = config.getInitParameter("school");
		System.out.println(value);
	}

}

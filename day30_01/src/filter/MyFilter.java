package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	//��������������ǰִ�У�
	public void destroy() {
		System.out.println("destory....");

	}
	//�����û����������������Դ·���͵�ǰ������������·��ƥ��ʱ����ִ�б�����
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("myFilter....");
		//���У������󽻸���һ�����������߽���Ŀ����Դ��
		chain.doFilter(req, res);
		System.out.println("myfilter back...");
	}
	//�������������������ִ�б�����
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init()....");

	}

}

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>index.jsp</title>
  </head>
  
  <body>
    <!-- get请求 点击超链接，超链接后跟参数，参数值为中文 -->
  	<a href="<%=path%>/CharacterServlet?school=软件学院">点击</a>
  	<hr/>
  	<!-- post请求，表单的请求方式为post -->
  	<form action="<%=path%>/CharacterServlet" method="post">
  		学院:<input type="text" name="school"/><br>
  		<input type="submit" value="提交"/>
  	</form>
  </body>
</html>

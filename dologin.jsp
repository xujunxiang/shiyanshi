<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String username="";
	String password="";
	request.setCharacterEncoding("utf-8");//防止中文乱码
	
	username=request.getParameter("username");
	password=request.getParameter("password");
	
	if(username.equals("admin")&&password.equals("123456"))
	{
		session.setAttribute("username", username);
		response.sendRedirect("login_success.jsp");
	}
	else
	{
		response.sendRedirect("login_failure.jsp");
	}
%>
	
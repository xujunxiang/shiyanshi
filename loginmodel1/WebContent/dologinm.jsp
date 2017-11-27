<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
   	<%
   	request.setCharacterEncoding("utf-8");
   	%>
    <jsp:useBean id="loginUser" class="com.po.Users" scope="page"/>
    <jsp:useBean id="userDAO" class="com.dao.UsersDAO" scope="page"/>
    <jsp:setProperty property="*" name="loginUser"/>
<%

	
	if(userDAO.usersLogin(loginUser))
	{
		session.setAttribute("loginUser", loginUser.getUsername());
		response.sendRedirect("login_successm.jsp");
	}
	else
	{
		response.sendRedirect("login_failurem.jsp");
	}
%>
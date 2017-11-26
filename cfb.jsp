<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>乘法表</title>
</head>
<body>
	<%!
		String multiTable(){
			String s="";
			int i,j;
			for(i=1;i<=9;i++){
				for(j=1;j<=i;j++){
					s=s+i+"*"+j+"="+(i*j)+"  ";//算式之间空格隔开
				}
				s=s+"<br>";//换行
			}
			return s;
	}
	%>
	<h1>乘法表</h1>
	<hr>
	<%=multiTable() %>
</body>
</html>
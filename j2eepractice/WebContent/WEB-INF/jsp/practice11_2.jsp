<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>足し算</title>
<style>
* { text-align: center; }
</style>
</head>
<body>
	<h1>足し算</h1>
	<%
	String param1 = "";
	String param2 = "";
	if(session.getAttribute("param1") != null){
		param1 = (String)session.getAttribute("param1");
	}
	if(session.getAttribute("param2") != null){
		param2 = (String)session.getAttribute("param2");
	}
	%>
	<form action="practice11_3" method="post">
		<input type="text" name="param1" value="<%= param1 %>" /> +
		<input type="text" name="param2" value="<%= param2 %>" /><br>
		<input type="submit" value="計算" />
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>セッション開始</title>
</head>
<body>
	<h1>セッション開始</h1>
	<%
	List<String> list = (List<String>)request.getAttribute("list");
	for(String val: list ){
	%>
		<p><%= val %></p>
	<% } %>
</body>
</html>
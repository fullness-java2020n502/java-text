<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>姓名</title>
<style>
* { text-align: center; }
</style>
</head>
<body>
	<h1>姓名</h1>
	<p><%= request.getAttribute("fullName") %></p>
</body>
</html>
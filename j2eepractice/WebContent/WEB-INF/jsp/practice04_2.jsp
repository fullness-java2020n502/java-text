<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>足し算結果</title>
<style>
* { text-align:center; }
</style>
</head>
<body>
	<h1>足し算結果</h1>
	<p>答え = <%= (Integer)request.getAttribute("result") %></p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>ポストでのリクエスト</h1>
	<%-- Servletから送られた値を取得 --%>
	param1:<%= (String)request.getAttribute("param1") %><br>
	param2:<%= (String)request.getAttribute("param2") %>
</body>
</html>
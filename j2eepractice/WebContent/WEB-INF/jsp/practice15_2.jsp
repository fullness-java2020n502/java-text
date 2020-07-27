<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<p><c:out value="${fullName}" /></p>
</body>
</html>
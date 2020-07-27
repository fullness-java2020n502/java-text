<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>四則演算</title>
<style>
* { text-align: center; }
</style>
</head>
<body>
	<h1>四則演算</h1>
	<form action="practice16_2" method="post">
		<input type="text" name="param1" />
		<select name="operator">
		<c:forEach var="o" items="${operators}">
			<option value="${o}">${o}</option>
		</c:forEach>
		</select>
		<input type="text" name="param2" />
		<br>
		<input type="submit" value="計算" />
	</form>
</body>
</html>
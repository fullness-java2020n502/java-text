<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* { text-align: center; }
table { margin: 0 auto; }
</style>
</head>
<body>
	<h1>部署一覧</h1>
	<a href="departmentAddEntryView">新規登録</a>
	<table border="1">
		<tr>
			<th>部署番号</th>
			<th>部署名</th>
		</tr>
		<c:forEach var="d" items="${dlist}">
		<tr>
			<td><c:out value="${d.deptNo}" /></td>
			<td><c:out value="${d.deptName}" /></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
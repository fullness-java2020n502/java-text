<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>部署登録（完了）</title>
<style>
* { text-align: center; }
table { margin: 0 auto; }
</style>
</head>
<body>
	<h1>部署登録（完了）</h1>
	<p>部署登録が完了しました</p>
	<table border="1">
		<tr>
			<td>部署番号</td>
			<td><c:out value="${department.deptNo}" /></td>
		</tr>
		<tr>
			<td>部署名</td>
			<td><c:out value="${department.deptName}" /></td>
		</tr>
	</table>
	<a href="departmentListView">部署一覧</a>
</body>
</html>
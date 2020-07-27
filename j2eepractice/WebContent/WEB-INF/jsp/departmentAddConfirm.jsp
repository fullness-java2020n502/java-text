<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>部署登録（確認）</title>
<style>
* { text-align: center; }
table { margin: 0 auto; }
</style>
</head>
<body>
	<h2>部署登録（確認）</h2>
	<p>以下の内容でよろしいでしょうか</p>
	<form action="departmentAddRegistExecute" method="post">
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
		<input type="submit" value="確認" />
	</form>
</body>
</html>
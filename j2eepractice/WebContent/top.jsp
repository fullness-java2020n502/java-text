<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- includeアクションを使ってheader.jspをインクルード -->
	<jsp:include page="WEB-INF/jsp/inc/header.jsp" />
	<table border="1">
		<tr>
			<th>書籍ID</th>
			<th>書籍名</th>
			<th>著者</th>
		</tr>
		<tr>
			<td>1</td>
			<td>1</td>
			<td>1</td>
		</tr>
		<tr>
			<td>2</td>
			<td>2</td>
			<td>2</td>
		</tr>
	</table>
</body>
</html>
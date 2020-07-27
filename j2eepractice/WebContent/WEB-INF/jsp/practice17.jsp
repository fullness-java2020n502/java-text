<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>I18Nタグの利用</title>
</head>
<body>
	<div style="text-align:center;">
		<h2>日付/時刻</h2>
		<br>
		<fmt:formatDate value="${date}" pattern="yyyy/MM/dd" />
		<br>
		<fmt:formatDate value="${date}" pattern="yyyy/MM/dd HH:mm:ss" />
		<br> <br>
		<h2>数値</h2>
		<fmt:formatNumber value="${val}" pattern="0.0" />
		<br>
		<fmt:formatNumber value="${val}" type="currency" currencySymbol="$" />
		<br>
	</div>
</body>
</html>
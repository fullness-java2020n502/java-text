<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>四則演算　計算結果</title>
<style>
* { text-align: center; }
</style>
</head>
<body>
	<h1>計算結果</h1>
	<p>答え = <c:out value="${result}" /></p>
	<a href="practice16_1">戻る</a>
</body>
</html>
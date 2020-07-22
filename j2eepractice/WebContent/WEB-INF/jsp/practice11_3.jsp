<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>足し算</title>
<style>
* { text-align: center; }
</style>
</head>
<body>
	<h1>足し算</h1>
	<p>答え: <%= request.getAttribute("result") %></p>
	<a href="practice11_2"><button>前に戻る</button></a>
	<a href="practice11_1"><button>メニューに戻る</button></a>
</body>
</html>
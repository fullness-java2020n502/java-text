<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>足し算</title>
<style>
*{ text-align: center; }
</style>
</head>
<body>
	<!--
	http://localhost:8080/j2eepractice/practice04_1から
	http://localhost:8080/j2eepractice/practice04_2にリクエストを投げるなら
	相対パス指定なら「practice04_2」でOK
	-->
	<h1>足し算</h1>
	<form action="practice04_2" method="post">
		<input type="text" name="param1" /> +
		<input type="text" name="param2" />
		<input type="submit" value="計算" />
	</form>
</body>
</html>
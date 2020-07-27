<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<style>
h1, #submit{ text-align: center; }
table { margin: 0 auto; }
</style>
</head>
<body>
	<h1>ログイン</h1>
	<form action="practice14_2" method="post">
		<table>
			<tr>
				<td>ユーザID</td>
				<td><input type="text" name="userId" /></td>
			</tr>
			<tr>
				<td>パスワード</td>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<div id="submit">
		<input type="submit" value="ログイン" />
		</div>
	</form>
</body>
</html>
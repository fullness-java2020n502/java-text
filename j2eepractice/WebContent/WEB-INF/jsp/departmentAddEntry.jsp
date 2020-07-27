<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>部署登録（入力）</title>
<style>
* { text-align: center; }
table { margin: 0 auto; }
</style>
</head>
<body>
	<h1>部署登録（入力）</h1>
	<p>以下の項目を入力してください</p>
	<form action="departmentAddEntryExecute" method="post">
		<table border="1">
			<tr>
				<td>部署番号</td>
				<td><input type="text" name="deptNo" /></td>
			</tr>
			<tr>
				<td>部署名</td>
				<td><input type="text" name="deptName" /></td>
			</tr>
		</table>
		<input type="submit" value="確認" />
	</form>
</body>
</html>
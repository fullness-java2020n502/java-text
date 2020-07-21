<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>はじめてのJSP</title>
</head>
<body>
	<h1>はじめてのJSP2</h1>
	<%--
	JSPコメント
	JSPコメント
	これはHTTPレスポンスには送られない
	--%>
	<!-- HTMLコメント（HTTPレスポンスに送られる） -->

	<%-- 宣言 --%>
	<%! int result; %>
	<%!
	// 変数やメソッドの宣言、定義
	int add(int x, int y){
		return x + y;
	}
	%>

	<%-- スクリプトレット --%>
	<%
	// プログラムを実行する
	result = add(3,4);
	%>
	<%-- スクリプトレットでの条件分岐 --%>
	<% if(result == 7){ %>
	<p>3 + 4 = 7</p>
	<% } else { %>
	<p>メソッドがおかしいです</p>
	<% } %>

	<%-- 繰り返し --%>
	<h3>繰り返し</h3>
	<table border="1">
	<% for(int i = 0; i < 10; i++) { %>
		<tr><td><%= i+1 %></td><td>データ<%= i+1 %></td></tr>
	<% } %>
	</table>


	<table border="1">
	<%
	String[] strings = {"a","b","c","d"};
	for(String s : strings) {
	%>
		<tr><td><%= s %></td><td>データ<%= s %></td></tr>
	<% } %>
	</table>


</body>
</html>
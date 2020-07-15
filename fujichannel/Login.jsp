<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ page isELIgnored="false" %>

<html>
	<meta charset="UTF-8">
		<h1>ログイン</h1>
	<body>
		<form action="LoginServlet" method="post">
		ユーザー名<input Type="text" name = "user">
		パスワード<input Type="text" name = "pass">
		<input Type = "submit" value ="登録">
	</form>
	</body>
</html>

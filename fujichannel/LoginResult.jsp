<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
	<meta charset="UTF-8">
		<h1>ログイン結果</h1>
	<body>
		<tr><th>ユーザー名</th><th>パスワード</th></tr>
		<tr><td>${users}</td><td>${password}</td></tr>

	</body>
</html>

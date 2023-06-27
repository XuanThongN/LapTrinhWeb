<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isErrorPage="true"%>
<html>
<head>
<title>Error</title>
</head>
<body>
	<h1>Xảy ra lỗi:</h1>
	<p><%=exception.getMessage()%></p>
</body>
</html>
<%@ page import="com.lyyzoo.gpss.util.StringUtil" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/login" method="post">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit" value="login">
</form>

<% String message = StringUtil.valueOf(request.getAttribute("error")); %>
<%=message %>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: qjx
  Date: 2018/1/5
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<form action="/login/login" method="post">
  用户名：<input type="text" name="userName" value="${user.userName}">
  <input type="hidden" name="user" value="${user}">
  <br>
  密码：<input type="password"  name="password">
  <br>
  <button type="submit">提交</button>
</form>
</body>
</html>

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
    <title>注册</title>
</head>
<body>
<form action="/user/insert" method="post">
  用户名：<input type="text" name="userName">
  密码：<input type="password"  name="password">
  <button type="submit">提交</button>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: qjx
  Date: 2018/1/5
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
          + request.getServerName() + ":" + request.getServerPort()
          + path + "/";
%>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<form action="/login/login" method="post" id="myform">
  用户名：<input type="text" name="userName" id="userName" value="${user.userName}"><span id="checkname" style="color:red"></span>
  <br>
  密码：<input type="password"  name="password">
  <span id="checkpassword" style="color:red">${msg}</span>
  <br>
  <button type="submit">提交</button>
</form>
</body>
<script type="text/javascript" src="<%=basePath%>public/js/jquery.js"></script>
<script>

  $(function() {
    var username_result = false;
    //blue失去焦点
    $("#userName").blur(function () {
      var username_val = $("#userName").val()
      if ($("#userName").val() == "") {
        $("#checkname").html("userName not null!");
        username_result = false;
      } else {
        $.ajax({
          async: true,
          data:{"userName":username_val},
          dataType: "text",
          url: "/login/checkUserName",
          error: function (xhr, status) {
            console.log(status);
          },
          success: function (data) {
            if (data=="false") {
              username_result = true;
              $("#checkname").html("用户名错误，请重新输入");
            }
            else {
              username_result = false;
              $("#checkname").html("用户名正确");
            }
          }
        });
      }
    });
    $("#myform").submit(function() {
      if(username_result == false) {
        return true;
      } else {
        $("#checkpassword").html("用户名或密码错误");
        return false;
      }
    });
  });
</script>
</html>

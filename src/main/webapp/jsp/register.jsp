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
    <title>注册</title>
</head>
<body>
<form action="/login/register" method="post" id="myform">
  用户名：<input type="text" name="userName" id="userName"><span style="color: red" id="checkname"></span>
  <br>
  密码：<input type="password"  name="password">
  <br>
  <select name="roleId" id="roleId" value=""></select>
  <button type="submit">提交</button>
</form>
</body>
<script type="text/javascript" src="<%=basePath%>public/js/jquery.js"></script>
<script>
  $(function(){
    $("#roleId").empty();
    $.ajax({
      async:true,
      dataType:"json",
      url:"/login/queryRoles",
      error:function(xhr,status){
        console.log(status);
      },
      success:function(data){
        $(data).each(function(i,d){
          var id = d.roleId;
          var name = d.roleName;
          var option="<option value=\""+id+"\"";
          if(id == "${requestScope.roleId}"){
            option += "selected=\"selected\" ";
          }
          option +=">"+name+"</option>";
          $("#roleId").append(option);
        });
      }
    });
  });

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
              $("#checkname").html("用户名可用");
            }
            else {
              username_result = false;
              $("#checkname").html("用户名已存在");
            }
          }
        });
      }
    });
    $("#myform").submit(function(){
      if(username_result == true){
        return true;
      }
      else{
        return false;
      }
    });
  });
</script>
</html>

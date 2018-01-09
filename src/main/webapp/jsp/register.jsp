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
    <script src="<%=basePath%>public/js/jquery.js"></script>
</head>
<body>
<form action="/login/register" method="post">
  用户名：<input type="text" name="userName">
  <br>
  密码：<input type="password"  name="password">
  <br>
  <select name="roleId" id="roleId" value=""></select>
  <button type="submit">提交</button>
</form>

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
          /* $("#chargeId").append("<option value="+id+">"+name+"</option>"); */
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
</script>
</body>
</html>

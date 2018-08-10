<%--
  Created by IntelliJ IDEA.
  User: Soulver
  Date: 2018/8/10
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加客户</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/customer/save.action">
    客户姓名：<input type="text" name="name"><br/>
    客户性别：<input type="text" name="gender"><br/>
    客户年龄：<input type="text" name="age"><br/>
    <input type="submit" value="保存">
</form>
</body>
</html>

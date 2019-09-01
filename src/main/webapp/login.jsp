<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zhaneran
  Date: 2019/8/16
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名:<label>
    <input type="text" name="name"/>
</label><br/>
    密码:<label>
    <input type="text" name="password"/>
</label><br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>

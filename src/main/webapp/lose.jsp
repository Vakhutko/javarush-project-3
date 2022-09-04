<%--
  Created by IntelliJ IDEA.
  User: 19804925
  Date: 14.08.2022
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${info} Поражение</h1>
<form action="lose-servlet" method="GET">
    <p><input type="submit" value="Играть заново"/></p>
</form>
</body>
</html>
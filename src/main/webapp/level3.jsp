<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Level 3</title>
</head>
<body>
<h1><%= "Ты поднялся на мостик. Ты кто?" %>
</h1>
<br/>
<form action="level3-servlet" method="GET">
    <label>
        <input type="radio" name="answer" value="success" checked="checked">
    </label>Рассказать правду о себе
    <br>
    <label>
        <input type="radio" name="answer" value="fail">
    </label>Солгать о себе
    <br>
    <input type="submit" value="Ответить">
</form>
<p>Статистика:<br>IP address: ${ip}<br>Имя в игре: ${name}<br>Количество игр: ${countGame}</p>
</body>
</html>
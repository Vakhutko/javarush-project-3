<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Level 1</title>
</head>
<body>
<h1><%= "Ты потерял память. Принять вызов НЛО?" %>
</h1>
<br/>
<form action="level1-servlet" method="GET">
    <label>
        <input type="radio" name="answer" value="success" checked="checked">
    </label>Принять вызов
    <br>
    <label>
        <input type="radio" name="answer" value="fail">
    </label>Отклонить вызов
    <br>
    <input type="submit" value="Ответить">
</form>
<p>Статистика:<br>IP address: ${ip}<br>Имя в игре: ${name}<br>Количество игр: ${countGame}</p>
</body>
</html>
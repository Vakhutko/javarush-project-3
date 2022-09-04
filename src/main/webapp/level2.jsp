<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Level 2</title>
</head>
<body>
<h1><%= "Ты принял вызов. Поднимешься на мостик к капитану?" %>
</h1>
<br/>
<form action="level2-servlet" method="GET">
    <label>
        <input type="radio" name="answer" value="success" checked="checked">
    </label>Подняться на мостик
    <br>
    <label>
        <input type="radio" name="answer" value="fail">
    </label>Отказаться подниматься на мостик
    <br>
    <input type="submit" value="Ответить">
</form>
<p>Статистика:<br>IP address: ${ip}<br>Имя в игре: ${name}<br>Количество игр: ${countGame}</p>
</body>
</html>
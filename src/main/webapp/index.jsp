<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Пролог" %>
</h1>
<p><%= "Ты стоишь в космическом порту и готов подняться на борт своего корабря." +
        "<br>Разве ты не об этом мечтал?" +
        "<br>Стать капитаном космического судна с экипажем, который будет совершать подвиги под твоим командованием." +
        "<br>Так что вперёд!" %>
</p>
<h1><%= "Знакомство с экипажем" %>
</h1>
<p><%= "Когда ты поднялся на борт корабля, тебя поприветствовала девушка с чёрной папкой в руках:" +
        "<br>Здравствуйте, командир! Я Зинаида - ваша помощница. Видите?" +
        "<br>Там в углу пьёт кофе наш штурман - сержант Перегарный Шлейф, под штурвалом спит наш бортмеханик - " +
        "<br>Чёрный Богдан, а фотографирует его Сергей Стальная Пятка - наш навигатор." +
        "<br>А как обращаться к вам?" %>
</p>
<br/>
<form action="hello-servlet" method="GET">
    <p>
        <label>
            <input type="text" name="username">
        </label>
        <input type="submit" value="Представиться"/>
    </p>
</form>
<br>
</body>
</html>
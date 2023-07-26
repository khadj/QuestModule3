<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Добро пожаловать в игру!</title>
</head>
<body>
<h1>

</h1>
<h1>Ты потерял память. Принять вызов НЛО?</h1>
<form action=game method="post">
  <input type="radio" name="choice" value="accept"> Да<br>
  <input type="radio" name="choice" value="reject"> Нет<br>
  <input type="submit" value="Отправить">
</form>
<p>Сыгранные игры: ${gamesPlayed}</p>
</body>
</html>
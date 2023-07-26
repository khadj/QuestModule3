<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Ты принял вызов</title>
</head>
<body>
<h1>Поднимаешься на мостик к капитану?</h1>
<form action="question1" method="post">
  <input type="radio" name="identity" value="truth"> Да<br>
  <input type="radio" name="identity" value="lie"> Нет<br>
  <input type="submit" value="Отправить">
</form>
</body>
</html>
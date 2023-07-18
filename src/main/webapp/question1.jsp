<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>Text Adventure Game</title>
</head>
<body>
<h1>Вопрос 1</h1>
<p>Вы стоите перед развилкой. Выберите свой путь:</p>
<form action="game" method="get">
    <input type="hidden" name="action" value="question1">
    <input type="radio" name="answer" value="1"> Пойти налево<br>
    <input type="radio" name="answer" value="2"> Пойти направо<br>
    <br>
    <input type="submit" value="Отправить">
</form>
</body>
</html>
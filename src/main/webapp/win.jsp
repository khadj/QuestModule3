<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>Text Adventure Game</title>
</head>
<body>
<h1>Поздравляю!</h1>
<p>Вы успешно справились с испытаниями и выбрали правильные пути.</p>
<p>Вы победили!</p>
<p>Желаете сыграть еще раз?</p>
<form action="game" method="get">
    <input type="hidden" name="action" value="start">
    <input type="submit" value="Да">
</form>
</body>
</html>
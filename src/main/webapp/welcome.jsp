<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>Text Adventure Game</title>
</head>
<body>
<h1>Приветствие</h1>
<p>Добро пожаловать в мир приключений!</p>
<p>Вы оказались в загадочном лабиринте, полном опасностей и тайн. Ваша задача - найти выход из этого места и выжить.</p>
<p>Готовы ли вы принять вызов?</p>
<form action="game" method="get">
    <input type="hidden" name="action" value="start">
    <input type="submit" value="Да">
</form>
</body>
</html>
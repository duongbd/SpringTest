<%--
  Created by IntelliJ IDEA.
  User: Black Diamond
  Date: 7/14/2021
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1>Dictionary</h1>
        <form name="testForm"  method="get">
            <h3>English</h3>
            <input type="text" name="word" placeholder="" />
            <br/>
            <input type="submit"/>
        </form>
        <h3>Viet Nam</h3>
        <p>${word}</p>
    </body>
</html>

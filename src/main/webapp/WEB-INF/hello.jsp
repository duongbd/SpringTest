<%--
  Created by IntelliJ IDEA.
  User: Black Diamond
  Date: 7/14/2021
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="charset=UTF-8" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form name="testForm" action="/hello/?number={number}">
            <br/>
            <input type="int" name="number"/>
            <br/>
            <input type="submit"/>
        </form>
        <h2>${inbox}</h2>
    </body>
</html>

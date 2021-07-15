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
        <h1>Chuyen tien</h1>
        <form name="testForm"  method="get">
            <h3>VND</h3>
            <input type="int" name="number" placeholder=${inbox} />
            <br/>
            <input type="submit"/>
        </form>
        <h3>USD</h3>
        <p>${inbox}$</p>
    </body>
</html>

<%-- 
    Document   : Formulario1
    Created on : 13-jul-2013, 23:44:52
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Segundo Action</h1>
        <form action="SegundoAction.do" method="post">
            Mensaje: 
            <input type="text" name="mensaje"> 
            <br>
            <input type="submit" value="Aceptar">
        </form>
    </body>
</html>

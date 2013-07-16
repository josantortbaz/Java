<%-- 
    Document   : ormulario1
    Created on : 14-jul-2013, 13:53:22
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario con control de errores</h1>
        <h2>
            <form action="CuartoAction.do" method="post">
                Introducir mensaje:
                <input type="text" name="mensaje">
                <input type="submit" name="Aceptar">
            </form>
            <html:errors property="mensaje" />
        </h2>
    </body>
</html>

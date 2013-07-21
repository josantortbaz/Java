<%-- 
    Document   : formularioEliminaEmpleado
    Created on : 21-jul-2013, 17:05:33
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="formulario.elimina.title"/></title>
    </head>
    <body>
        <div align="center">            
            <h1><bean:message key="formulario.elimina.heading"/></h1>
            <form action="EmpleadoEliminaAction.do" method="post">
                <input type="text" name="codigo"/>
                <input type="submit" name="eliminaEmpleado" 
                       value="<bean:message key="formulario.elimina.boton"/>"/>
            </form>
            <html:errors property="codigo" />
        </div>
    </body>
</html>

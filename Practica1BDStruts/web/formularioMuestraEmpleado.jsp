<%-- 
    Document   : formularioMuestraEmpleado
    Created on : 20-jul-2013, 0:01:21
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="formulario.muestra.title"/></title>
    </head>
    <body>
        <div align="center">            
            <h1><bean:message key="formulario.muestra.heading"/></h1>
            <form action="EmpleadoMuestraAction.do" method="post">
                <input type="text" name="apellido"/>
                <input type="submit" name="buscaEmpleado" 
                       value="<bean:message key="formulario.muestra.boton"/>"/>
            </form>
            <html:errors property="apellido" />
        </div>
    </body>
</html>

<%-- 
    Document   : muestra
    Created on : 19-jul-2013, 22:36:58
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="muestra.title"/></title>
    </head>
    <body>
        <div align="center">
            <h1><bean:message key="muestra.heading"/></h1>  
            <table>
                <tr>
                    <td><bean:message key="muestra.codigo"/></td>
                    <td><bean:write name="empleado" property="codigo" /></td>
                </tr>
                <tr>
                    <td><bean:message key="muestra.nombre"/></td>
                    <td><bean:write name="empleado" property="nombre" /></td>
                </tr>
                <tr>
                    <td><bean:message key="muestra.apellido"/></td>
                    <td><bean:write name="empleado" property="apellido" /></td>
                </tr>
                <tr>
                    <td><bean:message key="muestra.fnacimiento"/></td>
                    <td><bean:write name="empleado" property="fnacimiento" /></td>
                </tr>
                <tr>
                    <td><bean:message key="muestra.salario"/></td>
                    <td><bean:write name="empleado" property="salario" /></td>
                </tr>
            </table>
            <a href="/Practica1BDStruts/index.jsp">
                <bean:message key="welcome.volver" />
            </a>
        </div>
    </body>
</html>

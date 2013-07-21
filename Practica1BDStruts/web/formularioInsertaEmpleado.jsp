<%-- 
    Document   : formularioInsertaEmpleado
    Created on : 21-jul-2013, 14:06:34
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="formulario.inserta.title"/></title>
    </head>
    <body>
        <div align="center">
            <h1><bean:message key="formulario.inserta.heading"/></h1>
            <form action="EmpleadoInsertaAction.do" method="post">
                <table>
                    <tr>
                        <td><bean:message key="muestra.codigo"/></td>
                        <td><input type="text" name="codigo"/></td>
                    </tr>
                    <tr>
                        <td><bean:message key="muestra.nombre"/></td>
                        <td><input type="text" name="nombre"/></td>
                    </tr>
                    <tr>
                        <td><bean:message key="muestra.apellido"/></td>
                        <td><input type="text" name="apellido"/></td>
                    </tr>
                    <tr>
                        <td><bean:message key="muestra.fnacimiento"/></td>
                        <td><input type="text" name="fnacimiento" value="1900-12-31"/></td>
                    </tr>
                    <tr>
                        <td><bean:message key="muestra.salario"/></td>
                        <td><input type="text" name="salario"/></td>
                    </tr>
                </table>
                <br>
                <input type="submit" name="insertaEmpleado" 
                       value="<bean:message key="formulario.inserta.boton"/>"/>
            </form>
            <html:errors property="codigo" />
            <html:errors property="nombre" />
            <html:errors property="apellido" />
            <html:errors property="fnacimiento" />
            <html:errors property="salario" />
        </div>
    </body>
</html>

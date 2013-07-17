<%-- 
    Document   : formulario1
    Created on : 17-jul-2013, 21:13:35
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
    </head>
    <body>
        <h1><bean:message key="welcome.ask"/></h1>
        <form action="LoginAction.do" method="post">
            <table>
                <tr>
                    <td><bean:message key="welcome.user"/></td>
                    <td><input type="text" name="usuario"></td>
                </tr>
                <tr>
                    <td><bean:message key="welcome.key"/></td>
                    <td><input type="text" name="clave"></td>
                </tr>                
            </table>            
            <br>            
            <input type="submit" name="Aceptar">
        </form>
        <br>
        <html:errors property="usuario" />
        <html:errors property="clave" />
    </body>
</html>

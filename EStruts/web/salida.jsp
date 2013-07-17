<%-- 
    Document   : salida
    Created on : 17-jul-2013, 21:29:19
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
    </head>
    <body>
        <h1><bean:message key="welcome.heading"/></h1>
        <bean:message key="welcome.message"/>
        <br><br>
        <strong><bean:message key="welcome.info"/></strong>
        <br>
        <table>
            <tr>
                <td><bean:message key="welcome.user"/></td>
                <td><bean:write name="LoginActionForm" property="usuario" /></td>
            </tr>
            <tr>
                <td><bean:message key="welcome.key"/></td>
                <td><bean:write name="LoginActionForm" property="clave" /></td>
            </tr>
        </table>
        
    </body>
</html>

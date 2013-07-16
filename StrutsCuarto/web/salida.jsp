<%-- 
    Document   : salida
    Created on : 14-jul-2013, 14:12:50
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
        <title><bean:message key="welcome.title"/></title>
    </head>
    <body>
        <h1><bean:message key="welcome.heading"/></h1>
        <br>
        <bean:message key="welcome.message"/>
        <br>
        <bean:write name="SegundoActionForm" property="mensaje" /></h2>
    </body>
</html>

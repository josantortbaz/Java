<%-- 
    Document   : salida
    Created on : 12-jul-2013, 22:19:38
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Salida del action form</h1>
        <h2> 
            <bean:write name="PrimerActionForm" property="mensaje"/>
        </h2>
    </body>
</html>

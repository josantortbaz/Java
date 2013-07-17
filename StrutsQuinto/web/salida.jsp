<%-- 
    Document   : salida
    Created on : 17-jul-2013, 17:42:30
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Resultado</title>
    </head>
    <body>
        <h1>Resultado!</h1>
        <logic:notEmpty name="SumaActionForm" property="resultado">
            <p> <strong>El resultado es:</strong>
                <bean:write name="SumaActionForm" property="resultado" />
            </p>
            <logic:equal name="SumaActionForm" property="resultado" value="15" >
                ¡Adivinaste el número!
            </logic:equal>
                
            <logic:greaterEqual name="SumaActionForm" property="resultado" value="15" >
                Igual o mayor que 15!
            </logic:greaterEqual>
        </logic:notEmpty>
    </body>
</html>

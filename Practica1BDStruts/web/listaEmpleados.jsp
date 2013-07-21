<%-- 
    Document   : listaEmpleados
    Created on : 21-jul-2013, 17:20:55
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
        <title><bean:message key="lista.title"/></title>
    </head>
    <body>

        <logic:present name="empleados" > 

            <div align ="center">
                <h1><bean:message key="lista.title"/></h1>
                <table border="1">
                    <tr>
                        <td><bean:message key="muestra.codigo"/></td>
                        <td><bean:message key="muestra.nombre"/></td>
                        <td><bean:message key="muestra.apellido"/></td>
                        <td><bean:message key="muestra.fnacimiento"/></td>
                        <td><bean:message key="muestra.salario"/></td>
                    </tr>

                    <logic:iterate id="emp" name="empleados" >
                        <tr>
                            <td><bean:write name="emp" property="codigo" /></td>
                            <td><bean:write name="emp" property="nombre" /></td>
                            <td><bean:write name="emp" property="apellido" /></td>
                            <td><bean:write name="emp" property="fnacimiento" /></td>
                            <td><bean:write name="emp" property="salario" /></td>
                        </tr>
                    </logic:iterate>

                </table>
                <br>
                <a href="/Practica1BDStruts/index.jsp">
                    <bean:message key="welcome.volver" />
                </a>
            </div>
        </logic:present>  
    </body>
</html>

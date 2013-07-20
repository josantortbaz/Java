<!-- Reaprovecho la pagina actual para usarla como inicio de la aplicación web. -->

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: white">
        <div align="center">
            <logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
                <div  style="color: red">
                    ERROR:  Application resources not loaded -- check servlet container
                    logs for error messages.
                </div>
            </logic:notPresent>

            <h3><bean:message key="welcome.heading"/></h3>
            <p><bean:message key="welcome.message"/></p>
            
            <p><a href="/Practica1BDStruts/formularioMuestraEmpleado.jsp">
                <bean:message key="welcome.consultar"/>
            </a></p>
            <p><a href="/Practica1BDStruts/formularioEliminaEmpleado.jsp">
                <bean:message key="welcome.eliminar"/>
            </a></p>
            <p><a href="/Practica1BDStruts/formularioListaEmpleados.jsp">
                <bean:message key="welcome.listar"/>
            </a></p>            
            <p><a href="/Practica1BDStruts/formularioAnadirEmpleado.jsp">
                <bean:message key="welcome.anadir"/>
            </a></p>
            
        </div>
    </body>
</html:html>

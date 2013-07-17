<%-- 
    Document   : formulario1
    Created on : 17-jul-2013, 17:33:57
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Struts</title>
    </head>
    <body>
        <h1>Rellena los siguientes campos:</h1>
    <html:form action="SumaAction.do" method="post" focus="operando1" >
        <br>
        Operando 1: <html:text property="operando1" />
        <br> 
        Operando 2: <html:text property="operando2" />
        <br>
        <table>
            <tr>
                <td><html:submit value="Sumar"/></td>
            </tr>
        </table>
    </html:form>
    </body>
</html>

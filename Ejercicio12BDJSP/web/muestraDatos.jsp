<%-- 
    Document   : muestraDatos
    Created on : 16-jun-2013, 20:03:13
    Author     : JAOrtiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
    </head>
    <body>
        <%
            // Recogemos los datos introducidos en la página index.jsp:
            String codigo = request.getParameter("codigo");
            String clave = request.getParameter("clave");
        %>
        
        <div align="center"> 
            <h1>Muestra datos</h1>
            <p>Los datos introducidos en la página principal son:</p>
            <table>
                <tr>
                    <td>Código:</td>
                    <%-- Mostramos el código en sólo lectura: --%>
                    <td><input type="text" readonly="true"
                               value=<%=codigo%> /></td>
                </tr>
                <tr>
                    <td>Clave:</td>
                    <%-- Mostramos la clave en sólo lectura: --%>
                    <td><input type="text" readonly="true"
                               value=<%=clave%> /></td>
                </tr>
            </table>
            
            <%-- Botón para volver a la página inicial --%>
            <form  action="index.jsp" method="post">
                <input type="submit" name="Submit" value="Inicio" /> 
            </form>  
        </div>
    </body>
</html>

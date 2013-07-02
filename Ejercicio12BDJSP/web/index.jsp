<%-- 
    Document   : index
    Created on : 16-jun-2013, 19:50:40
    Author     : JAOrtiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio JSP</title>
    </head>
    <body>        
        <div align="center" >
            <h1>Ejercicio JSP</h1>
            <p>Introduzca los siguientes datos:</p>
            
            <%-- Formulario para introducir los datos solicitados y que serán leidos
                en la página muestraDatos.jsp --%>
            <form  action="muestraDatos.jsp" method="post">
                <table>
                    <tr>
                        <td>Código:</td>
                        <%-- Campo para recoger el código --%>
                        <td><input type="text" name="codigo" size="35" /></td>
                    </tr>
                    <tr>
                        <td>Clave:</td>
                        <%-- Campo para recoger la clave --%>
                        <td><input type="text" name="clave" size="35" /></td>
                    </tr>
                </table>
                <%-- Botón para hacer la llamada a la página muestraDatos.jsp --%>
                <input type="submit" name="aceptar" value="Aceptar" />
            </form>
        </div>
    </body>
</html>

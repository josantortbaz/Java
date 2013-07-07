<%-- 
    Document   : index
    Created on : 06-jul-2013, 23:06:09
    Author     : JAOrtiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Práctica JSP</title>
    </head>
    <body>
        <div align="center">
            <h1>Buscar empleado</h1> 
            <p>Introduzca el apellido:</p>  
 
            <%-- Formulario para introducir el apellido de un empleado y buscarlo.
            Los datos aquí introducidos se tratarán en la página busqueda.jsp y
            se mostrarán en la página muestra.jsp. --%> 
            <form  action="busqueda.jsp" method="post"> 
                <input type="text" name="apellido" size="35" />
                <%-- Botón enviar para tratar los datos en la página busqueda.jsp --%> 
                <input type="submit" name="boton" value="Continuar" />

                <%-- Si cancelamos, volveremos a esta página, pero esto se tratará 
                también en la página busqueda.jsp --%>
                <input type="submit" name="boton" value="Cancelar" />       
            </form> 
        </div>
    </body>
</html>


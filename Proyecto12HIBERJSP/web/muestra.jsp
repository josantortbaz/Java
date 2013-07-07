<%-- 
    Document   : muestra
    Created on : 06-jul-2013, 23:10:32
    Author     : JAOrtiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="modelo.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Muestra JSP</title>
    </head>
    <body>
        <div align="center">
            <%-- Usamos el Bean que hemos creado en la página Busqueda.jsp y que será
            el que contenga todos los datos: --%> 
            <jsp:useBean id="empleado" scope="session" class="modelo.Empleado" /> 
            <h1> Datos del empleado: </h1> 
            
            <%-- Mostramos los datos del empleado en una tabla: --%> 
            <table>
                <%-- Código --%>
                <tr> 
                    <td>Codigo</td> 
                    <td> 
                        <input name="codigo2" size="35" readonly="true" 
                        value="<jsp:getProperty name="empleado" property="codigo" />" 
                        /> 
                    </td> 
                </tr>
                
                <%-- Nombre --%>
                <tr> 
                    <td>Nombre</td> 
                    <td> 
                        <input name="nombre2" size="35" readonly="true" 
                        value="<jsp:getProperty name="empleado" property="nombre" />" 
                        /> 
                    </td> 
                </tr> 
                
                <%-- Apellido --%>
                <tr> 
                    <td>Apellido</td> 
                    <td> 
                        <input name="apellido2" size="35" readonly="true" 
                        value="<jsp:getProperty name="empleado" property="apellido" />" 
                        /> 
                    </td> 
                </tr> 
                
                <%-- Salario --%>
                <tr> 
                    <td>Salario</td> 
                    <td> 
                        <input name="salario2" size="35" readonly="true" 
                        value="<jsp:getProperty name="empleado" property="salario" />" 
                        /> 
                    </td> 
                </tr>
                
                <%-- Fecha de nacimiento --%>
                <tr> 
                    <td>Fecha</td> 
                    <td> 
                        <input name="fecha2" size="35" readonly="true" 
                        value="<jsp:getProperty name="empleado" property="fec_nacimiento" />" 
                        /> 
                    </td> 
                </tr> 
      
                <%-- Campo añadido para la dirección: --%>
                <tr>    
                    <td>Direccion</td> 
                    <td> 
                        <input name="direccion2" size="35" readonly="true"
                        value="<jsp:getProperty name="empleado" property="direccion" />" 
                        /> 
                    </td> 
                </tr>
                <%-- Fin campo dirección --%>
                
            </table> 
        
            <br /><br /> 
   
            <%-- Formulario con un botón para volver a la página principal index.jsp --%> 
            <form  action="index.jsp" method="post"> 
                <input type="submit" name="Submit" value="Página de inicio" />
            </form>  
        </div>
    </body>
</html>


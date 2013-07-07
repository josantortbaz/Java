<%-- 
    Document   : busqueda
    Created on : 06-jun-2013, 23:13:04
    Author     : JAOrtiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="DAO.*" %> 
<%@ page import="modelo.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Búsqueda JSP</title>
    </head>
    <body>
        <%-- Bean de tipo Empleado para tratar los datos obtenidos y que se 
        deberán mostrar en la página muestra.jsp--%>
        <jsp:useBean id="empleado" scope="session" class="modelo.Empleado" /> 
 
        <% 
            // Si se ha pulsado en cancelar, volvemos a la página index.jsp: 
            if(request.getParameter("boton").equals("Cancelar")) { 
        %> 
        <jsp:forward page="index.jsp"/> 
        <% 
            }  
            // Sino, recogeremos el apellido introducido:
            String ap = request.getParameter("apellido"); 
            // Creamos una nueva instancia para trabajar con la BBDD:
            EmpleadosDAO ed = new EmpleadosDAO(); 
            // Y un nuevo Empleado, donde se guardarán los datos:
            Empleado emp; 
            try { 
                // Obtenemos el empleado:  
                emp = ed.obtenEmpleado(ap); 
            } catch (Exception e) { 
                // Tratamos la posible excepción del acceso a BBDD: 
                throw new javax.servlet.ServletException(
                        "Error al leer el empleado: ", e); 
            }
            // Si el empleado existe en la base de datos, copiamos todos los datos
            // a la instancia de la clase Empleado: 
            if(emp != null) { 
              // Copia sus atributos al bean cancion 
              empleado.setCodigo(emp.getCodigo()); 
              empleado.setNombre(emp.getNombre());
              empleado.setApellido(emp.getApellido());
              empleado.setSalario(emp.getSalario());                   
              empleado.setFec_nacimiento(emp.getFec_nacimiento());
              empleado.setDireccion(emp.getDireccion());
        %> 
        <%-- Una vez tenemos los datos, llamamos a la página muestra.jsp,
        donde se mostrarán los datos obtenidos con un cierto formato: --%> 
        <jsp:forward page="muestra.jsp" /> 
        <% 
            }     
        %>       
    </body>
</html>


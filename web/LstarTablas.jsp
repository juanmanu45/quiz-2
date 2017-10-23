<%-- 
    Document   : LstarTablas
    Created on : 22/10/2017, 07:10:39 PM
    Author     : Juan Manuel
--%>

<%@page import="VO.Tabla"%>
<%@page import="java.util.ArrayList"%>
<%@page import="VO.Esquema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
               <h1>Registro de Esquemas</h1>
                    <table>
                        <tr>
                            <td>ID TABLA</td>
                            <td>NOMBRE TABLA</td>
                            <td>ESQUEMA AL QUE PERTENECE </td>
                            
                        </tr>
                        <%
                            if (request.getAttribute("lis") != null) {
                                ArrayList<Tabla> Tablas = (ArrayList<Tabla>) request.getAttribute("lis");

                                if (Tablas != null) {
                                    for (Tabla t: Tablas) {

                        %>
                        <h1></h1>
                        <tr>  
                            <td><%=t.getId_tabla()%></td>
                            <td><%=t.getNombre_Tabla()%></td>
                             <td><%=t.getId_esquema()%></td>
                        </tr>

                        <%

                                    }
                                }
                            }
                        %>

                    </table>
    </body>
</html>

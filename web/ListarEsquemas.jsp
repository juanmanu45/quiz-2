<%-- 
    Document   : ListarEsquemas
    Created on : 18/10/2017, 01:52:21 AM
    Author     : Juan Manuel
--%>

<%@page import="VO.Esquema"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
               <h1>Registro de libros</h1>
                    <table>
                        <tr>
                            <td>ID</td>
                            <td>NOMBRE</td>
                            
                        </tr>
                        <%
                            if (request.getAttribute("lis") != null) {
                                ArrayList<Esquema> esquemas = (ArrayList<Esquema>) request.getAttribute("lis");

                                if (esquemas != null) {
                                    for (Esquema es: esquemas) {

                        %>
                        <h1></h1>
                        <tr>  
                            <td><%=es.getId_esquema()%></td>
                            <td><%=es.getVarchar()%></td>
                           
                        </tr>

                        <%

                                    }
                                }
                            }
                        %>

                    </table>
    </body>
</html>

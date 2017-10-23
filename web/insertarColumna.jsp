<%-- 
    Document   : insertarColumna
    Created on : 2/10/2017, 07:01:18 PM
    Author     : Juan Manuel
--%>

<%@page import="VO.Tabla"%>
<%@page import="java.util.ArrayList"%>
<%@page import="VO.Esquema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingresar tabla nueva</h1>
        
        
        <%
                        if (request.getAttribute("resultado") != null) {
                            Boolean resultado = (Boolean) request.getAttribute("resultado");
                            if (resultado.booleanValue() == true) {
                    %>
                    <h2> se ha registrado de manera exitosa</h2>
                    <%
                    } else {
                    %>     
                    <h2> llene los campos correctamente </h2>
                    <%
                            }
                        }
                    %>
        
        <form action="InserTabla" method="POST">
            <div class="form_settings">
                <p><span>Nombre Columna</span>
                    <input class="contact" type="text" name="name" value="" /></p>

                <p><span>Tabla</span>
                    <select class="contact" name="nombreTabla" >
                        <%
                            //Si la variable que me deben enviar existe  
                            if (request.getAttribute("lis") != null) {
                                //Capturando informacion variable que me estan enviado.    
                                ArrayList<Tabla> tablas = (ArrayList<Tabla>) request.getAttribute("lis");
                                //Existan activos
                                if (tablas != null) {
                                    for (Tabla li :tablas) {
                        %>
                        <option value="<%=li.getNombre_Tabla()%>"><%=li.getNombre_Tabla()%>

                        </option>
                        <%
                            }
                        } else {
                        %>
                        <h1>inserte un esquema</h1>
                        <%
                                }
                            }

                        %>

                    </select>
                </p>
                <p><span>Numero De Registro</span>
                    <input class="contact" type="text" name="idCol" value="" />
                </p>
                <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="contact_submitted" value="submit" /></p>
            </div>
        </form>
    </body>
</html>


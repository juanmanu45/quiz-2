<%-- 
    Document   : inUnidad
    Created on : 23/10/2017, 03:21:38 AM
    Author     : Juan Manuel
--%>

<%@page import="VO.Tabla"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <p><span>idu</span>
                    <input class="contact" type="text" name="id_u" value="" /></p>

                <p><span>Esquema</span>
                    <select class="contact" name="nombreTabla" >
                        <%
                            //Si la variable que me deben enviar existe  
                            if (request.getAttribute("lis") != null) {
                                //Capturando informacion variable que me estan enviado.    
                                ArrayList<Tabla> esquemas = (ArrayList<Tabla>) request.getAttribute("lis");
                                //Existan activos
                                if (esquemas != null) {
                                    for (Tabla li : esquemas) {
                        %>
                        <option value="<%=li.getNombre_Tabla() %>"><%=li.getNombre_Tabla() %>

                        </option>
                        <%
                            }
                        } else {
                        %>
                        <h1>inserte una tabla</h1>
                        <%
                                }
                            }

                        %>

                    </select>
                </p>
                <p><span>Numero De contexto</span>
                    <input class="contact" type="text" name="id_contexto" value="" />
                </p>
                <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="contact_submitted" value="submit" /></p>
            </div>
        </form>
    </body>
</html>
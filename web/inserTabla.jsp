<%-- 
    Document   : inserTabla
    Created on : 18/10/2017, 02:48:23 AM
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
                <p><span>Nombre tabla</span>
                    <input class="contact" type="text" name="name" value="" /></p>

                <p><span>Esquema</span>
                    <select class="contact" name="nombreEsquema" >
                        <%
                            //Si la variable que me deben enviar existe  
                            if (request.getAttribute("lis") != null) {
                                //Capturando informacion variable que me estan enviado.    
                                ArrayList<Esquema> esquemas = (ArrayList<Esquema>) request.getAttribute("lis");
                                //Existan activos
                                if (esquemas != null) {
                                    for (Esquema li : esquemas) {
                        %>
                        <option value="<%=li.getVarchar()%>"><%=li.getVarchar()%>

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
                    <input class="contact" type="text" name="idTabla" value="" />
                </p>
                <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="contact_submitted" value="submit" /></p>
            </div>
        </form>
    </body>
</html>

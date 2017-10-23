/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.ServiciosEsquema;
import DAO.ServiciosTabla;
import DAO.ServiciosUnidad;
import VO.Esquema;
import VO.Tabla;
import VO.Unidad;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Manuel
 */
public class InsertarUnidad extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher rq = request.getRequestDispatcher("inserUnidad.jsp");
            ServiciosTabla ser = new ServiciosTabla();
            ArrayList<Tabla> lis = null;
            lis = (ArrayList<Tabla>) ser.listarTablas();
            if (lis.size() > 0) {

                request.setAttribute("lis", lis);
            } else {
                request.setAttribute("lis", null);
            }
            rq.forward(request, response);

        }
  
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        boolean resultado = false;

        ServiciosTabla ser = new ServiciosTabla();

        String nombre = request.getParameter("nombreTabla");
        String id = request.getParameter("id_contexto");
        String idu = request.getParameter("id_u");

        int id_con = Integer.parseInt(id);
        int id_u=Integer.parseInt(idu);

        if (id.trim().length() > 0 && nombre.trim().length() > 0 && nombre.trim().length() > 0) {

            resultado = true;

            Tabla es=new Tabla();
            

            ServiciosUnidad st = new ServiciosUnidad();

            es = ser.extraerTabla(nombre);

            Unidad u= new Unidad(id_u, id_con, es.getId_tabla());
            st.agragarUnidad(u);

            RequestDispatcher rq = request.getRequestDispatcher("inUnidad.jsp");

            if (resultado == true) {
                request.setAttribute("resultado", true);
            } else {
                request.setAttribute("resultado", false);
            }

            rq.forward(request, response);
        } else {
            request.setAttribute("resultado", false);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

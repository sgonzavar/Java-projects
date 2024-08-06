/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author salak404
 */
@WebServlet(name = "Servlet_1", urlPatterns = {"/Servlet_1"})
public class Servlet_1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
           String Datolistado, DatoOpcion, DatoCheck[]; 
            
            
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            
            out.println("<head>");
            out.println("<title>Servlet Servlet_1</title>");            
            out.println("</head>");
            
            out.println("<body>");
            
            Datolistado = request.getParameter("cmbColor");
            DatoOpcion = request.getParameter("optSistemaOperativo");
            DatoCheck = request.getParameterValues("chkChequeo");
            
            
            out.println("<h1>El Color que selecciono fue:  "+ Datolistado+ " </h1>");
            out.println("<br>");
            out.println("<h1>El Sistema operativo que selecciono fue:  "+ DatoOpcion+ " </h1>");
            out.println("<br>");
            out.println("<h1>Listado De opciones Chequeados:</h1>");
            out.println("<br>");
            
            for (int pos = 0; pos < DatoCheck.length; pos++) {
                
                out.println("<h1>" + DatoCheck[pos] + "</h1>");
                out.println("<br>");
            }
            
            
        }catch(Exception ex){
            
            String Mensaje;
            Mensaje = ex.getMessage();
            if(Mensaje == null){
            
                out.println("Debe Aceptar los terminos del contrato");
            }
            
            out.println("<br>");
        
            
        }
            out.println("<a href=index.jsp>Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
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

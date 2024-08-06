package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Clases.NewClass;
        

@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int primerNumero, segundoNumero,Resultado;
        NewClass nw = new NewClass();
        
        try  {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            
            out.println("</head>");
            out.println("<body>");
            
            primerNumero = Integer.parseInt(request.getParameter("txtnum1"));
            segundoNumero = Integer.parseInt(request.getParameter("txtnum2"));
            
            nw.setPrimerNumero(primerNumero);
            nw.setSegundoNumero(segundoNumero);
            
            if(request.getParameter("btnSuma") != null){
            
                Resultado = nw.suma();
                out.println("<h1>El resultado de la suma es: " + Resultado +" </h1>");
                out.println("<br>");
                out.println("<a href=newjsp.jsp>Volver al inicio</a>");
            }else {
            
                 Resultado = nw.dividir();
                out.println("<h1>El resultado de la divicion es: " + Resultado +" </h1>");
                out.println("<br>");
                out.println("<a href=newjsp.jsp>Volver al inicio</a>");
            }
            
            out.println("<h1></h1>");
            
        } catch(NumberFormatException nfe){
             
                out.println("<h3> Ingreso incorrectamente un numero..</h3>");
                out.println("<br>");
                out.println("<a href=newjsp.jsp>Volver al inicio</a>");
            
        
        }catch(Exception ex){
            
                out.println("<h3> Error: " + ex.getMessage() + "</h3>");
                out.println("<br>");
                out.println("<h3> Consulte el admin..</h3>");
                out.println("<br>");
                out.println("<a href=newjsp.jsp>Volver al inicio</a>");
   
        }
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

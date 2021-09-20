/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author krzysiek
 */
public class Wejscie extends HttpServlet {

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
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Wejscie</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='color:red'>Formularz zgłoszeniowy</h1>");
            out.println("<div style='color:blue' style='text-align: justify'>"); 
            out.println("<form action='Wyjscie' method='post'>");
            out.println("<h1 style='word-spacing: 65px'>");
            out.println("<label>Imię:</label> <input type='text' name='imie'>");
            out.println("</h1>");
            out.println("<h1>"); 
            out.println("<label>Nazwisko:</label> <input type='text' name='nazwisko'>");
            out.println("</h1>");
            out.println("<h1 style='word-spacing: 60px'>Płeć: ");
            out.println("<input type='radio' name='plec' value='Kobieta'>K ");
            out.println("<input type='radio' name='plec' value='Mężczyzna'>M ");
            out.println("</h1>");

            out.println("<h1>Kurs: ");
            out.println("<input type='checkbox' name='Kurs' value='PHP'> PHP "); 
            out.println("<input type='checkbox' name='Kurs' value='C++'> C++ "); 
            out.println("<input type='checkbox' name='Kurs' value='JAVA'>Java ");
            out.println("</h1>");
            out.println("<h1>Region: ");
            out.println("<select name='select'>");
            out.println("<option>Dolnośląskie</option>");
            out.println("<option>Kujawsko-Pomorksie</option>");
            out.println("<option>Lubelskie</option>");
            out.println("<option>Lubuskie</option>");
            out.println("<option>Łódzkie</option>");
            out.println("<option>Małopolskie</option>");
            out.println("<option>Mazowieckie</option>\n");
            out.println("<option>Opolskie</option>");
            out.println("<option>Podkarpackie</option>");
            out.println("<option>Podlsakie</option>");
            out.println("<option>Pomorskie</option>");
            out.println("<option>Śląskie</option>");
            out.println("<option>Świętokrzyskie</option>");
            out.println("<option>Warmińsko-Mazurskie</option>");
            out.println("<option>Wielkopolskie</option>");
            out.println("<option>Zachodniopomorskie</option>");
            out.println("</select>");
            out.println("</h1>");
            out.println("<h1>Uwagi:   <textarea name='texarea'></textarea>");
            out.println("</h1>");
            out.println("<input type='submit' value='Wyślij formularz'>");
            out.println("<input type='reset' value='Wyczyść dane'>");
            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
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

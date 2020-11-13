/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
/*
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
*/
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.swing.JOptionPane;
import model.FichaGS;
import model.Gestionficha;



@WebServlet(name = "Sficha", urlPatterns = {"/Sficha"})
public class Sficha extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        if (request.getParameter("registrarf") != null) {
            this.registrarficha(request, response);
        }
        if (request.getParameter("eliminar") != null) {
            this.eliminar(request, response);
        }
    }

    protected void registrarficha(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String d, n, c, f, t, u;
        boolean x;
        d = request.getParameter("codigo");
        n = request.getParameter("programa");
        c = request.getParameter("nivel");
        f = request.getParameter("inicio");
        t = request.getParameter("fin");
        u = request.getParameter("doc");

        FichaGS cli = new FichaGS(d, n, c, f, t, u);
        Gestionficha gc = new Gestionficha();
        x = gc.insertficha(cli);
        if (x) {
            JOptionPane.showMessageDialog(null, "Ficha Registrada");
            response.sendRedirect("vistas/instructor/fichas.jsp");
        } else {
            JOptionPane.showMessageDialog(null, "Ficha no Registrada");
            response.sendRedirect("vistas/instructor/fichas.jsp");
        }

    }
    protected void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
                String cod;
                
                cod=request.getParameter("codigo");
                
                FichaGS cli=new FichaGS(cod);
                Gestionficha crud=new Gestionficha();
                
                int x=0;
                x=crud.eliminar(cli);
                
                if (x==1) {
                    response.sendRedirect("vistas/instructor/fichas.jsp");
                }else{
                    JOptionPane.showMessageDialog(null, "Datos no eliminados");
                    response.sendRedirect("vistas/instructor/fichas.jsp");
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
            
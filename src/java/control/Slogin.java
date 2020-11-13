package control;

/*
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
*/
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.swing.JOptionPane;
import model.Login;
import model.LoginGS;

/**
 *
 * @author ALEXANDER PENAGOS
 */
@WebServlet(name = "Slogin", urlPatterns = {"/Slogin"})
public class Slogin extends HttpServlet {

    String usu, cla, rol, gen, doc, cons, vacio = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        cons = request.getParameter("Rol");

        if (cons.equals("aprendiz")) {
            if (request.getParameter("ingresar") != null) {
                this.aprendiz(request, response);
            }
        } else {
            if (request.getParameter("ingresar") != null) {
                this.instructor(request, response);
            }
        }

    }

    protected void aprendiz(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String u, c, bie;
        ArrayList<LoginGS> listaap = new ArrayList<>();
        u = request.getParameter("name");
        c = request.getParameter("pass");

        LoginGS lo = new LoginGS(u, c);
        Login lom = new Login();
        listaap = lom.loginap(lo);

        if (listaap.size() > 0) {
            for (int i = 0; i < listaap.size(); i++) {
                lo = listaap.get(i);

                usu = lo.getUsu();
                cla = lo.getCont();
                doc = lo.getDocumento();
            }

            if (usu.equals(u) && cla.equals(c)) {
                bie = "BIENVENIDO";
                HttpSession ses = request.getSession();
                
                ses.setAttribute("llevarol", bie);
                response.sendRedirect("vistas/aprendiz/principal.jsp");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Contactese con sofia plus");
            response.sendRedirect("index.jsp");
        }

    }

    protected void instructor(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String u, c, bie;
        ArrayList<LoginGS> lista = new ArrayList<>();

        u = request.getParameter("name");
        c = request.getParameter("pass");

        LoginGS lo = new LoginGS(u, c);
        Login lom = new Login();
        lista = lom.loginin(lo);

        if (lista.size() > 0) {
            for (int i = 0; i < lista.size(); i++) {
                lo = lista.get(i);

                usu = lo.getUsu();
                cla = lo.getCont();
                doc = lo.getDocumento();

            }
            if (usu.equals(u) && cla.equals(c)) {
                bie = "BIENVENIDO";
                HttpSession ses = request.getSession();
                 ses.setAttribute("llevadoc", doc);
                ses.setAttribute("llevarol", bie);
                response.sendRedirect("vistas/instructor/instructor.jsp");
            }
        } else {

            JOptionPane.showMessageDialog(null, "contactese con sofia plus");
            response.sendRedirect("index.jsp");
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

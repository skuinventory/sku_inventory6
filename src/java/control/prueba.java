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
import model.AprendizGS;
import model.Gestionaprendiz;

@WebServlet(name = "prueba", urlPatterns = {"/prueba"})
public class prueba extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if (request.getParameter("InsAprendiz") != null) {
            this.insertaraprendiz(request, response);
        }
        
        if (request.getParameter("Eliminar")!=null) {
            this.eliminar(request, response);
        }
    }

    protected void insertaraprendiz(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String d, n, a, c, f, t, u, p, con;
        boolean x;
        f = request.getParameter("documento");
        d = request.getParameter("nombre");
        n = request.getParameter("apellido");
        a = request.getParameter("ficha");
        c = request.getParameter("telefono");
        t = request.getParameter("email");
        u = request.getParameter("usuario");

        p = request.getParameter("contra");

        AprendizGS cli = new AprendizGS(d, n, a, c, f, t, u, p);
        Gestionaprendiz gc = new Gestionaprendiz();
        x = gc.insertaprendiz(cli);

        if (x) {
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
        } else {
            JOptionPane.showMessageDialog(null, "Verifique que los datos sean correctos");
        }
        response.sendRedirect("vistas/instructor/aprendices.jsp");
    
    }
    
    protected void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
                String cod;
                
                cod=request.getParameter("documento");
                
                AprendizGS cli=new AprendizGS(cod);
                Gestionaprendiz crud=new Gestionaprendiz();
                
                int x=0;
                x=crud.eliminar(cli);
                
                if (x==1){
                    response.sendRedirect("vistas/instructor/aprendices.jsp");
                }else{
                    JOptionPane.showMessageDialog(null, "Datos no eliminados ");
                    response.sendRedirect("vistas/instructor/aprendices.jsp");
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

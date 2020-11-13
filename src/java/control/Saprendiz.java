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
import model.AprendizGS;
import model.Gestionaprendiz;
import model.Gestionusuario;
import model.InstructorGS;
import model.Login;
import model.LoginGS;
import model.UsuarioGS;

/**
 *
 * @author ALEXANDER PENAGOS
 */
@WebServlet(name = "Saprendiz", urlPatterns = {"/Saprendiz"})
public class Saprendiz extends HttpServlet {

    String usu, cla, rol, gen, doc, cons, vacio = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        if (request.getParameter("registrara") != null) {
            this.registrarapre(request, response);
        }

        cons = request.getParameter("Rol");

        if (cons.equals("aprendiz")) {
            if (request.getParameter("buscar") != null) {
                this.buscaraprendiz(request, response);
            }
        } else {
            if (request.getParameter("buscar") != null) {
                this.buscarinstructor(request, response);
            }
        }

        

    }

    protected void registrarapre(HttpServletRequest request, HttpServletResponse response)
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
        con = request.getParameter("confirmar");

        if (p.equals(con)) {
            AprendizGS cli = new AprendizGS(d, n, a, c, f, t, u, p);
            Gestionaprendiz gc = new Gestionaprendiz();
            x = gc.insertaprendiz(cli);

            if (x) {
                JOptionPane.showMessageDialog(null, "Usuario Registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Verifique que los datos sean correctos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void buscaraprendiz(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String u, c, bie;
        ArrayList<AprendizGS> listaap = new ArrayList<>();
        u = request.getParameter("documento");

        AprendizGS lo = new AprendizGS(u);
        Gestionusuario lom = new Gestionusuario();
        listaap = lom.listaapr(lo);

        if (listaap.size() > 0) {
            for (int i = 0; i < listaap.size(); i++) {
                lo = listaap.get(i);
                doc = lo.getDocumento();
            }

            if (doc.equals(u)) {
                bie = "SI";
                c = doc;
                HttpSession ses = request.getSession();
                ses.setAttribute("llevadoc", c);
                response.sendRedirect("vistas/aprendiz/raprendiz.jsp");

            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra inscrito contactese con sofia plus");
            response.sendRedirect("index.jsp");
        }

    }

    protected void buscarinstructor(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String u, c, bie;
        ArrayList<InstructorGS> listain = new ArrayList<>();
        u = request.getParameter("documento");

        InstructorGS lo = new InstructorGS(u);
        Gestionusuario lom = new Gestionusuario();
        listain = lom.listains(lo);

        if (listain.size() > 0) {
            for (int i = 0; i < listain.size(); i++) {
                lo = listain.get(i);
                doc = lo.getDocumento();
            }

            if (doc.equals(u)) {
                bie = "SI";
                c = doc;
                HttpSession ses = request.getSession();
                ses.setAttribute("llevarol", bie);
                ses.setAttribute("llevadoc", c);
                response.sendRedirect("vistas/instructor/rinstructor.jsp");

            }
        } else {
            JOptionPane.showMessageDialog(null, "no se encuentra inscrito contactese con sofia plus");
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

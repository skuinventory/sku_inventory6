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
import model.AprendizGS;
import model.Gestionaprendiz;
import model.Gestioninstructor;
import model.InstructorGS;

/**
 *
 * @author ALEXANDER PENAGOS
 */
@WebServlet(name = "Sinstructor", urlPatterns = {"/Sinstructor"})
public class Sinstructor extends HttpServlet {

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
            if(request.getParameter("registrari")!=null){
              this.registrarinstr(request, response);
            }
    }
    
    protected void registrarinstr (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         
           
            String d,n,c,f,t,u,p, con;
            boolean x;
            d=request.getParameter("documento");
            n=request.getParameter("nombre");
            c=request.getParameter("apellido");
            f=request.getParameter("telefono");
            t=request.getParameter("email");
            u=request.getParameter("usuario");
            
            
            p=request.getParameter("contra");
            con=request.getParameter("confirmar");
            
            if (p.equals(con)) {
               
                InstructorGS cli=new InstructorGS(n, c, f, t, d, u, p);
                Gestioninstructor gc=new Gestioninstructor();
                x=gc.insertinstructor(cli);
                if(x){
                    JOptionPane.showMessageDialog(null, "Usuario Registrado");
                    response.sendRedirect("index.jsp");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Verifique que los datos sean correctos");
                    response.sendRedirect("index.jsp");
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");    
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

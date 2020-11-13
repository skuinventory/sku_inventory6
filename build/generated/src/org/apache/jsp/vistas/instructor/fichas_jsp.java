package org.apache.jsp.vistas.instructor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fichas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SKU inventory-Instructor</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"../../style/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../../style/css/instructor-fichas.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <label class=\"logo\"><img src=\"../../img/logosku.png\" width=\"150px\"></label>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <!--Menu de navegacion-->\n");
      out.write("        <div class=\"navegacion\">\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"instructor.jsp\" class=\"active\">\n");
      out.write("                        <span class=\"icon\"></span><i class=\"fa fa-home\" aria-hidden=\"true\"></i>\n");
      out.write("                        <span class=\"title\">Inicio</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>      \n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <a href=\"fichas.jsp\">\n");
      out.write("                        <span class=\"icon\"></span><i class=\"fa fa-plus\" aria-hidden=\"true\"></i>\n");
      out.write("                        <span class=\"title\">Fichas</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <span class=\"icon\"></span><i class=\"fa fa-eye\" aria-hidden=\"true\"></i></i>\n");
      out.write("                        <span class=\"title\">Aprendices</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <span class=\"icon\"></span><i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\n");
      out.write("                        <span class=\"title\">Contraseña</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <span class=\"icon\"></span><i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("                        <span class=\"title\">Configuración</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"../../index.jsp\">\n");
      out.write("                        <span class=\"icon\"></span><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i>\n");
      out.write("                        <span class=\"title\">Salir</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-none col-block-sm toggle\" onclick=\"menu()\"></div>\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("        <div class=\"col-10 col-xl-11 contenedor\">\n");
      out.write("            <div class=\"col-11 col-xl-2\">\n");
      out.write("                <h4>Registro de Fichas</h4>\n");
      out.write("                <form action=\"\" method=\"POST\">\n");
      out.write("                    <label><strong>Codigo: </strong></label><br>\n");
      out.write("                    <input type=\"text\" pattern=\"[0-9]+\" name=\"codigo\" required><br>\n");
      out.write("                    \n");
      out.write("                    <label><strong>Programa: </strong></label><br>\n");
      out.write("                    <input type=\"texto\" name=\"programa\" required><br>\n");
      out.write("                    \n");
      out.write("                    <label><strong>Nivel de Formacion: </strong></label><br>\n");
      out.write("                    <input type=\"text\" name=\"nivel\" required><br>\n");
      out.write("                    \n");
      out.write("                    <label><strong>Fecha Inicio: </strong></label><br>\n");
      out.write("                    <input type=\"date\" name=\"inicio\" required><br>\n");
      out.write("                    \n");
      out.write("                    <label><strong>Fecha Finalización: </strong></label><br>\n");
      out.write("                    <input type=\"date\" name=\"fin\" required><br>\n");
      out.write("                    \n");
      out.write("                    <label><strong>Instructor: </strong></label><br>\n");
      out.write("                    <input type=\"number\" name=\"director\"  value=\"123\" hidden><br>\n");
      out.write("                    \n");
      out.write("                    <input type=\"submit\" name=\"registoficha\" value=\"Agregar\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-10\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            Creado por SKU INVENTORY. <br>Todos los derechos reservados &copy; 2020\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\t\tfunction menu() {\n");
      out.write("\t\t\tlet navegacion= document.querySelector(\".navegacion\")\n");
      out.write("\t\t\tnavegacion.classList.toggle('active');\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

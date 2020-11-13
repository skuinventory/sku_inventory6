<%-- 
    Document   : instrutor
    Created on : 3/08/2020, 01:19:19 AM
    Author     : andre
--%>

<%@page import="model.Gestionficha"%>
<%@page import="model.FichaGS"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Gestioninstructor"%>
<%@page import="model.InstructorGS"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String doc;
            HttpSession datos=request.getSession();
            doc=(String) datos.getAttribute("llevadoc");
            datos.setAttribute("llevadoc", doc);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SKU inventory</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="../../style/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../style/css/instructor-fichas.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <header class="sticky-top">
            <label class="logo" ><img src="../../img/logosku.png" width="150px"></label>

        </header>

        <!--Menu de navegacion-->
        <div class="navegacion">
            <ul>
                <li>
                    <a href="../../vistas/instructor/instructor.jsp" class="active">
                        <span class="icon"></span><i class="fa fa-home" aria-hidden="true"></i>
                        <span class="title">Inicio</span>
                    </a>
                </li>      

                <li>
                    <a href="fichas.jsp">
                        <span class="icon"></span><i class="fa fa-plus" aria-hidden="true"></i>
                        <span class="title">Fichas</span>
                    </a>
                </li>
                <li>
                    <a href="../../vistas/instructor/aprendices.jsp">
                        <span class="icon"></span><i class="fa fa-eye" aria-hidden="true"></i></i>
                        <span class="title">Aprendices</span>
                    </a>
                </li>
                <li>
                    <a href="../../vistas/instructor/configuracion.jsp">
                        <span class="icon"></span><i class="fa fa-user" aria-hidden="true"></i>
                        <span class="title">Configuración</span>
                    </a>
                </li>
                <li>
                    <a href="../../index.jsp">
                        <span class="icon"></span><i class="fa fa-sign-out" aria-hidden="true"></i>
                        <span class="title">Salir</span>
                    </a>
                </li>
            </ul>
        </div>	

        <div class="col-10 col-xl-11 contenedor">
            <h2>GESTION DE FICHAS</h2>
            <div class="row">
                <div class="col-12 col-md-4 col-lg-4 col-xl-4">
                    <form action="../../Sficha" method="POST">
                        <label><strong>Codigo: </strong></label><br>
                        <input type="text" class="form-control" pattern="[0-9]+" name="codigo" required><br>

                        <label><strong>Programa: </strong></label><br>
                        <input type="text" class="form-control" name="programa" pattern="[a-zA-Z]+" required><br>

                        <label><strong>Nivel de Formacion: </strong></label><br>
                        <input type="text" class="form-control" name="nivel" pattern="[a-zA-Z]+" required><br>

                        <label><strong>Fecha Inicio: </strong></label><br>
                        <input type="date" class="form-control" name="inicio" required><br>

                        <label><strong>Fecha Finalización: </strong></label><br>
                        <input type="date" class="form-control" name="fin" required><br>

                        <label><strong>Documento-Instructor: </strong></label><br>
                        <input type="text" class="form-control" name="doc" value="<%=doc%>" readonly><br>


                        <input type="submit" name="registrarf" class="agregar" value="Agregar">
                    </form>
                        <br>
                </div>

                <div class="col-12 col-md-8 col-lg-8 col-xl-8">
                    <div class="table-wrapper-scroll-y my-custom-scrollbar">
                        <table class="table table-bordered table-striped mb-0">
                            <thead>
                                <th>Codigo</th>
                                <th>Programa</th>
                                <th>Nivel de Formacion</th>
                                <th>Fecha Inicio</th>
                                <th>Fecha Finalización</th>
                                <th></th>
                            </thead>
                            <tbody>
                                <%

                                    ArrayList<FichaGS> listaag=new ArrayList<>();
                                    
                                    FichaGS la=new FichaGS();
                                    Gestionficha lg=new Gestionficha();
                                    listaag=lg.listaficha();
                                      
                                    for(int i=0; i<listaag.size(); i++){
                                        la=listaag.get(i);
                                        
                                        if(la.getInstructor().equals(doc)){
                                %>
                                <tr>
                                    <td><%=la.getCodigo()%></td>
                                    <td><%=la.getPrograma()%></td>
                                    <td><%=la.getNivel()%></td>
                                    <td><%=la.getInicio()%></td>
                                    <td><%=la.getFfinal()%></td>
                                    <td>
                                        <form action="../../Sficha" method="POST" class="formulario">
                                            <input type="hidden" name="codigo" value="<%=la.getCodigo()%>">
                                            <button type="submit" name="Eliminar"><spam class="fa fa-trash eliminar"></spam></button>
                                        </form> 
                                    </td>
                                </tr>
                                <% } }%> 
                            </tbody>
                        </table>
                    </div> 
                </div>
            </div>
        </div>
        <footer>
            Creado por SKU INVENTORY. <br>Todos los derechos reservados &copy; 2020
        </footer>                    
    </body>
</html>

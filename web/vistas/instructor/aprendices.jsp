<%-- 
    Document   : instrutor
    Created on : 3/08/2020, 01:19:19 AM
    Author     : andre
--%>
<%@page import="model.Gestionaprendiz"%>
<%@page import="model.AprendizGS"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Gestionficha"%>
<%@page import="model.FichaGS"%>
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
                    <a href="instructor.jsp" class="active">
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
                    <a href="aprendices.jsp">
                        <span class="icon"></span><i class="fa fa-eye" aria-hidden="true"></i></i>
                        <span class="title">Aprendices</span>
                    </a>
                </li>
                <li>
                    <a href="configuracion.jsp">
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
            <h2>GESTION DE APRENDICES</h2>
            <div class="row">
                <div class="col-12 col-md-4 col-lg-4 col-xl-4">
                    
                    <form action="../../prueba" method="POST" class="cont-form">
                        <label><strong> Documento: </strong></label><br>
                        <input type="text" class="form-control" name="documento" pattern="[0-9]+" required><br>

                        <label><strong> Nombres: </strong></label><br>
                        <input type="text" class="form-control" name="nombre" required><br>

                        <label><strong> Apellidos: </strong></label><br>
                        <input type="text" class="form-control" name="apellido" required><br>

                        <label><strong> Ficha: </strong></label><br>
                        <select name="ficha" required>
                            <option><--Seleccionar--></option>
                            <%
                                ArrayList<FichaGS> lista=new ArrayList();
                                    
                                    FichaGS fi=new FichaGS();
                                    Gestionficha gs=new Gestionficha();
                                    
                                    lista=gs.fichasinstructor();
                                    
                                    if(lista.size()>0){
                                        for(int i=0; i<lista.size(); i++){
                                            fi=lista.get(i);
                                            
                                           if(fi.getInstructor().equals(doc)){
                                                
                            %>
                            <option value="<%=fi.getCodigo()%>"><%=fi.getCodigo()%></option>
                            
                            <%          
                                        } 
                                    } 
                                }
                            %>
                        </select><br>

                        <label><strong> Telefono: </strong></label><br>
                        <input type="text"class="form-control"  name="telefono" pattern="[0-9]+" required><br>

                        <label><strong> Correo Electronico: </strong></label><br>
                        <input type="email" class="form-control" name="email"><br>

                        <label><strong> Usuario: </strong></label><br>
                        <input type="text" class="form-control"  name="usuario" required><br>

                        <label><strong> Contraseña: </strong></label><br>
                        <input type="password" class="form-control" name="contra" required><br>
                        
                        <input type="submit" name="InsAprendiz" class="agregar" value="Registrar">
                    </form> 
                    <br>
                </div>

                <div class="col-12 col-md-8 col-lg-8 col-xl-8">
                    <div class="table-wrapper-scroll-y my-custom-scrollbar">
                        <table class="table table-bordered table-striped mb-0">
                            <thead>
                                <th>Documento</th>
                                <th>Nombres</th>
                                <th>Apellidos</th>
                                <th>Ficha</th>
                                <th>Telefono</th>
                                <th>Correo Electronico</th>
                                <th></th>
                            </thead>
                            <tbody>
                                <%

                                    ArrayList<AprendizGS> listaag=new ArrayList<>();
                                    
                                    AprendizGS la=new AprendizGS();
                                    Gestionaprendiz lg=new Gestionaprendiz();
                                    listaag=lg.listaprendiz();
                                      
                                    for(int i=0; i<listaag.size(); i++){
                                        la=listaag.get(i);
                                        
                                %>
                                <tr>
                                    <td><%=la.getNombre()%></td>
                                    <td><%=la.getApellido()%></td>
                                    <td><%=la.getCorreo()%></td>
                                    <td><%=la.getFicha()%></td>
                                    <td><%=la.getDocumento()%></td>
                                    <td><%=la.getTelefono()%></td>
                                    <td>
                                        <form action="../../prueba" method="POST" class="formulario">
                                            <input type="hidden" name="documento" value="<%=la.getNombre()%>">
                                            <button type="submit" name="Eliminar"><spam class="fa fa-trash eliminar"></spam></button>
                                        </form>
                                    </td>
                                </tr>
                                <% } %>
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

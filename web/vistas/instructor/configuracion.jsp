<%-- 
    Document   : instrutor
    Created on : 3/08/2020, 01:19:19 AM
    Author     : andre
--%>
<%@page import="java.util.ArrayList" %>
<%@page import="model.InstructorGS" %>
<%@page import="model.Gestioninstructor" %>
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
        <link href="../../style/css/configuraciones.css" rel="stylesheet" type="text/css"/>
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
                    <a href="">
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
        
        <br>
        <%
            ArrayList<InstructorGS> lista=new ArrayList();
            
            InstructorGS u=new InstructorGS(doc);
            InstructorGS us=new InstructorGS();
            Gestioninstructor gs=new Gestioninstructor();
            
            lista=gs.listarInstructor(u);
            
            if(lista.size()>0){
                for(int i=0; i<lista.size(); i++){
                    us=lista.get(i);
        %>
        <div class="col-10 col-xl-11 contenedor">
            <h2>Configuracion del perfil</h2>
            <form action="" method="POST" class="cont-form">
                <label><strong> Documento: </strong></label><br>
                <input type="text" name="documento" value="<%=us.getNombre()%>" readonly><br><br>

                <label><strong> Nombre: </strong></label><br>
                <input type="text" name="nombre" pattern="[a-zA-Z]+" value="<%=us.getApellido()%>" required><br><br>

                <label><strong> Apellido: </strong></label><br>
                <input type="text" name="apellido" pattern="[a-zA-Z]+" value="<%=us.getCorreo()%>" required><br><br>

                <label><strong>Telefono: </strong></label><br>
                <input type="text" name="telefono" pattern="[0-9]+" value="<%=us.getDocumento()%>" required><br><br>

                <label><strong>Correo Electronico: </strong></label><br>
                <input type="email" name="email" value="<%=us.getTelefono()%>"><br><br>

                <label><strong>Usuario: </strong></label><br>
                <input type="text" name="usuario" value="<%=us.getUsuario()%>" pattern="[a-zA-Z]+" required><br><br>

                <label><strong>Contraseña: </strong></label><br>
                <input type="password" name="contra" required><br><br>

                <label><strong>Confirmar Contraseña: </strong></label><br>
                <input type="password" name="confirmar" required><br><br>

                <input type="submit" name="Actualizar" class="Actualizar" value="Actualizar Datos">
            </form>
            <br>
        <% 
            }    
        }
        %>
        </div>
        <br>  
        <footer>
            Creado por SKU INVENTORY. <br>Todos los derechos reservados &copy; 2020
        </footer>                    
    </body>
</html>

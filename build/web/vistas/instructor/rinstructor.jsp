<%-- 
    Document   : index
    Created on : 2/08/2020, 08:54:20 AM
    Author     : ALEXANDER PENAGOS, ANDRES GUERRERO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SKU Inventory</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="shortcut icon" href="../../img/logosku.png"> 
        <link rel="stylesheet" href="../../style/css/bootstrap.min.css">
        <link rel="stylesheet" href="../../style/css/aprendiz-index.css">
        
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
        <script src="http://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="../../style/js/menu.js" type="text/javascript"></script>

        
    </head>
    <body>

        <!--Menu de navegacion-->
        <nav class="sticky-top">
            <label class="logo"><img src="../../img/logosku.png" width="150px"></label>
            <ul>
                <li><a href="" data-toggle="modal" data-target="#iniciar">Iniciar Sesion</a> </li>
                <li><a href="" data-toggle="modal" data-target="#buscar">Registrate</a> </li>
            </ul>
            <label id="icon">
                <i class="fas fa-bars"></i>
            </label>
        </nav>


        <!--Modal de inicio de sesion-->
        <div class="modal fade" id="iniciar" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="exampleModalLongTitle">Inicio de Sesion</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">
                        <form action="../../Slogin" method="POST">
                            <input type="radio" name="Rol" value="instructor" required>Instructor
                            <input type="radio" name="Rol" value="aprendiz" required>Aprendiz<br>

                            <label for="name">Usuario: </label><br>
                            <input type="text" name="name" required ><br><br>

                            <label for="pass">Contraseña: </label><br>
                            <input type="password" name="pass" required><br><br>

                            <input type="submit" name="ingresar" value="Iniciar Sesion">
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--Modal de inicio de sesion-->
        <div class="modal fade" id="buscar" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="exampleModalLongTitle">Validar Documento</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">
                        <form action="../../Saprendiz" method="POST">
                            <input type="radio" name="Rol" value="instructor" required>Instructor
                            <input type="radio" name="Rol" value="aprendiz" required>Aprendiz<br><br>
                            <label for="name">Documento: </label><br>
                            <input type="text" name="documento" required ><br><br>

                            <input type="submit" name="buscar" value="Buscar Documento">
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!--Contenido de la pagina-->
        <div class="container-fluid">
            <div class="row">
                <div class="col-2">

                </div>
                <div class="col-8 cont-formulario">

                    <h2><strong>REGISTRO INSTRUCTOR</strong></h2>
                    <%
                    String documento;
                    HttpSession datos=request.getSession();
                    documento=(String) datos.getAttribute("llevadoc");
             
                    if(documento==null){
                            response.sendRedirect("index.jsp");
                        }else{
                            datos.setAttribute("llevadocumento", documento);
                        }
                    %>

                    <form action="../../Sinstructor" method="POST" class="cont-form">
                        <label><strong> Documento: </strong></label><br>
                        <input type="number" name="documento" value="<%=documento%>" readonly><br><br>

                        <label><strong> Nombre: </strong></label><br>
                        <input type="text" name="nombre" pattern="[a-zA-Z]+" required><br><br>

                        <label><strong> Apellido: </strong></label><br>
                        <input type="text" name="apellido" pattern="[a-zA-Z]+" required><br><br>

                        <label><strong>Telefono: </strong></label><br>
                        <input type="text" name="telefono" pattern="[0-9]+" required><br><br>

                        <label><strong>Correo Electronico: </strong></label><br>
                        <input type="email" name="email"><br><br>

                        <label><strong>Usuario: </strong></label><br>
                        <input type="text" name="usuario" pattern="[a-zA-Z]+" required><br><br>

                        <label><strong>Contraseña: </strong></label><br>
                        <input type="password" name="contra" required><br><br>

                        <label><strong>Confirmar Contraseña: </strong></label><br>
                        <input type="password" name="confirmar" required><br><br>

                        <input type="submit" name="registrari" value="Registrar">
                    </form>       
                </div>
                <div class="col-2">
                </div>
            </div>
        </div>
        <footer>
            Creado por SKU INVENTORY. <br>Todos los derechos reservados &copy; 2020
        </footer>
                        
        <script src="../../style/js/jquery.js"></script>
        <script src="../../style/js/bootstrap.js"></script>
        <script src="../../style/js/popper.js"></script>
    </body>
</html>
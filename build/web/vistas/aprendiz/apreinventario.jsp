<%-- 
    version: 0.1
    Document   : principal
    Created on : 2/08/2020, 07:27:54 PM
    Author     : Andres Guerrero, Alexander penagos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sku Inventory-Aprendiz-inventario</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="../../style/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../style/css/aprendiz.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <header>
            <label class="logo"><img src="../../img/logosku.png" width="150px"></label>
        </header>

        <!--Menu de navegacion-->
        <div class="navegacion">
            <ul>
                <li>
                    <a href="principal.jsp" class="active">
                        <span class="icon"></span><i class="fa fa-home" aria-hidden="true"></i>
                        <span class="title">Inicio</span>
                    </a>
                </li>      

                <li>
                    <a href="apreinventario.jsp">
                        <span class="icon"></span><i class="fa fa-plus" aria-hidden="true"></i>
                        <span class="title">Crear Inventario</span>
                    </a>
                </li>
                <li>
                    <a href="apreproductos.jsp">
                        <span class="icon"></span><i class="fa fa-plus" aria-hidden="true"></i></i>
                        <span class="title">Productos</span>
                    </a>
                </li>
                <li>
                    <a href="aprentradas.jsp">
                        <span class="icon"></span><i class="fa fa-lock" aria-hidden="true"></i>
                        <span class="title">Entradas</span>
                    </a>
                </li>
                <li>
                    <a href="apresalida.jsp">
                        <span class="icon"></span><i class="fa fa-user" aria-hidden="true"></i>
                        <span class="title">Salidas</span>
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

        <div class="contenido">
            <h2>Registo de Inventario</h2>
            <input type="button" value="Ingresar Datos" data-toggle="modal" data-target="#exampleModal">


            <!-- Modal de registro de entradas-->
            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Registro de inventario</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <form>
                                <label>Nombre </label><br>
                                <input type="date"><br><br>
                                
                                <label>Direccion </label><br>
                                <input type="text"><br><br>
                                
                                <label>Telefono </label><br>
                                <input type="number"><br><br>
                                
                                <label>Metodo </label><br>
                                <input type="number"><br><br>
                                
                                
                                <input type="button" value="Registrar Inventario">
                                <br>
                            </form>
                        </div>
                    </div>
                </div>
            </div>


            <hr>
            <table class="table">
                <thead>
                <th>NOMBRE</th>
                <th>DIRECCION</th>
                <th>TELEFONO</th>
                <th>METODO</th>
                <th></th>
                </thead>
                <tbody>
                    <tr>
                        <td></td>
                    </tr>
                </tbody>
            </table>


        </div>


        <footer>
            Creado por SKU INVENTORY. <br>Todos los derechos reservados &copy; 2020
        </footer>
        <script src="../../style/js/jquery.js" type="text/javascript"></script>
        <script src="../../style/js/popper.js" type="text/javascript"></script>
        <script src="../../style/js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>


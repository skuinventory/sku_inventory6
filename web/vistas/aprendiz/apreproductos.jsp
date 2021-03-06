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
        <title>Sku Inventory-Aprendiz-Productos</title>
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
                    <a href="">
                        <span class="icon"></span><i class="fa fa-plus" aria-hidden="true"></i>
                        <span class="title">Crear Inventario</span>
                    </a>
                </li>
                <li>
                    <a href="apreproductos.jsp">
                        <span class="icon"></span><i class="fa fa-eye" aria-hidden="true"></i></i>
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
                    <a href="">
                        <span class="icon"></span><i class="fa fa-user" aria-hidden="true"></i>
                        <span class="title">Salidas</span>
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
            <h2>Registro de Productos</h2>
                <form>
                    <div class="row">
                        <div class="col-6 col-sm-6 col-lg-3 col-md-3 col-xl-3">
                            <label>Codigo: </label><br>
                            <input type="text" name="codigo">
                        </div>

                        <div class="col-6 col-sm-6 col-lg-3 col-md-3 col-xl-3">
                            <label>Nombre: </label><br>
                            <input type="text" name="nombre">
                        </div>

                        <div class="col-6 col-sm-6 col-lg-3 col-md-3 col-xl-3">
                            <label>Marca: </label><br>
                            <input type="text" name="marca">
                        </div>

                        <div class="col-6 col-sm-6 col-lg-3 col-md-3 col-xl-3">
                            <label>Detalles: </label><br>
                            <input type="text" name="detalle"> 
                        </div>
                        
                        <div class="col-12 col-sm-12 col-lg-12 col-md-12 col-xl-12">
                            <input type="submit" value="Registrar Prodcuto" name="registrarPro">
                        </div>
                    </div>
                </form>
            <hr>
            <table class="table">
                <thead>
                    <th>CODIGO</th>
                    <th>NOMBRE</th>
                    <th>MARCA</th>
                    <th>DETALLES</th>
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
    </body>
</html>

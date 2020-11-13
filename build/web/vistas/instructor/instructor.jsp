<%-- 
    Document   : instrutor
    Created on : 3/08/2020, 01:19:19 AM
    Author     : andre
--%>

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
        <title>SKU inventory-Instructor</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="../../style/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../style/css/aprendiz.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <header>
            <label class="logo"><img src="../../img/logosku.png" width="150px"></label>
            <%=doc%>
        </header>
        
        <!--Menu de navegacion-->
        <div class="navegacion">
            <ul>
                <li>
                    <a href="" class="active">
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
        <div class="col-none col-block-sm toggle" onclick="menu()"></div>
	
        
        <div class="contenido">
            Lo sentimos estamos en construccion...
        </div>
        
        
        <footer>
            Creado por SKU INVENTORY. <br>Todos los derechos reservados &copy; 2020
        </footer>
        <script type="text/javascript">
		function menu() {
			let navegacion= document.querySelector(".navegacion")
			navegacion.classList.toggle('active');
		}
	</script>
        
        
    </body>
</html>

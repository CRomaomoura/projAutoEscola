<%-- 
    Document   : index
    Created on : Nov 19, 2019, 7:10:36 PM
    Author     : lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/index.css">
        <title>Login</title>
    </head>
    <body>
        <header>
            <img src="img/fw.jpg" class="imgHeader">
        </header>
        <form action="cliente/novo" METHOD="POST">
            <div>
                <input type="text" placeholder="Usuário" name="usuario"/>
            </div>
            <div>
                <input type="password" placeholder="Senha" name="senha"/>
            </div> 
            <div>
                <input type="submit" value="Login">
            </div>
        </form>
    </body>
</html>

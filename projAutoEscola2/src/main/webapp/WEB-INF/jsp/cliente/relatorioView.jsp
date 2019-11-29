<%-- 
    Document   : relatorioView
    Created on : Nov 21, 2019, 2:06:37 PM
    Author     : lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div style=" text-align: center; margin-top: 22%;">
            <h1 style="color: green;">Cadastro realizado com sucesso!</h1>
            <form action="relatorio" METHOD="">
                <input type="submit" value="Gerar relatório">
            </form>
        </div>
    </body>
</html>

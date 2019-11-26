<%-- 
    Document   : formView
    Created on : Nov 19, 2019, 7:55:49 PM
    Author     : lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulário</title>
    </head>
    <body>
        <div id="cabecalho">
            <%@include file="../templates/header.jsp" %>
        </div>
        <div id="usuarioLogado">
            <p>Bem vindo: </p>
        </div>
        <form action="novo" METHOD="POST">
            <div id="infoCliente">
                <%@include  file="../templates/infoCliente.jsp" %>
            </div>
            <div id="infoNascimento">
                <%@include file="../templates/infoNascimento.jsp" %>
            </div>
             <div id="infoDocumento">
                 <%@include file="../templates/infoDocumento.jsp" %>
            </div>
             <div id="infoEndereco">
                 <%@include file="../templates/infoEndereco.jsp" %>
            </div>
             <div id="infoContato">
                 <%@include file="../templates/infoContato.jsp" %>
            </div>
            <input type="submit" value="Cadastrar">
        </form>
        <div id="rodape">
            <%@include file="../templates/footer.jsp" %>
        </div>
    </body>
</html>

<%-- 
    Document   : infoCliente
    Created on : Nov 21, 2019, 1:12:43 PM
    Author     : lucas
--%>


<!--<div class="card container-fluid" style="width: 15%;">
    <img src="${pageContext.request.contextPath}/img/policial.png" style="width: 100%;" class="card-img-top" alt="Avatar cliente">
    <div class="card-body">
        <h5>Cadastro de Cliente</h5>
        <p>Auto Escola Direção Segura</p>
    </div>
</div>-->
<div class="">
    <div class="card-header">
        <ul class="nav nav-pills card-header-pills">
            <li class="nav-item">
                <a class="nav-link active">Dados Pessoais</a>
            </li>
        </ul>
    </div>
    <div class="form-row container">
        <div class="form-group mr-sm-2">
            <label for="nome">Nome completo</label>
            <input type="text" name="usuario" class="form-control" required/>
        </div>
        <div class="form-group mr-sm-2">
            <label for="cpf">CPF</label>
            <input type="text"  name="cpf"  class="form-control" required/>
        </div> 
        <div class="form-group mr-sm-2">
            <label for="nomeMae">Nome da Mãe</label>
            <input type="text" name="nomeMae"  class="form-control" required>
        </div>
        <div class="form-group mr-sm-2">
            <label for="nomePai">Nome do Pai</label>
            <input type="text" name="nomePai" class="form-control">
        </div>
        <div class="form-group mr-sm-2">
            <label for="dataNascimento">Data de Nascimento</label>
            <input type="date" name="dataNascimento" class="form-control" required>
        </div>
        <div class="form-group mr-sm-2">
            <label for="localNascimento">Local Nascimento</label>
            <input type="text" name="localNasc"  class="form-control" required/>
        </div>
        <div class="form-group mr-sm-2">
            <label for="profissao">Profissão</label>
            <input type="text" name="profissao" class="form-control">
        </div>
        <div class="form-group mr-sm-2">
            <label> Grau de Instrução: </label>
            <select class="form-control">
                <option selected>Selecionar</option>
                <option>Ensino Fundamental Incompleto</option>
                <option>Ensino Fundamental Completo</option>
                <option>Ensino Médio Incompleto</option>
                <option>Ensino Médio Completo</option>
                <option>Ensino Superior Incompleto</option>
                <option>Ensino Superior Completo</option>
            </select>
        </div>

        <div class="form-group mr-sm-2">
            <label>Sexo</label>
            <select class="form-control">
                <option selected>Selecionar</option>
                <option>Masculino</option>
                <option>Feminino</option>
            </select>
        </div>
        <div class="form-group mr-sm-2">
            <label>Estado Civil</label>
            <select class="form-control">
                <option selected>Selecionar</option>
                <option>Casado(a)</option>
                <option>Solteiro(a)</option>
                <option>Divorciado(a)</option>
            </select>
        </div>
        <div class="form-group mr-sm-2">
            <label>Tipo de Processo</label>
            <select class="form-control">
                <option selected>Selecionar</option>
                <option>Primeira Habilitação</option>
                <option>Adição de Categoria</option>
                <option>Mundança de Categoria</option>
                <option>Adição com Mudança</option>
            </select>
        </div>

        <div class="form-group mr-sm-2">
            <label>Categoria Pretendida</label>
            <select class="form-control">
                <option selected>Selecionar</option>
                <option>A</option>
                <option>B</option>
                <option>AB</option>
                <option>C</option>
                <option>D</option>
                <option>E</option>
                <option>AC</option>
                <option>AD</option>
                <option>AE</option>
            </select>
        </div>
        <div class="form-group mr-sm-2">
            <label> Nacionalidade </label>
            <select class="form-control">
                <option selected>Selecionar</option>
                <option>Brasileiro(a)</option>
                <option>Estrangeiro(a)</option>
            </select>
        </div>
    </div>
</div>
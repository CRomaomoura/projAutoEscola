<%-- 
    Document   : infoDocumento
    Created on : Nov 21, 2019, 1:17:24 PM
    Author     : lucas
--%>
<div>
    <div class="card-header">
        <ul class="nav nav-pills card-header-pills">
            <li class="nav-item">
                <a class="nav-link active">Documentação</a>
            </li>
        </ul>
    </div>
    <div class="form-row container">

        <div class="form-group mr-sm-2">
            <label> Tipo Documento</label>
            <select class="form-control">
                <option>Selecione o tipo de documento</option>
                <option>Carteira Estrangeira</option>
                <option>RG</option>
                <option>CTPS</option>
                <option>Reservista</option>
                <option>Passaport</option>
            </select>

        </div>
        <div class="form-group mr-sm-2">
            <label>Numero do documento</label>
            <input type="text" name="numeroDoc" class="form-control">
        </div>

        <div class="form-group mr-sm-2">
            <label>Orgão emissor</label>
            <input type="text" name="orgao" class="form-control">
        </div>

        <div class="form-group mr-sm-2">
            <label>Data emissão</label>
            <input type="date" name="dataEmissao" placeholder="Data de emissão" class="form-control">
        </div>
    </div>
</div>
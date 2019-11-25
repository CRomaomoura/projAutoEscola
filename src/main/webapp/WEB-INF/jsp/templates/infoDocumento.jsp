<%-- 
    Document   : infoDocumento
    Created on : Nov 21, 2019, 1:17:24 PM
    Author     : lucas
--%>
<fieldset>
    <div>
        <label> Tipo Documento </label>
        <select>
            <option>Selecione o tipo de documento</option>
            <option>Carteira Estrangeira</option>
            <option>RG</option>
            <option>CTPS</option>
            <option>Reservista</option>
            <option>Passaport</option>
        </select>

    </div>
    <div>
        <label>Numero do documento:</label>
        <input type="text" name="numeroDoc" >
    </div>

    <div>
        <label>orgão emissor:</label>
        <input type="text" name="orgao" >
    </div>

    <div>
        <label>Data emissão:</label>
        <input type="date" name="dataEmissao" placeholder="Data de emissão">
    </div>
</fieldset>
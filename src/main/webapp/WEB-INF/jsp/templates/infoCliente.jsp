<%-- 
    Document   : infoCliente
    Created on : Nov 21, 2019, 1:12:43 PM
    Author     : lucas
--%>

<div>
    <label> Nome Completo: </label>
    <input type="text" name="usuario"/>
</div>
<div>
     <label> Nome da m�e: </label>
    <input type="text" name="nomeMae" placeholder="Nome da m�e">
</div>

<div>
     <label> Nome do pai: </label>
    <input type="text" name="nomePai" placeholder="Nome da pai">
</div>
<div>
    <label>Sexo: </label>
    Masculino<input type="radio" name="sexo" value="Masculino" />
    Feminino<input type="radio" name="sexo" value="Feminino" />
    Outros<input type="radio" name="sexo" value="Outro" />
</div>
<div>
    <input type="text" placeholder="CPF" name="cpf"/>
    <input type="submit" value="Buscar">
</div> 
<div>
    <label> Grau de Instru��o: </label>
    <select>
        <option>Selecionar</option>
        <option>Ensino Fundamental Incompleto</option>
        <option>Ensino Fundamental Completo</option>
        <option>Ensino M�dio Incompleto</option>
        <option>Ensino M�dio Completo</option>
        <option>Ensino Superior Incompleto</option>
        <option>Ensino Superior Completo</option>
    </select>
</div>
<div>
    <input type="text" name="profissao" placeholder="Profiss�o">
</div>
<div>
    <label> Estado Civil:</label>
    <select>
        <option>Casado(a)</option>
        <option>Solteiro(a)</option>
        <option>Divorciado(a)</option>
    </select>
</div>
<div>
    <fieldset>
        <label>Categoria Pretendida:</label>
        <select>
            <option>Selecione o tipo de processo</option>
            <option>Primeira Habilita��o</option>
            <option>Adi��o de Categoria</option>
            <option>Mundan�a de Categoria</option>
        </select>
        <br>
        A<input type="radio" name="tipoCategoria" value="A" />
        B<input type="radio" name="tipoCategoria" value="B" />
        AB<input type="radio" name="tipoCategoria" value="AB" />
        C<input type="radio" name="tipoCategoria" value="C" />
        D<input type="radio" name="tipoCategoria" value="D" />
        E<input type="radio" name="tipoCategoria" value="E" />
    </fieldset>
</div>
<div>
    <label>Profiss�o:</label>
    <input type="text" name="profissao" placeholder="Profiss�o">
</div>
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;

/**
 *
 * @author lucas
 */
@Controller
@Path("cliente")
public class ClienteController {

    @Get("novo")
    public void formView(){}
    @Post("relatorio")
    public void relatorioView(){}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import edu.br.fjn.projautoescola.domain.funcionario.Funcionario;
import edu.br.fjn.projautoescola.util.FabricaConexao;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author lucas
 */
@Controller
public class AutenticacaoController {

    @Inject
    private Result result;

    @Post("autenticacao")
    public void login(String usuario, String senha) {

        EntityManager gerenciador = FabricaConexao.getGerenciador();
        try {
            Funcionario c = gerenciador.createQuery("Select f from Funcionario f where f.usuario = :usuario and f.senha=:senha", Funcionario.class)
                    .setParameter("usuario", usuario)
                    .setParameter("senha", senha)
                    .getSingleResult();
            if (c != null) {
                result.redirectTo(ClienteController.class).formView();
            }
        } catch (NoResultException e) {
            e.printStackTrace();
        } finally {
            gerenciador.close();
        }

    }    
}

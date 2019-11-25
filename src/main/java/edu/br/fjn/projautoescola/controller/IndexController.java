/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import edu.br.fjn.projautoescola.domain.funcionario.Funcionario;
import edu.br.fjn.projautoescola.repositorios.util.FabricaConexao;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author lucas
 */
@Controller
public class IndexController {

    @Inject
    private Result result;
    
    @Get("/")
    public void indexView(){}
    
    @Post("autenticacao")
    public void login(String nome,String senha){
        EntityManager gerenciador = FabricaConexao.getGerenciador();
        try{
        Funcionario c = gerenciador.createQuery("Select f.nome,f.senha "
                + "from Funcionario f where f.nome = :nome and f.senha=senha",Funcionario.class)
                .setParameter("nome", nome)
                .setParameter("senha", senha)
                .getSingleResult();
                if(c!=null){
                    result.redirectTo(ClienteController.class).formView();
                }
        }catch(NoResultException e){
            e.printStackTrace();
        }finally{
            gerenciador.close();
        }
        
        
    }
}

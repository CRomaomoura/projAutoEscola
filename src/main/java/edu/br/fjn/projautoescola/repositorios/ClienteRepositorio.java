/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.repositorios;

import edu.br.fjn.projautoescola.domain.cliente.Cliente;
import edu.br.fjn.projautoescola.repositorios.padrao.RepositorioAbstrato;
import edu.br.fjn.projautoescola.util.FabricaConexao;
import javax.persistence.EntityManager;

/**
 *
 * @author lucas
 */
public class ClienteRepositorio extends RepositorioAbstrato<Cliente, Integer>{
 
    public ClienteRepositorio() {
        super(Cliente.class);
    }
    
    public Cliente buscarPorCpf(String cpf){
        EntityManager gerenciador = FabricaConexao.getGerenciador();
        Cliente cliente = (Cliente) gerenciador.createQuery("Select * from Cliente c where c.cpf = :cpf")
                .setParameter(":cpf", cpf);
        gerenciador.close();
        return cliente;
    }
     
}

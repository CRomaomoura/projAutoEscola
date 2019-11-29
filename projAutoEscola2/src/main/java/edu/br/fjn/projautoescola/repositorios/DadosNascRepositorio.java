/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.repositorios;

import edu.br.fjn.projautoescola.domain.cliente.DadosNascimento;
import edu.br.fjn.projautoescola.repositorios.padrao.RepositorioAbstrato;

/**
 *
 * @author lucas
 */
public class DadosNascRepositorio extends RepositorioAbstrato<DadosNascimento, Integer>{
 
    public DadosNascRepositorio() {
        super(DadosNascimento.class);
    }
      
}

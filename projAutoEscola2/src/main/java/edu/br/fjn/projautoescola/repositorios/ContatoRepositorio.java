/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.repositorios;

import edu.br.fjn.projautoescola.domain.cliente.Contato;
import edu.br.fjn.projautoescola.repositorios.padrao.RepositorioAbstrato;

/**
 *
 * @author lucas
 */
public class ContatoRepositorio extends RepositorioAbstrato<Contato, Integer>{
 
    public ContatoRepositorio() {
        super(Contato.class);
    }
      
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.componentes;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author lucas
 */
@SessionScoped
@Named("sessaoFuncionario")
public class SessaoFuncionario implements Serializable {

    private String nome;
    private boolean estadoLogin;

    public SessaoFuncionario() {
    }

    public String getNome() {
        if(this.nome=="root"){
            return "Funcionário Padrão";
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean verificaLogin() {
        if (nome != null) {
            this.estadoLogin = true;
        } else {
            this.estadoLogin = true;
        }
        return this.estadoLogin;
    }

    public void sair() {
        this.estadoLogin = false;
        this.nome = null;
    }

}

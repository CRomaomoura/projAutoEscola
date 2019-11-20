/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.domain.funcionario;

import edu.br.fjn.projautoescola.domain.interfaces.Entidade;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author lucas
 */
@Entity
public class Funcionario implements Entidade<Integer> {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_funcionario")
    @Id
    @SequenceGenerator(initialValue = 1, allocationSize = 1, sequenceName = "seq_idFuncionario", name = "id_funcionario")
    private Integer id;

    @Column(nullable = false)
    private String usuario;

    @Column(nullable = false)
    private String senha;

    public Funcionario() {
    }

    public Funcionario(Integer id, String usuario, String senha) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String login(String user, String password) {
        //Será modificado futuramente!
        return null;
    }

}

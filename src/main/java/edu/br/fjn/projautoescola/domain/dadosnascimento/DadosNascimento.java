/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.domain.dadosnascimento;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author romao
 */
@Entity
public class DadosNascimento implements Serializable {

    @Id
    private Long idDados;
     private static final long serialVersionUID = 1L;

    public Long getIdDados() {
        return idDados;
    }

    public void setIdDados(Long idDados) {
        this.idDados = idDados;
    }
    
}

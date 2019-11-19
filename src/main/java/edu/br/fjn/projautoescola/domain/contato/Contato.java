/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.domain.contato;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author romao
 */
@Entity
public class Contato implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "codigo_contato")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, sequenceName = "seq_codigoContato", name = "codigo_contato")
    private Integer codigo;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String email;

    public Contato() {
    }

    public Contato(int codigo, String numero, String email) {
        this.codigo = codigo;
        this.numero = numero;
        this.email = email;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

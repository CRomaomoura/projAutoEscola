/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.domain.dadosnascimento;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author romao
 */
@Entity
public class DadosNascimento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_dados")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, sequenceName = "seq_idDadosNasc", name = "id_dados")
    private Integer id;

    @Column(nullable = false)
    private String localNascimento;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Nacionalidade nacionalidade;

    @Column(nullable = false)
    private String nomeMae;

    @Column(nullable = true)
    private String nomePai;

    public DadosNascimento() {
    }

    public DadosNascimento(Integer id, String localNascimento, Date dataNascimento, Nacionalidade nacionalidade, String nomeMae, String nomePai) {
        this.id = id;
        this.localNascimento = localNascimento;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocalNascimento() {
        return this.localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Nacionalidade getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNomeMae() {
        return this.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return this.nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /*
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DadosNascimento other = (DadosNascimento) obj;
        return Objects.equals(this.id, other.id);
    }
*/
}

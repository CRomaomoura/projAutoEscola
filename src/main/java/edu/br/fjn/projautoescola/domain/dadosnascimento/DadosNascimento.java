/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.domain.dadosnascimento;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author romao
 */
@Entity
public class DadosNascimento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long idDados;
    private String localNascimento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    private Nacionalidade nacionalidade;
    private String nomeMae;
    private String nomePai;

    public DadosNascimento() {
    }

    public DadosNascimento(Long idDados, String localNascimento, Date dataNascimento, Nacionalidade nacionalidade, String nomeMae, String nomePai) {
        this.idDados = idDados;
        this.localNascimento = localNascimento;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }

    public Long getIdDados() {
        return idDados;
    }

    public void setIdDados(Long idDados) {
        this.idDados = idDados;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

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
        if (!Objects.equals(this.idDados, other.idDados)) {
            return false;
        }
        return true;
    }

}

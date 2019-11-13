/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.domain.dadosnascimento;

import edu.br.fjn.projautoescola.domain.cliente.Cliente;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
    private Long id;

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

    @Column(nullable = false)
    private String nomePai;

    @OneToOne
    private Cliente dadosCliente;

    public DadosNascimento() {
    }

    public DadosNascimento(Long id, String localNascimento, Date dataNascimento, Nacionalidade nacionalidade, String nomeMae, String nomePai) {
        this.id = id;
        this.localNascimento = localNascimento;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Cliente getDadosCliente() {
        return dadosCliente;
    }

    public void setDadosCliente(Cliente dadosCliente) {
        this.dadosCliente = dadosCliente;
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
        return Objects.equals(this.id, other.id);
    }

}

package edu.br.fjn.projautoescola.domain.cliente;

import edu.br.fjn.projautoescola.domain.contato.Contato;
import edu.br.fjn.projautoescola.domain.dadosnascimento.DadosNascimento;
import edu.br.fjn.projautoescola.domain.documento.Documento;
import edu.br.fjn.projautoescola.domain.endereco.Endereco;
import java.io.Serializable;
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

/**
 *
 * @author lucas
 */
@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_ger_cliente")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, sequenceName = "seq_idCliente", name = "id_ger_cliente")
    private Integer idCliente;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Escolaridade escolaridade;

    @Column(nullable = false)
    private String profissao;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CategoriaPretendida categoria;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    //desda linha abaixo ficará as associativas 
    @OneToOne(mappedBy = "dados_cliente")
    private DadosNascimento dadosNascimento;

    @OneToOne(mappedBy = "endereco_cliente")
    private Endereco endereco;

    @OneToOne(mappedBy = "cliente_contato")
    private Contato contato;

    @OneToOne(mappedBy = "cliente_doc")
    private Documento documentos;

    public Cliente() {
    }

    public Cliente(Integer idCliente, String nome, Escolaridade escolaridade, String profissao, CategoriaPretendida categoria, String cpf, EstadoCivil estadoCivil) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.escolaridade = escolaridade;
        this.profissao = profissao;
        this.categoria = categoria;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
     
    }
  
    public Integer getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public CategoriaPretendida getCategoria() {
        return this.categoria;
    }

    public void setCategoria(CategoriaPretendida categoria) {
        this.categoria = categoria;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EstadoCivil getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public DadosNascimento getDadosNascimento() {
        return this.dadosNascimento;
    }

    public void setDadosNascimento(DadosNascimento dadosNascimento) {
        this.dadosNascimento = dadosNascimento;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return this.contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Documento getDocumentos() {
        return this.documentos;
    }

    public void setDocumentos(Documento documentos) {
        this.documentos = documentos;
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
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.idCliente, other.idCliente);
    }

}

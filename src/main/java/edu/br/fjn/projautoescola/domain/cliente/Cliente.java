package edu.br.fjn.projautoescola.domain.cliente;

import edu.br.fjn.projautoescola.domain.contato.Contato;
import edu.br.fjn.projautoescola.domain.dadosnascimento.DadosNascimento;
import edu.br.fjn.projautoescola.domain.documento.Documento;
import edu.br.fjn.projautoescola.domain.endereco.Endereco;
import edu.br.fjn.projautoescola.domain.pagamento.Pagamento;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_gerador")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, sequenceName = "seq_idCliente", name = "id_gerador")
    private Long idCliente;

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
    @OneToOne(mappedBy = "dadosCliente")
    private List<DadosNascimento> dadosNascimento;

    @OneToOne(mappedBy = "endCliente")
    private List<Endereco> endereco;

    @OneToOne(mappedBy = "contatoCliente")
    private List<Contato> contato;

    @OneToMany(mappedBy = "docCliente")
    private List<Documento> documentos;

    @OneToMany(mappedBy = "pagCliente")
    private List<Pagamento> pagamento;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nome, Escolaridade escolaridade, String profissao, CategoriaPretendida categoria, String cpf, EstadoCivil estadoCivil, List<DadosNascimento> dadosNascimento, List<Endereco> endereco, List<Contato> contato, List<Documento> documentos, List<Pagamento> pagamento) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.escolaridade = escolaridade;
        this.profissao = profissao;
        this.categoria = categoria;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.dadosNascimento = dadosNascimento;
        this.endereco = endereco;
        this.contato = contato;
        this.documentos = documentos;
        this.pagamento = pagamento;
    }
  
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
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

    public List<DadosNascimento> getDadosNascimento() {
        return this.dadosNascimento;
    }

    public void setDadosNascimento(List<DadosNascimento> dadosNascimento) {
        this.dadosNascimento = dadosNascimento;
    }

    public List<Endereco> getEndereco() {
        return this.endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public List<Contato> getContato() {
        return this.contato;
    }

    public void setContato(List<Contato> contato) {
        this.contato = contato;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public List<Pagamento> getPagamento() {
        return pagamento;
    }

    public void setPagamento(List<Pagamento> pagamento) {
        this.pagamento = pagamento;
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

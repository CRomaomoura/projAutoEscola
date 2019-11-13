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
    @OneToOne(mappedBy = "dados_cliente")
    private DadosNascimento dadosNascimento;
    
    @OneToOne
    private Endereco endereco;
    
    @OneToMany
    private Contato contato;
    
    @OneToMany
    private Documento documento;
    
   // private Pagamento pagamento;

        public Cliente() {
    }

    public Cliente(Long idCliente, String nome, Escolaridade escolaridade, String profissao, CategoriaPretendida categoria, String cpf, EstadoCivil estadoCivil, DadosNascimento dadosNascimento) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.escolaridade = escolaridade;
        this.profissao = profissao;
        this.categoria = categoria;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.dadosNascimento = dadosNascimento;
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
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public CategoriaPretendida getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaPretendida categoria) {
        this.categoria = categoria;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public DadosNascimento getDadosNascimento() {
        return dadosNascimento;
    }

    public void setDadosNascimento(DadosNascimento dadosNascimento) {
        this.dadosNascimento = dadosNascimento;
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.idCliente, other.idCliente)) {
            return false;
        }
        return true;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.domain.documento;

import edu.br.fjn.projautoescola.domain.cliente.Cliente;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author romao
 */
@Entity
public class Documento implements Serializable {
    private static final long serialVersionUID = 1L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_doc")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, sequenceName = "seq_idDocumento", name = "id_doc")
    private Long id;
    
    @Column(nullable = false)
    private TipoDocumento tipo;
    
    @Column(nullable = false)
    private String numero;
    
    @Column(nullable = false)
    private String orgaoEmissor; // será inserido sigla e estado com 2 digitos
    
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmissao;
    
    @ManyToOne
    private Cliente docCliente;

    public Documento() {
    }

    public Documento(Long id, TipoDocumento tipo, String numero, String orgaoEmissor, Date dataEmissao, Cliente docCliente) {
        this.id = id;
        this.tipo = tipo;
        this.numero = numero;
        this.orgaoEmissor = orgaoEmissor;
        this.dataEmissao = dataEmissao;
        this.docCliente = docCliente;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Cliente getDocCliente() {
        return docCliente;
    }

    public void setDocCliente(Cliente docCliente) {
        this.docCliente = docCliente;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Documento other = (Documento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}

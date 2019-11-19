/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.domain.pagamento;

import edu.br.fjn.projautoescola.domain.cliente.Cliente;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author lucas
 */
@Entity
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;

    public Pagamento() {

    }

    public Pagamento(double valor, FormaPagamento formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }
    @GeneratedValue(generator = "id_pagamento", strategy = GenerationType.SEQUENCE)
    @Id
    @SequenceGenerator(initialValue = 1, allocationSize = 1, sequenceName = "seq_idPagamento", name = "id_pagamento")
    private Integer id;
    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;

    @ManyToOne
    private Cliente cliente;

    public Cliente getCliente() {
        return this.cliente;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public FormaPagamento getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

}

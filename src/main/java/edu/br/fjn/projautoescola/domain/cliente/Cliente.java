package edu.br.fjn.projautoescola.domain.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author lucas
 */
@Entity
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_gerador")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, sequenceName = "seq_idCliente", name = "id_gerador")
    private Long idCliente;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.domain.interfaces;

import java.io.Serializable;

/**
 *
 * @author romao
 * @param <T>
 */
public interface Entidade<T extends Object> extends Serializable {

    T getId();
}

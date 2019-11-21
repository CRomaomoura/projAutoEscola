/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.repositorios.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author romao
 */
public class FabricaConexao {
    
       private static final EntityManagerFactory fabrica
            = Persistence.createEntityManagerFactory("unidade-autoescola");

    public static EntityManager getGerenciador() {
        return fabrica.createEntityManager();
    }

    public static void closeFabrica() {
        fabrica.close();
    }
    
}

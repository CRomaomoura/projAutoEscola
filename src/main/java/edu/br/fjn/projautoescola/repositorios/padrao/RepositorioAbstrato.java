/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.fjn.projautoescola.repositorios.padrao;

import edu.br.fjn.projautoescola.domain.interfaces.Entidade;
import edu.br.fjn.projautoescola.util.FabricaConexao;
import javax.persistence.EntityManager;
import org.hibernate.Session;

/**
 *
 * @author romao
 * @param <E>
 * @param <I>

 */
public abstract class RepositorioAbstrato<E extends Entidade<Integer>, I extends Object> {

    protected Class<E> classe;

    public RepositorioAbstrato(Class<E> classe) {
        this.classe = classe;
    }

    public void salvar(E entity) {

        EntityManager gerenciador = FabricaConexao.getGerenciador();
        try {
            gerenciador.getTransaction().begin();
            gerenciador.persist(entity);
            gerenciador.getTransaction().commit();
        } catch (Exception e) {
            if (gerenciador.getTransaction().isActive()) {
                gerenciador.getTransaction().rollback();
            }
        } finally {
            gerenciador.close();
        }

    }

    public void atualizar(E ent) {
        EntityManager gerenciador = FabricaConexao.getGerenciador();
        try {
            gerenciador.getTransaction().begin();
            gerenciador.merge(ent);
            gerenciador.getTransaction().commit();
        } catch (Exception e) {
            if (gerenciador.getTransaction().isActive()) {
                gerenciador.getTransaction().rollback();
            }
        } finally {
            gerenciador.close();
        }
    }

    public E buscarPorId(I id) {
        EntityManager gerenciador = FabricaConexao.getGerenciador();
        E e = gerenciador.find(this.classe, id);
        gerenciador.close();
        return e;
    }

    public void remover(E entidade) {
        EntityManager gerenciador = FabricaConexao.getGerenciador();
        try {
            gerenciador.getTransaction().begin();
            E ent = gerenciador.find(this.classe, entidade.getId());
            gerenciador.remove(ent);
            gerenciador.getTransaction().commit();
        } catch (Exception e) {
            if (gerenciador.getTransaction().isActive()) {
                gerenciador.getTransaction().rollback();
            }
        } finally {
            gerenciador.close();
        }
    }
}

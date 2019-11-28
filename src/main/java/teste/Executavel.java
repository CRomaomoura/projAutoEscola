/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import edu.br.fjn.projautoescola.domain.funcionario.Funcionario;
import edu.br.fjn.projautoescola.repositorios.FuncionarioRepositorio;
import edu.br.fjn.projautoescola.util.FabricaConexao;


/**
 *
 * @author lucas
 */
public class Executavel {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setUsuario("lucas");
        f.setSenha("lucas");
        FuncionarioRepositorio fr = (FuncionarioRepositorio) FabricaConexao.getGerenciador();
        fr.salvar(f);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import edu.br.fjn.projautoescola.domain.cliente.CategoriaPretendida;
import edu.br.fjn.projautoescola.domain.cliente.Cliente;
import edu.br.fjn.projautoescola.domain.cliente.Contato;
import edu.br.fjn.projautoescola.domain.cliente.DadosNascimento;
import edu.br.fjn.projautoescola.domain.cliente.Documento;
import edu.br.fjn.projautoescola.domain.cliente.Endereco;
import edu.br.fjn.projautoescola.domain.cliente.Escolaridade;
import edu.br.fjn.projautoescola.domain.cliente.EstadoCivil;
import edu.br.fjn.projautoescola.domain.cliente.Nacionalidade;
import edu.br.fjn.projautoescola.domain.cliente.TipoDocumento;
import edu.br.fjn.projautoescola.domain.funcionario.Funcionario;
import edu.br.fjn.projautoescola.repositorios.ClienteRepositorio;
import edu.br.fjn.projautoescola.repositorios.ContatoRepositorio;
import edu.br.fjn.projautoescola.repositorios.DadosNascRepositorio;
import edu.br.fjn.projautoescola.repositorios.DocumentoRepositorio;
import edu.br.fjn.projautoescola.repositorios.EnderecoRepositorio;
import edu.br.fjn.projautoescola.repositorios.FuncionarioRepositorio;
import edu.br.fjn.projautoescola.util.FabricaConexao;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class Executavel {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setUsuario("romao");
        f.setSenha("1234");
        FuncionarioRepositorio fr = (FuncionarioRepositorio) FabricaConexao.getGerenciador();
        fr.salvar(f);

        //FabricaConexao con = new FabricaConexao();
        ClienteRepositorio cliRepositorio = new ClienteRepositorio();
        DadosNascRepositorio dadoRepositorio = new DadosNascRepositorio();
        DocumentoRepositorio docRepositorio = new DocumentoRepositorio();
        ContatoRepositorio contatoRepositorio = new ContatoRepositorio();
        EnderecoRepositorio endRepositorio = new EnderecoRepositorio();

        DadosNascimento dn = new DadosNascimento();
        dn.setId(Integer.SIZE);
        dn.setLocalNascimento("Ouricuri");
        dn.setDataNascimento(Date.from(Instant.MIN));
        dn.setNacionalidade(Nacionalidade.BRASILEIRO);
        dn.setNomeMae("maria do bairro");
        dn.setNomePai("joao da silva");

        dadoRepositorio.salvar(dn);

        Documento doc = new Documento();
        doc.setId(Integer.SIZE);
        doc.setTipo(TipoDocumento.RG);
        doc.setNumero("12334");
        doc.setOrgaoEmissor("SSP-PE");
        doc.setDataEmissao(Date.from(Instant.MIN));

        docRepositorio.salvar(doc);

        Endereco end = new Endereco();
        end.setId(Integer.SIZE);
        end.setLogradouro("Rua dos doidos");
        end.setNumero("123");
        end.setBairro("Cacimbinha");
        end.setComplemento("barraco");
        end.setCep("63377888");

        endRepositorio.salvar(end);

        Contato cont = new Contato();
        cont.setId(Integer.SIZE);
        cont.setNumero("3334444444");
        cont.setEmail("romao@hotmail.com");

        contatoRepositorio.salvar(cont);

        Cliente cli = new Cliente();
        cli.setId(Integer.SIZE);
        cli.setNome("Cicero Romão");
        cli.setCpf("08808805613");
        cli.setDadosNascimento(dn);
        cli.setEstadoCivil(EstadoCivil.CASADO);
        cli.setEscolaridade(Escolaridade.MEDIO_COMPLETO);
        cli.setDocumentos(doc);
        cli.setProfissao("Pedreiro");
        cli.setEndereco(end);
        cli.setCategoria(CategoriaPretendida.AE);
        cli.setContato(cont);

        cliRepositorio.salvar(cli);

        FabricaConexao.closeFabrica();
    }
}

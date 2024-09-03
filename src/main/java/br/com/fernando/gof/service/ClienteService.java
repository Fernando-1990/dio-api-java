package br.com.fernando.gof.service;

import br.com.fernando.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de clientes.
 * Com isso, se necessário, podemos ter multiplas implementções dessa mesma interface
 *
 * @author Fernando
 */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}

package controles;

import entidade.Cliente;
import interfaces.JanelaCadastroCliente;

public class ControladorCadastroCliente {
    
    public ControladorCadastroCliente(){
        new JanelaCadastroCliente(this).setVisible(true);
    }
    
    //Inserindo cliente. Verifica se o cpf ja não foi cadastrado: se não, chama a funçao inserir da classe Cliente e insere as informaçoes
    //no banco de dados. Se o cpf já está cadastrado retorna mensagem de erro informando que o cliente já está cadastrado
    public String inserirCliente (Cliente cliente) {
        Cliente cliente1 = Cliente.buscarCliente (cliente.getCpf ());
        if (cliente1 == null) {
            return Cliente.inserirCliente (cliente);
        } else{
            return "CPF de cliente já cadastrado";
        }
    }
    
    //Alterando cliente. Verifica se o cpf está cadastrado: se não, retorna mensagem de erro informando que o cliente não está cadastrado. Se sim, chama a funçao alterar
    //da classe Cliente e modifica os campos selecionados do cliente no banco de dados
    public String alterarCliente (Cliente cliente) {
        Cliente cliente1 = Cliente.buscarCliente (cliente.getCpf());
        if (cliente1 != null) {
            return Cliente.alterarCliente (cliente);
        } else {
            return "CPF de cliente não cadastrado";
        }
    }
    
    //Removendo cliente. Verifica se o cpf está cadastrado: se não, retorna mensagem de erro informando que o cliente não está cadastrado. Se sim, chama a funçao remover
    //da classe Cliente e remove as informaçoes do cliente do banco de dados
    public String removerCliente (String cpf) {
        Cliente cliente1 = Cliente.buscarCliente (cpf);
        if (cliente1 != null) {
            return Cliente.removerCliente (cpf);
        } else {
            return "CPF de cliente não cadastrado";
        }
    }
}
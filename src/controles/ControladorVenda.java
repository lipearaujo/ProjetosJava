
package controles;

import entidade.Venda;
import interfaces.JanelaCadastroVenda;

public class ControladorVenda {
    
    public ControladorVenda(){
        new JanelaCadastroVenda(this).setVisible(true);
    }
    
    //Inserindo venda. Verifica se o id da venda ja não foi cadastrado: se não, chama a funçao inserir da classe Venda e insere as informaçoes
    //no banco de dados. Se o id da venda já está cadastrado retorna mensagem de erro informando que a venda já está cadastrada
    public String inserirVenda (Venda venda) {
        Venda venda1 = Venda.buscarVenda(venda.getIDvenda());
        if (venda1 == null) {
            return Venda.inserirVenda(venda);
        } else{
            return "Venda já cadastrada";
        }
    }
    
    //Alterando venda. Verifica se o id da venda está cadastrado: se não, retorna mensagem de erro informando que a venda não está cadastrada. Se sim, chama a funçao alterar
    //da classe Venda e modifica os campos selecionados da venda no banco de dados
    public String alterarVenda (Venda venda) {
        Venda venda1 = Venda.buscarVenda(venda.getIDvenda());
        if (venda1 != null) {
            return Venda.alterarVenda(venda);
        } else {
            return "Venda não cadastrada";
        }
    }
    
    //Removendo venda. Verifica se a venda está cadastrada: se não, retorna mensagem de erro informando que a venda não está cadastrada. Se sim, chama a funçao remover
    //da classe Venda e remove as informaçoes da venda no banco de dados
    public String removerVenda (int id_Venda) {
        Venda venda1 = Venda.buscarVenda(id_Venda);
        if (venda1 != null) {
            return Venda.removerVenda (id_Venda);
        } else {
            return "Venda não cadastrada";
        }
    }
}

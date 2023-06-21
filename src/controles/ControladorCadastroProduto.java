package controles;

import entidade.Produto;
import interfaces.JanelaCadastroProduto;

public class ControladorCadastroProduto {
    
    public ControladorCadastroProduto(){
        new JanelaCadastroProduto(this).setVisible(true);
    }
    
    //Inserindo produto. Verifica se o id do skate ja não foi cadastrado: se não, chama a funçao inserir da classe Produto e insere as informaçoes
    //no banco de dados. Se o id do skate já está cadastrado retorna mensagem de erro informando que o produto já está cadastrado
    public String inserirProduto (Produto produto) {
        Produto produto1 = Produto.buscarProduto (produto.getSkate ());
        if (produto1 == null) {
            return Produto.inserirProduto(produto);
        } else{
            return "Produto já cadastrado";
        }
    }
    
     //Alterando produto. Verifica se o skate está cadastrado: se não, retorna mensagem de erro informando que o produto não está cadastrado. Se sim, chama a funçao alterar
    //da classe Produto e modifica os campos selecionados do produto no banco de dados
    public String alterarProduto (Produto produto) {
        Produto produto1 = Produto.buscarProduto (produto.getSkate());
        if (produto1 != null) {
            return Produto.alterarProduto(produto);
        } else {
            return "Produto não cadastrado";
        }
    }
    
     //Removendo produto. Verifica se o skate está cadastrado: se não, retorna mensagem de erro informando que o produto não está cadastrado. Se sim, chama a funçao remover
    //da classe Produto e remove as informaçoes do produto do banco de dados
    public String removerProduto (int skate) {
        Produto produto1 = Produto.buscarProduto (skate);
        if (produto1 != null) {
            return Produto.removerProduto (skate);
        } else {
            return "Produto não cadastrado";
        }
    }
}

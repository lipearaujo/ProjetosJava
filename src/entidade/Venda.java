package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Vector;
import Conexão.BD;
import entidade.Cliente;
import entidade.Produto;

public class Venda {
    private int id_Venda;
    private Cliente v_Cliente; 
    private Produto v_Produto;
    private float preço_Venda;
    int formaPagamento;
    
    public Venda(int id_Venda, Cliente v_Cliente, Produto v_Produto, float preço_Venda, int formaPagamento){
        this.id_Venda = id_Venda;
        this.v_Cliente = v_Cliente;
        this.v_Produto = v_Produto;
        this.preço_Venda = preço_Venda;
        this.formaPagamento = formaPagamento;       
    }
    
    public Visão<Integer> getVisão(){
        return new Visão<Integer>(id_Venda, id_Venda + "" );
    }
    
    public int getIDvenda(){
        return id_Venda;
    }
    
    public void setIDvenda(int id_Venda){
        this.id_Venda = id_Venda;
    }
    
    public Cliente getv_Cliente(){
        return v_Cliente;
    }
    
    public void setv_Cliente(Cliente v_Cliente){
        this.v_Cliente = v_Cliente;
    }
    
    public Produto getv_Produto(){
        return v_Produto;
    }
    
    public void setv_Cliente(Produto v_Produto){
        this.v_Produto = v_Produto;
    }
    
    public float getpreço_Venda(){
        return preço_Venda;
    }
    
    public void setpreço_Venda(float preço_Venda){
        this.preço_Venda = preço_Venda;
    }
    
    public int getformaPagamento(){
        return formaPagamento;
    }
    
    public String toString(){
         String formapag = "";
        if(formaPagamento == 1){
             formapag = "A Vista";
        }else{
             formapag = "Parcelado";
        }
        return "ID: " + id_Venda + "\n"  
               + "CPF do Cliente: " + v_Cliente.getCpf() + "\n"
               + "Nome do Cliente: " + v_Cliente.getNome() + "\n"
               + "Endereco: " + v_Cliente.getEndereço()+ "\n"
               + "ID do Skate: " + v_Produto.getSkate() + "\n"
               + "Marca do Skate: " + v_Produto.getMarca() + "\n"
               + "Tipo do Skate: " + v_Produto.getTipoSkate() + "\n"
               + "Preço da Venda: " + preço_Venda + "\n"
               + "Forma do Pagamento: " + formapag + "\n";
    }
    
    //Captura as informaçoes do produto a ser pesquisado
    public static Vector<Venda> pesquisarVenda(String endereco, String tipoSkate, int tipoPag) {                      
        String sql = "Select V.IDVenda, V.formaPagamento, V.Preçovenda , C.CPF, C.Nome, C.Endereço, P.Skate, P.Marca, P.TipoSkate FROM clientes C, produto P, venda V WHERE C.CPF = V.CPF_Cliente AND  P.Skate = V.IDskate";
        
        if( !endereco.isEmpty() ){
            sql += " AND C.Endereço = ?";
        }
        if(!tipoSkate.isEmpty()){   
            sql += " AND P.TipoSkate = ?";
        }
        if(tipoPag > 0){
            sql += " AND V.formaPagamento = ?";
        }
        ResultSet result = null;
        Vector<Venda> venda = new Vector<Venda>();
        
        int cont = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            int index = 0;
            if( !endereco.isEmpty() ){
                index++;
                comando.setString(index, endereco);
            }
            if(!tipoSkate.isEmpty()){
                index++;
                comando.setString(index, tipoSkate);
            }
            if(tipoPag > 0){
                index++;
                comando.setInt(index, tipoPag);
            }
            
            result = comando.executeQuery();
            while (result.next()){
                System.out.println("entrou");
                venda.addElement(new Venda(result.getInt(1),new Cliente(result.getString(4), result.getString(5), result.getString(6)), new Produto(result.getInt(7), result.getString(8), result.getString(9)), result.getFloat(3), result.getInt(2)));
            }
            
            result.close();
            comando.close();
        } catch (Exception erroSQL) {
            erroSQL.printStackTrace();

        }
        return venda;              
    
    }
     
    //Inserindo venda no banco de dados passando os valores inseridos nos campos de texto da janela Cadastro Venda
    public static String inserirVenda(Venda venda){
        String sql = "INSERT INTO Venda(IDvenda, CPF_Cliente, IDskate, Preçovenda, formaPagamento)"
                + " VALUES (?,?,?,?,?) ";
        
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, venda.getIDvenda());
            comando.setString(2, venda.getv_Cliente().getCpf());
            comando.setInt(3, venda.getv_Produto().getSkate());
            comando.setFloat(4, venda.getpreço_Venda());
            comando.setInt(5, venda.getformaPagamento());
            comando.executeUpdate();
            comando.close();
            return null;
        }catch(SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return "Erro na inserção da Venda no BD";
        }
    }
    
    //Buscando venda no banco de dados através do id venda inserido no campo de texto ID Venda da janela Cadastro Venda
    public static Venda buscarVenda(int id_Venda){
        String sql = "SELECT CPF_Cliente, IDskate, Preçovenda, formaPagamento FROM venda"
                + " WHERE IDvenda = ?";
        ResultSet lista_resultados = null;
        Venda venda = null;
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, id_Venda);
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()){
                venda = new Venda(id_Venda,
                        Cliente.buscarCliente(lista_resultados.getString("CPF_Cliente")),
                        Produto.buscarProduto(lista_resultados.getInt("IDskate")),
                        lista_resultados.getFloat("Preçovenda"),
                        lista_resultados.getInt("formaPagamento"));
            }
            lista_resultados.close();
            comando.close();
        }catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();
            venda = null;
        }
        return venda;
    }
    
    //Alterando venda no banco de dados substituindo os valores inseridos nos campos de texto da janela Cadastro Venda
    public static String alterarVenda(Venda venda) {
        String sql = "UPDATE venda SET CPF_Cliente = ?, IDskate = ?, Preçovenda = ?, formaPagamento = ?"
                + " WHERE IDvenda = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, venda.getv_Cliente().getCpf());
            comando.setInt(2, venda.getv_Produto().getSkate());
            comando.setFloat(3, venda.getpreço_Venda());
            comando.setInt(4, venda.getformaPagamento());
            comando.setInt(5, venda.getIDvenda());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na Alteração da Venda no BD";
        }
    }
    
    //Removendo venda no banco de dados pegando o id da venda inserido no campo de texto ID Venda da janela Cadastro Venda
    public static String removerVenda(int id_Venda) {
        String sql = "DELETE FROM venda WHERE IDvenda = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, id_Venda);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na Remoção da Venda no BD";
        }
    }
     
     public static Vector<Visão<Integer>> getVisões() {
        String sql = "SELECT IDvenda  FROM venda";
        ResultSet lista_resultados = null;
      Vector<Visão<Integer>> visões = new Vector<Visão<Integer>>();
        int id_Venda;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                id_Venda = lista_resultados.getInt("IDvenda");
                visões.addElement(new Visão<Integer>(id_Venda,
                         id_Venda + " " ));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return visões;
    }
}

package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Vector;
import Conexão.BD;
        
public class Produto {
    
    private int skate;
    private String marca, tipo_rodinha, tipo_skate, obs_produto;
    private float tamanho_shape;
    int modeloSkate;
    
    public Produto(int skate, String marca, String tipo_rodinha, String tipo_skate, float tamanho_shape, String obs_produto, int modeloSkate){
        this.skate = skate;
        this.marca = marca;
        this.tipo_rodinha = tipo_rodinha;
        this.tipo_skate = tipo_skate;
        this.tamanho_shape = tamanho_shape;
        this.obs_produto = obs_produto;
        this.modeloSkate = modeloSkate;
    }
    public Produto(int skate, String marca, String tipo_skate){
        this.skate = skate;
        this.marca = marca;       
        this.tipo_skate = tipo_skate;
    }
    
    public Visão<Integer> getVisão(){
        return new Visão<Integer>(skate, marca + "-" + skate);
    }
    
    public int getSkate(){
        return skate;
    }
    
    public void setSkate(int skate){
        this.skate = skate;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getTipoRodinha(){
        return tipo_rodinha;
    }
    
    public void setTipoRodinha(String tipo_rodinha){
        this.tipo_rodinha = tipo_rodinha;
    }
    
    public float getTamanhoShape(){
        return tamanho_shape;
    }
    
    public void setTamanhoshape(float tamanho_shape){
        this.tamanho_shape = tamanho_shape;
    }
    
    public String getTipoSkate(){
        return tipo_skate;
    }
    
    public void setTipoSkate(String tipo_skate){
        this.tipo_skate = tipo_skate;
    }
    
    public String getObs_Produto(){
        return obs_produto;
    }
    
    public void setObs_Cliente(String obs_produto){
        this.obs_produto = obs_produto;
    }
    
    public int getmodeloSkate(){
        return modeloSkate;
    }
    
    @Override
    public String toString(){
        return skate + "-" + tipo_skate;
    }
    
    //Inserindo produto no banco de dados passando os valores inseridos nos campos de texto da janela Cadastro Produto
    public static String inserirProduto(Produto produto){
        String sql = "INSERT INTO Produto(Skate, Marca, TipoRodinha, TamanhoShape, TipoSkate, Obs_Produto, modeloSkate)"
                + " VALUES (?,?,?,?,?,?,?) ";
        
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, produto.getSkate());
            comando.setString(2, produto.getMarca());
            comando.setString(3, produto.getTipoRodinha());
            comando.setFloat(4, produto.getTamanhoShape());
            comando.setString(5, produto.getTipoSkate());
            comando.setString(6, produto.getObs_Produto());
            comando.setInt(7, produto.getmodeloSkate());
            comando.executeUpdate();
            comando.close();
            return null;
        }catch(SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return "Erro na inserção do Produto no BD";
        }
    }
    
    //Buscando produto no banco de dados através do skate inserido no campo de texto skate da janela Cadastro Produto
    public static Produto buscarProduto(int skate){
        String sql = "SELECT Marca, TipoRodinha, TamanhoShape, TipoSkate, Obs_Produto, modeloSkate FROM produto"
                + " WHERE Skate = ?";
        ResultSet lista_resultados = null;
        Produto produto = null;
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, skate);
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()){
                produto = new Produto(skate,
                        lista_resultados.getString("Marca"),
                        lista_resultados.getString("TipoRodinha"),
                        lista_resultados.getString("TipoSkate"),
                        lista_resultados.getFloat("TamanhoShape"),
                        lista_resultados.getString("Obs_Produto"),
                        lista_resultados.getInt("modeloSkate"));
            }
            lista_resultados.close();
            comando.close();
        }catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();
            produto = null;
        }
        return produto;
    }
    
    //Alterando produto no banco de dados substituindo os valores inseridos nos campos de texto da janela Cadastro Produto
    public static String alterarProduto(Produto produto) {
        String sql = "UPDATE produto SET Marca = ?, TipoRodinha = ?, Tamanhoshape = ?, TipoSkate = ?, Obs_Produto = ?, modeloSkate = ?"
                + " WHERE Skate = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, produto.getMarca());
            comando.setString(2, produto.getTipoRodinha());
            comando.setFloat(3, produto.getTamanhoShape());
            comando.setString(4, produto.getTipoSkate());
            comando.setString(5, produto.getObs_Produto());
            comando.setInt(6, produto.getmodeloSkate());
            comando.setInt(7, produto.getSkate());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na Alteração do Produto no BD";
        }
    }
     
    //Removendo produto no banco de dados pegando o skate inserido no campo de texto skate da janela Cadastro Produto
    public static String removerProduto(int skate) {
        String sql = "DELETE FROM produto WHERE Skate = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, skate);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na Remoção do Produto no BD";
        }
    }
     
    public static Vector<Visão<Integer>> getVisões() {
        String sql = "SELECT Skate, Marca FROM produto";
        ResultSet lista_resultados = null;
      Vector<Visão<Integer>> visões = new Vector<Visão<Integer>>();
        int skate;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                skate = lista_resultados.getInt("Skate");
                visões.addElement(new Visão<Integer>(skate,
                         skate + " - " + lista_resultados.getString("Marca") ));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return visões;
    }
}

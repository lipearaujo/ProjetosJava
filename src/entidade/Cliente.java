package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Vector;
import Conexão.BD;

public class Cliente {

    private String cpf, nome, endereço, telefone, obs_cliente;

    public Cliente(String cpf, String nome, String endereço, String telefone, String obs_cliente) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.obs_cliente = obs_cliente;
    }

    public Cliente(String cpf, String nome, String endereço) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
    }

    public Visão<String> getVisão() {
        return new Visão<String>(cpf, nome + "-" + cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObs_Cliente() {
        return obs_cliente;
    }

    public void setObs_Cliente(String obs_cliente) {
        this.obs_cliente = obs_cliente;
    }

    @Override
    public String toString() {
        return nome + "-" + cpf;
    }

    //Inserindo cliente no banco de dados passando os valores inseridos nos campos de texto da janela Cadastro Cliente
    public static String inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO Clientes (CPF, Nome, Endereço, Telefone, Obs_Cliente)"
                + " VALUES (?,?,?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cliente.getCpf());
            comando.setString(2, cliente.getNome());
            comando.setString(3, cliente.getEndereço());
            comando.setString(4, cliente.getTelefone());
            comando.setString(5, cliente.getObs_Cliente());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na Inserção do Cliente no BD";
        }
    }

     //Buscando cliente no banco de dados através do CPF inserido no campo de texto CPF da janela Cadastro Cliente
    public static Cliente buscarCliente(String cpf) {
        String sql = "SELECT Nome, Endereço, Telefone, Obs_Cliente FROM Clientes"
                + " WHERE CPF = ?";
        ResultSet lista_resultados = null;
        Cliente cliente = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cpf);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                cliente = new Cliente(cpf,
                        lista_resultados.getString("Nome"),
                        lista_resultados.getString("Endereço"),
                        lista_resultados.getString("Telefone"),
                        lista_resultados.getString("Obs_Cliente"));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            cliente = null;
        }
        return cliente;
    }

    //Alterando cliente no banco de dados substituindo os valores inseridos nos campos de texto da janela Cadastro Cliente
    public static String alterarCliente(Cliente cliente) {
        String sql = "UPDATE clientes SET Nome = ?, Endereço = ?, Telefone = ?, Obs_Cliente = ?"
                + " WHERE CPF = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getEndereço());
            comando.setString(3, cliente.getTelefone());
            comando.setString(5, cliente.getCpf());
            comando.setString(4, cliente.getObs_Cliente());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na Alteração do Cliente no BD";
        }
    }
    
     //Removendo cliente no banco de dados pegando o CPF inserido no campo de texto CPF da janela Cadastro Cliente
    public static String removerCliente(String cpf) {
        String sql = "DELETE FROM venda WHERE CPF_Cliente = ?";
        String sql1 = "DELETE FROM Clientes WHERE CPF=?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cpf);
            comando.executeUpdate();
            comando = BD.conexão.prepareStatement(sql1);
            comando.setString(1, cpf);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (Exception erroSql) {
            erroSql.printStackTrace();
            return "Erro banco de dados";
        }
    }

    
    public static Vector<Visão<String>> getVisões() {
        String sql = "SELECT CPF, Nome FROM Clientes";
        ResultSet lista_resultados = null;
        Vector<Visão<String>> visões = new Vector<Visão<String>>();
        String cpf;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                cpf = lista_resultados.getString("CPF");
                visões.addElement(new Visão<String>(cpf,
                        lista_resultados.getString("Nome") + " - " + cpf));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return visões;
    }
}

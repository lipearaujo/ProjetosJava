package Conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
Fazendo a conexão com o Banco de Dados;
Configuramos o BD na aba banco de dados da janela serviços, conectamos o servidor MySQL e criamos o BD da loja(skateshop);
Criamos as tabelas Cliente, Produto, Venda no BD skateshop;
*/
public class BD {

    static final String URL_BD = "jdbc:mysql://localhost/skateshop";
    static final String USUÁRIO = "root";
    static final String SENHA = "";
    public static Connection conexão = null;

    public static void criaConexão() {
        try {
            conexão = DriverManager.getConnection(URL_BD, USUÁRIO, SENHA);
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
    }

    public static void fechaConexão() {
        try {
            conexão.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
    }
}

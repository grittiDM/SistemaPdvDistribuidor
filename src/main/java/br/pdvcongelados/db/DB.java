/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pdvcongelados.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Murilo Gritti
 */

public class DB {
    
    private static Connection cnc = null;
    private static String url = "jdbc:mysql://your_mysql_host:3306/your_database_name";
    private static String user = "user_name_mysql";
    private static String password = "password_mysql";
    
    /**
     * Inicia a conexão com o banco de dados caso seja nulo. 
     * Não é possível iniciar a conexão mais de uma vez.
     */
    public static void start() throws DBException {
        if (cnc == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                cnc = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                throw new DBException("Erro no carregamento do Driver MySQL: " + e.getMessage());
            } catch (SQLException e) {
                throw new DBException("Erro na conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
    
    /**
     * Retorna o banco de dados MySQL para utilizacao no DAO das entidades.
     * Caso o banco ainda não tenha tido sua conexão iniciada pelo método start(),
     * o banco é iniciado automaticamente.
     * @return O atributo Connection conn com a conexão
     */

    public static Connection getDB() throws DBException {
        if (cnc == null) {
            start();
        }
        return cnc;
    }
    
    /**
     * Realiza o fechamento da conexão com o banco de dados.
     * É importante utilizar este método quando não há mais uso do banco.
     */

    public static void close() {
        if (cnc != null) {
            try {
                cnc.close();
            } catch (SQLException e) {
                throw new DBException("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
    
    /**
     * Verifica se o banco de dados está fechado.
     * @return Retorna true caso esteja fechado.
     */

    public static boolean isClosed() throws SQLException {
        return cnc == null || cnc.isClosed();
    }
    
}

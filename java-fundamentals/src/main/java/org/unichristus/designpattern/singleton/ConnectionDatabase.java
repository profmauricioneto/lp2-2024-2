package org.unichristus.designpattern.singleton;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;

public class ConnectionDatabase {
    private static ConnectionDatabase instance = null;
    private Connection connection;
    private final String username = "root";
    private final String password = "root";
    private final String url = "jdbc:mysql://localhost:3306/testdb";

    private ConnectionDatabase() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url,
                    username, password);
            System.out.println("Conexão realizada com sucesso!");
        } catch (ClassNotFoundException e) {
            System.err.println("Conexão falhou. Erro: " +
                    e.getMessage());
        }
    }

    public static ConnectionDatabase getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConnectionDatabase();
        }
        return instance;
    }

    public static void main(String[] args) {
        ConnectionDatabase conn;
        try {
            conn = ConnectionDatabase.getInstance();
            System.out.println("Conexão singleton chamada...");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

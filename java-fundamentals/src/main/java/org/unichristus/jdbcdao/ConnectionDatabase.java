package org.unichristus.jdbcdao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDatabase {
    Properties prop = getProp();
    private Connection conn;

    public ConnectionDatabase() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = prop.getProperty("prop.server.user");
            String password = prop.getProperty("prop.server.password");
            String urlConnection = prop.getProperty("prop.server.url");
            conn = DriverManager.getConnection(urlConnection, username, password);
            System.out.println("Connection Success!");
        }catch (ClassNotFoundException e) {
            System.err.println("Failed in Connection.");
            System.err.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public static Properties getProp() {
        Properties props = new Properties();
        try {
            FileInputStream file = new FileInputStream("java-fundamentals/src/main/resources/config.properties");
            props.load(file);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return props;
    }
}

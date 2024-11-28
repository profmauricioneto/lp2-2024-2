package org.unichristus.jdbcdao;

import java.sql.*;

public class UserDAO {
    private Connection connection;

    public UserDAO() {
        try {
            ConnectionDatabase conn = new ConnectionDatabase();
            connection = conn.getConnection();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void addUser(User user) {
        String sql = "INSERT INTO user (name, email, address, createDate) VALUES (?,?,?,?)";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);

            state.setString(1, user.getName());
            state.setString(2, user.getEmail());
            state.setString(3, user.getAddress());
            state.setDate(4, new Date(user.getCreateDate().getTimeInMillis()));

            state.execute();
            state.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void showUsers() {
        String sql = "SELECT * FROM user";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            ResultSet result;
            result = state.executeQuery();
            while (result.next()) {
                System.out.println(" ");
                System.out.println("ID: " + result.getLong("id"));
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Email: " + result.getString("email"));
                System.out.println("Address: " + result.getString("address"));
                System.out.println("Create at: " + result.getString("createDate"));
                System.out.println(" -------- ");
            }
            result.close();
            state.close();
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }

    public void delete(long id) {
        String sql = "DELETE FROM user WHERE id = ?";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            state.setLong(1, id);
            int lines = state.executeUpdate();
            state.close();
            System.out.println("data deleted! Amount lines removed: " + lines);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(User user, long id) {
        String sql = "UPDATE user SET name = ?, email = ?, address = ?, createDate = ? WHERE id = ?";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            state.setString(1, user.getName());
            state.setString(2, user.getEmail());
            state.setString(3, user.getAddress());
            state.setDate(4, new Date(user.getCreateDate().getTimeInMillis()));
            state.setLong(5, id);
            state.execute();
            state.close();
            System.out.println("updated data");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

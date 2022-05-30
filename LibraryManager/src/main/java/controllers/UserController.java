/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.User;
import util.ConnectionFactory;

/**
 *
 * @author Femen
 */
public class UserController {

    public void save(User user) { // Insert user into the database
        String sql = "INSERT INTO users ("
            + "name,"
            + "phoneNumber,"
            + "fine) VALUES (?, ?, ?)";

        Connection conn = null;
        PreparedStatement statement = null;

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setString(1, user.getName());
            statement.setString(2, user.getPhoneNumber());
            statement.setFloat(3, user.getFine());
            
            statement.execute();

        } catch(Exception ex) {
            throw new RuntimeException("Error inserting the user into the database "
                         + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }

    }

    public void update(User user) { // Edit an user already in the database
        String sql = "UPDATE users SET "
                    + "name = ?,"
                    + "phoneNumber = ?,"
                    + "fine = ? "
                    + "WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setString(1, user.getName());
            statement.setString(2, user.getPhoneNumber());
            statement.setFloat(3, user.getFine());
            statement.setInt(4, user.getId());

            statement.execute();

        } catch(Exception ex) {
            throw new RuntimeException("Error updating the values", ex);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }

    }

    public User getById(int id) { // Get a single user specified by its id; Returns null if id not found
        String sql = "SELECT * FROM users WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = new User();

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            resultSet = statement.executeQuery();

            if(!resultSet.next()) { // If resultSet.next() returns false there is no user with the specified id
                return null;
            }

            user.setName(resultSet.getString("name"));
            user.setPhoneNumber(resultSet.getString("phoneNumber"));
            user.setFine(resultSet.getFloat("fine"));
            user.setId(resultSet.getInt("id"));

        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the user in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return user;
    }

    public List<User> getAll() { // Get all users registered in the database
        String sql = "SELECT * FROM users";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<User> users = new ArrayList<User>();

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                User user = new User();

                user.setName(resultSet.getString("name"));
                user.setPhoneNumber(resultSet.getString("phoneNumber"));
                user.setFine((resultSet.getFloat("fine")));
                user.setId(resultSet.getInt("id"));

                users.add(user);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the users in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return users;
    }

}

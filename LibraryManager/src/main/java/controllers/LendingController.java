/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Lending;
import util.ConnectionFactory;

/**
 *
 * @author Femen
 */
public class LendingController {

    public void save(Lending lending) { // Insert lending into the database
        String sql = "INSERT INTO lendings ("
            + "lendingDate,"
            + "returned,"
            + "bookId,"
            + "userId) VALUES (?, false, ?, ?)"; // A lending always start unreturned and with no return date

        Connection conn = null;
        PreparedStatement statement = null;

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setDate(1, new Date(lending.getLendingDate().getTime()));
            statement.setInt(2, lending.getBookId());
            statement.setInt(3, lending.getUserId());
            
            statement.execute();

        } catch(Exception ex) {
            throw new RuntimeException("Error inserting the lending into the database "
                         + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }

    }

    public void returnLending(int id) { // Set a lending as returned and register the return date as the date when the method was run
       String sql = "UPDATE lendings SET "
                    + "returned = true,"
                    + "returnDate = ? "
                    + "WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setDate(1, new Date(new java.util.Date().getTime()));
            statement.setInt(2, id);
            
            statement.execute();

        } catch(Exception ex) {
            throw new RuntimeException("Error updating the values", ex);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }

    }

    public List<Lending> getAllByBook(int bookId) { // Get all lendings of a given book
        String sql = "SELECT * FROM lendings WHERE bookId = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Lending> lendings = new ArrayList<Lending>();

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, bookId);

            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Lending lending = new Lending();

                lending.setLendingDate(resultSet.getDate("lendingDate"));
                lending.setReturned(resultSet.getBoolean("returned"));
                lending.setReturnDate(resultSet.getDate("returnDate"));
                lending.setBookId(resultSet.getInt("bookId"));
                lending.setUserId(resultSet.getInt("userId"));
                lending.setId(resultSet.getInt("id"));

                lendings.add(lending);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the lendings in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return lendings;
    }

    public List<Lending> getAllByUser(int userId) { // Get all lendings from a given user
        String sql = "SELECT * FROM lendings WHERE userId = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Lending> lendings = new ArrayList<Lending>();

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, userId);

            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Lending lending = new Lending();

                lending.setLendingDate(resultSet.getDate("lendingDate"));
                lending.setReturned(resultSet.getBoolean("returned"));
                lending.setReturnDate(resultSet.getDate("returnDate"));
                lending.setBookId(resultSet.getInt("bookId"));
                lending.setUserId(resultSet.getInt("userId"));
                lending.setId(resultSet.getInt("id"));

                lendings.add(lending);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the lendings in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return lendings;
    }

    public List<Lending> getAllPending() { // Get all lendings not already returned
        String sql = "SELECT * FROM lendings WHERE returned = false";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Lending> lendings = new ArrayList<Lending>();

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Lending lending = new Lending();

                lending.setLendingDate(resultSet.getDate("lendingDate"));
                lending.setReturned(resultSet.getBoolean("returned"));
                lending.setReturnDate(resultSet.getDate("returnDate"));
                lending.setBookId(resultSet.getInt("bookId"));
                lending.setUserId(resultSet.getInt("userId"));
                lending.setId(resultSet.getInt("id"));

                lendings.add(lending);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the lendings in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return lendings;
    }

    public List<Lending> getAll() { // Get all lendings registered in the database
        String sql = "SELECT * FROM lendings";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Lending> lendings = new ArrayList<Lending>();

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Lending lending = new Lending();

                lending.setLendingDate(resultSet.getDate("lendingDate"));
                lending.setReturned(resultSet.getBoolean("returned"));
                lending.setReturnDate(resultSet.getDate("returnDate"));
                lending.setBookId(resultSet.getInt("bookId"));
                lending.setUserId(resultSet.getInt("userId"));
                lending.setId(resultSet.getInt("id"));

                lendings.add(lending);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the lendings in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return lendings;
    }
    
    public Lending getByUserAndBook(int userId, int bookId) { // Return a pending lending specified by user and book; Return null if not found
        String sql = "SELECT * FROM lendings WHERE returned = FALSE AND userId = ? AND bookId = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Lending lending = new Lending();
        
        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, userId);
            statement.setInt(2, bookId);

            resultSet = statement.executeQuery();

            if(!resultSet.next()) {
                return null;
            }

            lending.setLendingDate(resultSet.getDate("lendingDate"));
            lending.setReturned(resultSet.getBoolean("returned"));
            lending.setReturnDate(resultSet.getDate("returnDate"));
            lending.setBookId(resultSet.getInt("bookId"));
            lending.setUserId(resultSet.getInt("userId"));
            lending.setId(resultSet.getInt("id"));

        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the lendings in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }
        
        return lending;
    }
    
    public List<Lending> getAllPendingByUser(int userId) { // Get all pending lendings from a given user
        String sql = "SELECT * FROM lendings WHERE userId = ? AND returned = FALSE";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Lending> lendings = new ArrayList<Lending>();

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, userId);

            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Lending lending = new Lending();

                lending.setLendingDate(resultSet.getDate("lendingDate"));
                lending.setReturned(resultSet.getBoolean("returned"));
                lending.setReturnDate(resultSet.getDate("returnDate"));
                lending.setBookId(resultSet.getInt("bookId"));
                lending.setUserId(resultSet.getInt("userId"));
                lending.setId(resultSet.getInt("id"));

                lendings.add(lending);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the lendings in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return lendings;
    }
    
    public int countUserPendingLendings(int userId) {
        String sql = "SELECT COUNT(*) FROM lendings WHERE returned = FALSE AND userId = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, userId);

            resultSet = statement.executeQuery();

            resultSet.next();
            return resultSet.getInt(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the lendings in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }
        
        return -1;
        
    }
    
    public int countBookPendingLendings(int bookId) {
        String sql = "SELECT COUNT(*) FROM lendings WHERE returned = FALSE AND bookId = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, bookId);

            resultSet = statement.executeQuery();

            resultSet.next();
            return resultSet.getInt(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the lendings in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }
        
        return -1;
        
    }

}

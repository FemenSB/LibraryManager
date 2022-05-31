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

import models.Book;
import util.ConnectionFactory;

/**
 *
 * @author Femen
 */
public class BookController {

    public void save(Book book) { // Insert book into the database
        String sql = "INSERT INTO books ("
            + "title,"
            + "authorName,"
            + "edition,"
            + "releaseDate,"
            + "copiesOwned) VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement statement = null;

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthorName());
            statement.setInt(3, book.getEdition());
            statement.setDate(4, new Date(book.getReleaseDate().getTime()));
            statement.setInt(5, book.getCopiesOwned());

            statement.execute();

        } catch(Exception ex) {
            throw new RuntimeException("Error inserting the book into the database "
                         + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }

    }

    public void update(Book book) { // Edit a book already in the database
        String sql = "UPDATE books SET "
                    + "title = ?,"
                    + "authorName = ?,"
                    + "edition = ?,"
                    + "releaseDate = ?,"
                    + "copiesOwned = ? "
                    + "WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthorName());
            statement.setInt(3, book.getEdition());
            statement.setDate(4, new Date(book.getReleaseDate().getTime()));
            statement.setInt(5, book.getCopiesOwned());
            statement.setInt(6, book.getId());

            statement.execute();

        } catch(Exception ex) {
            throw new RuntimeException("Error updating the values", ex);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }

    }

    public Book getById(int id) {  // Get a single book specified by its id; Returns null if id not found
        String sql = "SELECT * FROM books WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Book book = new Book();

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            resultSet = statement.executeQuery();

            if(!resultSet.next()) {// If resultSet.next() returns false there is no book with the specified id
                return null;
            }

            book.setTitle(resultSet.getString("title"));
            book.setAuthorName(resultSet.getString("authorName"));
            book.setEdition(resultSet.getInt("edition"));
            book.setReleaseDate(resultSet.getDate("releaseDate"));
            book.setCopiesOwned(resultSet.getInt("copiesOwned"));
            book.setId(resultSet.getInt("id"));

        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the book in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return book;
    }

    public List<Book> getAll() { // Get all books registered in the database
        String sql = "SELECT * FROM books";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Book> books = new ArrayList<Book>();

        try {

            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Book book = new Book();

                book.setTitle(resultSet.getString("title"));
                book.setAuthorName(resultSet.getString("authorName"));
                book.setEdition(resultSet.getInt("edition"));
                book.setReleaseDate(resultSet.getDate("releaseDate"));
                book.setCopiesOwned(resultSet.getInt("copiesOwned"));
                book.setId(resultSet.getInt("id"));

                books.add(book);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new SQLException("Error selecting the books in the database");
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return books;
    }

}

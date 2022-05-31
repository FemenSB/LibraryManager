/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.Date;

/**
 *
 * @author Femen
 */
public class Book {

    private String title;
    private String authorName;
    private int edition;
    private Date releaseDate;
    private int copiesOwned;
    private int id;

    public Book(String title, String authorName, int edition, Date releaseDate, int copiesOwned, int id) {
        this.title = title;
        this.authorName = authorName;
        this.edition = edition;
        this.releaseDate = releaseDate;
        this.copiesOwned = copiesOwned;
        this.id = id;
    }

    public Book(String title, String authorName, int edition, Date releaseDate, int copiesOwned) {
        this.title = title;
        this.authorName = authorName;
        this.edition = edition;
        this.releaseDate = releaseDate;
        this.copiesOwned = copiesOwned;
    }

    public Book() {

    }

    // -=-=-=-=-=-=-=-=-= Getters =-=-=-=-=-=-=-=-=-

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getEdition() {
        return edition;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getCopiesOwned() {
        return copiesOwned;
    }

    public int getId() {
        return id;
    }

    // -=-=-=-=-=-=-=-=-= Setters =-=-=-=-=-=-=-=-=-

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setCopiesOwned(int copiesOwned) {
        this.copiesOwned = copiesOwned;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return title;
    }
    
}

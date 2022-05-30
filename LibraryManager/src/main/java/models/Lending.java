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
public class Lending {

    private Date lendingDate;
    private boolean returned;
    private Date returnDate;
    private int bookId;
    private int userId;
    private int id;

    public Lending(Date lendingDate, boolean returned, Date returnDate, int bookId, int userId, int id) {
        this.lendingDate = lendingDate;
        this.returned = returned;
        this.returnDate = returnDate;
        this.bookId = bookId;
        this.userId = userId;
        this.id = id;
    }

    public Lending(int bookId, int userId) {
        this.bookId = bookId;
        this.userId = userId;
        lendingDate = new Date();
        returned = false;
    }

    public Lending() {

    }

    // -=-=-=-=-=-=-=-=-= Getters =-=-=-=-=-=-=-=-=-

    public Date getLendingDate() {
        return lendingDate;
    }

    public boolean getReturned() {
        return returned;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public int getBookId() {
        return bookId;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
}

    // -=-=-=-=-=-=-=-=-= Setters =-=-=-=-=-=-=-=-=-

    public void setLendingDate(Date lendingDate) {
        this.lendingDate = lendingDate;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author Femen
 */
public class User {

    private String name;
    private String phoneNumber;
    private float fine;
    private int id;

    public User(String name, String phoneNumber, float fine, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.fine = fine;
        this.id = id;
    }

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        fine = 0.0f;
    }

    public User() {

    }

    // -=-=-=-=-=-=-=-=-= Getters =-=-=-=-=-=-=-=-=-

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public float getFine() {
        return fine;
    }
    
    public int getId() {
        return id;
    }

    // -=-=-=-=-=-=-=-=-= Setters =-=-=-=-=-=-=-=-=-

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFine(float fine) {
        this.fine = fine;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Femen
 */
public final class Settings {
    
    private static int lendingTime = 7;
    private static float fine = 0.25f;
    
    public static int getLendingTime() {
        return lendingTime;
    }

    public static float getFine() {
        return fine;
    }

    public static void setLendingTime(int lendingTime) {
        Settings.lendingTime = lendingTime;
    }

    public static void setFine(float fine) {
        Settings.fine = fine;
    }
   
    private Settings() {
        
    }
    
    
}

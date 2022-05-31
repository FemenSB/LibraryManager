/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.cellRenderers;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import models.Lending;
import util.Settings;
import util.tableModels.UsersLendingHistoryTableModel;

/**
 *
 * @author Femen
 */
public class UserLendingDatesCellRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, column);
        
        label.setHorizontalAlignment(CENTER);
        
        UsersLendingHistoryTableModel tableModel = (UsersLendingHistoryTableModel) table.getModel(); // Get the lending
        Lending lending = tableModel.getLendingByIndex(row);
        
        if(lending.getReturned()) { // If the book was returned, check if it was returned in the correct time
            if(lending.getReturnDate().getTime() >
               lending.getLendingDate().getTime() + ((long) Settings.getLendingTime() * 8640000)) {
                label.setBackground(Color.RED);
                return label;
            }
            // If it was returned in the correct time:
            label.setBackground(Color.GREEN);
            return label;
        }
        
        // If the book wasn't returned yet, check if the lending occured more than the lending time ago
        // Calculate the time since the lending date
        Date today = new Date();
        long time = today.getTime() - lending.getLendingDate().getTime();
        int days = (int) (time / 86400000);
        
        if(days > Settings.getLendingTime()) { 
            label.setBackground(Color.RED);
        } else { // If lending is not delayed
            label.setBackground(Color.YELLOW);
        }
        
        return label;
    }
    
}
